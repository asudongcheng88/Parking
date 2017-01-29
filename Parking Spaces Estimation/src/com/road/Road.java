package com.road;

import javax.swing.JRadioButton;

public class Road {
	
	public double diagonalRoadWidth(String roadType){
		
		double roadWidth = 0;
		
		if(roadType.equalsIgnoreCase("one way")){
			
			roadWidth = 6.0;
			
		}else if(roadType.equalsIgnoreCase("two way")){
			
			roadWidth = 6.6;
			
		}
				
		return roadWidth;
	}
	
	public double parallelRoadWidth(String roadType){
		
		double roadWidth = 0;
		
		if(roadType.equalsIgnoreCase("one way")){
			
			roadWidth = 3.6;
			
		}else if(roadType.equalsIgnoreCase("two way")){
			
			roadWidth = 6.0;
			
		}
				
		return roadWidth;
	}
	
	public double perpenRoadWidth(String roadType){
		
		double roadWidth = 0;
		
		if(roadType.equalsIgnoreCase("one way")){
			
			roadWidth = 6.0;
			
		}else if(roadType.equalsIgnoreCase("two way")){
			
			roadWidth = 6.6;
			
		}
				
		return roadWidth;
	}
	
	public double enterExitWay(int totalExitEnter){
		
		double size = 0;
		
		double oneRoadSize = 4;
		
		size = totalExitEnter * oneRoadSize;
		
		return size;
				
	}
	
	public String getSelectedRoad(JRadioButton rdbtnOneWay, JRadioButton rdbtnTwoWay){
		
		String roadType = "";
		
		if(rdbtnOneWay.isSelected()){
			
			roadType = rdbtnOneWay.getText();
			
			
		}else if(rdbtnTwoWay.isSelected()){
			
			roadType = rdbtnTwoWay.getText();
			
			
		}
		
		return roadType;
		
	}
	

}
