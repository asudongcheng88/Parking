package com.area;




public class Area {
	
	public double parkingLotArea(double areaLength, double areaWidth){
		
		double area = 0;
		
		area = areaLength * areaWidth;
		
		return area;
	}
	
	
	public double areaLengthBalance(double areaLength, double parkingSpaceLength){
		
		double balance = 0;
				
		balance = areaLength - parkingSpaceLength;		
				
		return balance;
	}
	
	public double areaWidthBalance(double areaWidth, double parkingSpaceLength){
		
		double balance = 0;
		
		balance = areaWidth - parkingSpaceLength;		
				
		return balance;
	}
	
	public String calculateWidthLength(double area, double width){
		
		String data = "";
		String lengthString = "";
		String widthString = "";
		
		double length = 0;
		
		length = (area - (2 * width)) / 2;
		
		if(width >= length){
			
			widthString = Double.toString(width);
			lengthString = Double.toString(length);
			
		}else{
			
			widthString = Double.toString(length);
			lengthString = Double.toString(width);
			
		}
		
		data = widthString + " " + lengthString;
		
		//System.out.println(width);
		//System.out.println(length);
		
		return data;
	}

}
