package com.diagonal;

import com.area.Area;
import com.road.Road;

public class DiagonalAndParallel {
	
	public double diagonalParkingSize(double parkingSpaceLength, double parkingSpaceWidth){
		
		double size = 0;
		
		size = parkingSpaceWidth * parkingSpaceLength;
		
		return size;
	}
	
	
	public int rowParkingSpaceWithExitEnter(double areaWidth, double parkingSpaceLength, double parkingSpaceWidth, int totalExitEnter){
		
		Area area = new Area();
		Road road = new Road();
		
		int parkingSpaces = 0;
		
		double enterExitWay = road.enterExitWay(totalExitEnter);
		
		double parkingSpaceSize = diagonalParkingSize(parkingSpaceLength, parkingSpaceWidth);
		double areaSize = area.parkingLotArea(parkingSpaceLength, areaWidth - enterExitWay) ;
		
		parkingSpaces = (int) (areaSize / parkingSpaceSize);
		
		return parkingSpaces;
		
		
	}
	
	public int oneRowParkingSpace(double areaWidth, double parkingSpaceLength, double parkingSpaceWidth){
		
		Area area = new Area();
		
		int parkingSpaces = 0;
		
		double parkingSpaceSize = diagonalParkingSize(parkingSpaceLength, parkingSpaceWidth);
		double areaSize = area.parkingLotArea(parkingSpaceLength, areaWidth);
		
		parkingSpaces = (int) (areaSize / parkingSpaceSize);
		
		return parkingSpaces;
		
		
	}
	
	
	public boolean haveMoreAreaForSingleRow(double balanceLength, double parkingSpaceLength, double roadWidth){
		
		boolean haveArea = false;
		
		if(balanceLength >= (parkingSpaceLength + roadWidth)){
			haveArea = true;
		}
		
		return haveArea;
	}
	
	public boolean haveMoreAreaForDoubleRow(double balanceLength, double parkingSpaceLength, double roadWidth){
		
		boolean haveArea = false;
		
		if(balanceLength >= (parkingSpaceLength* 2 + roadWidth)){
			haveArea = true;
		}
		
		return haveArea;
	}
	
	
	public int recursiveInnerDoubleSpace(double balanceLength,double areaWidth, double parkingSpaceLength,double parkingSpaceWidth, double roadWidth){

		double doubleSpaceLength = (parkingSpaceLength*2) + roadWidth;
		
		if(balanceLength < doubleSpaceLength){
			
			return 0;
			
		}else{
			
			areaWidth = areaWidth - (roadWidth*2);
			balanceLength = balanceLength - doubleSpaceLength;
			
			return (oneRowParkingSpace(areaWidth, parkingSpaceLength, parkingSpaceWidth)*2) + recursiveInnerDoubleSpace(balanceLength,areaWidth, parkingSpaceLength,parkingSpaceWidth, roadWidth);
			
		}
		
		
	}
	
	
	public int totalParkingSpaces(double areaLength, double areaWidth, double parkingSpaceLength, double parkingSpaceWidth, double roadWidth, int totalExitEnter){
		
		int parkingSpaces = 0;
		
		Area area = new Area();
		
		double minLength = parkingSpaceLength + roadWidth;					//min length with road
		
		if(areaLength >= minLength){
			
			parkingSpaces = oneRowParkingSpace(areaWidth, parkingSpaceLength, parkingSpaceWidth);		//count parking spaces
			
			double balanceLength = area.areaLengthBalance(areaLength, minLength);					//balance length after first insert first row
			
			if(balanceLength >= parkingSpaceLength){
				
				parkingSpaces = parkingSpaces + rowParkingSpaceWithExitEnter(areaWidth, parkingSpaceLength, parkingSpaceWidth, totalExitEnter);			//add count parking spaces 
				
				balanceLength = balanceLength - parkingSpaceLength;
				
				boolean moreDoubleArea = haveMoreAreaForDoubleRow(balanceLength, parkingSpaceLength, roadWidth);				//check if got enough space for double space in the middle plus with road
				
				boolean moreSingleArea = haveMoreAreaForSingleRow(balanceLength, parkingSpaceLength, roadWidth);
				
				if(moreDoubleArea){
					
					int doubleSpace = recursiveInnerDoubleSpace(balanceLength, areaWidth, parkingSpaceLength, parkingSpaceWidth, roadWidth);
					
					parkingSpaces = parkingSpaces + doubleSpace;
					

				}else{
					
					if(moreSingleArea){
						
						areaWidth = areaWidth - (roadWidth*2);
						
						parkingSpaces = parkingSpaces + oneRowParkingSpace(areaWidth, parkingSpaceLength, parkingSpaceWidth);
						
					}	
				}			
			}
			
		}else{
			System.out.println("You cannot have parking spaces");
		}
		
		return parkingSpaces;
	}
}
