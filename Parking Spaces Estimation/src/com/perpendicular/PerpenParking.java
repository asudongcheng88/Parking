package com.perpendicular;

import com.area.Area;
import com.road.Road;

public class PerpenParking {
	
	//minimum area length for one row of parking spaces
	
	public double parkingSpaceLength(double degree, double parkingSpaceLength, double parkingSpaceWidth ){
		
		double areaLength = 0;
		
		double hipotenus = getHipotenusLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		areaLength = hipotenus * (Math.cos( Math.toRadians( degree )));
		
		//System.out.println(Math.cos(Math.toRadians(degree)));
		//Math.toRadians
		
		return areaLength;
	}
	
	public double getHipotenusLength(double degree, double parkingSpaceLength, double parkingSpaceWidth){
		
		double hipotenus = 0;
		
		double tetha2 = 90 - degree;
		
		double x5 = parkingSpaceWidth/(Math.tan( Math.toRadians( tetha2 ) ));
		
		hipotenus = parkingSpaceLength + x5;
		
		return hipotenus;
		
	}
	
	public double firstPerpenParkingSize(double degree, double parkingSpaceLength, double parkingSpaceWidth){
		
		double parkingSpaceSize = 0;
		
		double hipotenus = getHipotenusLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double x1 = hipotenus * (Math.sin( Math.toRadians( degree ) ));
		
		double x2 = (parkingSpaceWidth / Math.cos( Math.toRadians( degree )));
		
		double x3 = x1 + x2;
		
		//double areaLength = getAreaLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double areaLength = parkingSpaceLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		
		parkingSpaceSize = x3 * areaLength;
		/*
		System.out.println("hipotenus = "+hipotenus);
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		System.out.println("areaWidth = "+x3);
		System.out.println("areaLength = "+areaLength);
		*/
		return parkingSpaceSize;
		
	}
	
	public double theRestPerpenParkingSize(double degree, double parkingSpaceLength, double parkingSpaceWidth){
		
		double size = 0;
		
		PerpenParking perpenPark = new PerpenParking();
		
		double x4 = (parkingSpaceWidth / Math.cos( Math.toRadians( degree )));
		
		double areaLength = perpenPark.parkingSpaceLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		size = areaLength * x4;
				
		return size;
		
	}
	
	public int oneAreaTotalParking(double degree, double parkingSpaceLength, double parkingSpaceWidth, double areaWidth ){
		
		int totalParking = 0;
		
		Area area = new Area();
		
		double areaParkingSpaceLength = parkingSpaceLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double perpenSqftArea = area.parkingLotArea(areaParkingSpaceLength, areaWidth);
		
		double firstPerpenParking = firstPerpenParkingSize(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double theRestPerpenParkSize = theRestPerpenParkingSize(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double remainingArea = perpenSqftArea - firstPerpenParking;
		
		if(remainingArea >= 0){
			
			totalParking = (int) (remainingArea/theRestPerpenParkSize + 1);	
			
		}else{
			
			totalParking = 1;
		}
		
		return totalParking;
	}
	
	public int recursiveInnerDoubleSpace(double degree, double parkingSpaceLength, double parkingSpaceWidth, double balanceAreaLength, double balanceAreaWidth, double roadWidth){
		
		int totalParking = 0;		
		
		double minRecursiveLength = parkingSpaceLength(degree, parkingSpaceLength, parkingSpaceWidth ) * 2 + roadWidth;
		
		if(balanceAreaLength < minRecursiveLength){
			
			return 0;
		}else{
			
			
			totalParking = oneAreaTotalParking(degree, parkingSpaceLength, parkingSpaceWidth, balanceAreaWidth ) * 2;
			
			balanceAreaLength = balanceAreaLength - (parkingSpaceLength * 2 + roadWidth);
			
			return totalParking + recursiveInnerDoubleSpace(degree, parkingSpaceLength, parkingSpaceWidth, balanceAreaLength, balanceAreaWidth, roadWidth);
			
		}
		
	
	}
	
	public int perpenTotalParking(double degree, double parkingSpaceLength, double parkingSpaceWidth, double areaLength, double areaWidth, double roadWidth, int totalExitEnter){
		
		int totalParking = 0;
		
		Road road = new Road();
		
		double areaParkingSpaceLength = parkingSpaceLength(degree, parkingSpaceLength, parkingSpaceWidth);
		
		double minLength = areaParkingSpaceLength + roadWidth;
		
		if(areaLength >= minLength){
			
			totalParking = oneAreaTotalParking( degree, parkingSpaceLength, parkingSpaceWidth, areaWidth );
			
			areaLength = areaLength - minLength;
			
			if(areaLength >= areaParkingSpaceLength){
				
				double areaWidthMinusExitenter = areaWidth - road.enterExitWay(totalExitEnter);
				
				totalParking = totalParking + oneAreaTotalParking( degree, parkingSpaceLength, parkingSpaceWidth, areaWidthMinusExitenter );
				
				double balanceAreaLength = areaLength - areaParkingSpaceLength;
				
				double balanceAreaWidth = areaWidth - (roadWidth*2);
				
				double innerMinLength = areaParkingSpaceLength * 2 + roadWidth;
				
				if(balanceAreaLength >= innerMinLength){
					
					totalParking = totalParking + recursiveInnerDoubleSpace(degree, parkingSpaceLength, parkingSpaceWidth, balanceAreaLength, balanceAreaWidth, roadWidth);
					
				}else if(balanceAreaLength >= minLength){
					
					totalParking = totalParking + oneAreaTotalParking( degree, parkingSpaceLength, parkingSpaceWidth, areaWidth );
					
				}
				
			}
			
		}else{
			
			System.out.println("You cannot have parking spaces");
		}
		
		
		return totalParking;
	}
}
