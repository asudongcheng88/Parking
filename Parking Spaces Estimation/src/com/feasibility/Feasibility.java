package com.feasibility;

import javax.swing.JRadioButton;

public class Feasibility {
	
	public int trafficFlow(String choice){
		
		int point = 0;
		
		if(choice.equalsIgnoreCase("low")){
			
			point = 3;
			
		}else if(choice.equalsIgnoreCase("medium")){
			
			point = 2;
			
		}else if(choice.equalsIgnoreCase("high")){
			point = 1;
		}
		
		return point;
	}
	
	public int expandAbility(String choice){
		
		int point = 0;
		
		if(choice.equalsIgnoreCase("yes")){
			
			point = 2;
			
		}else if(choice.equalsIgnoreCase("no")){
			
			point = 1;
			
		}
		
		return point;
		
	}
	
	public int roadWayAccess(String choice){
		
		int point = 0;
		
		if(choice.equalsIgnoreCase("easy")){
			
			point = 2;
			
		}else if(choice.equalsIgnoreCase("hard")){
			
			point = 1;
			
		}
		
		return point;
		
	}
	
	public int locationComplexity(String choice){
		
		int point = 0;
		
		if(choice.equalsIgnoreCase("easy")){
			
			point = 3;
			
		}else if(choice.equalsIgnoreCase("medium")){
			
			point = 2;
			
		}else if(choice.equalsIgnoreCase("high")){
			point = 1;
		}
		
		return point;
	}
	
	public String getTraffic(JRadioButton trafficLow, JRadioButton trafficMed, JRadioButton trafficHigh){
		
		String trafficChoice = "";
		
		if(trafficLow.isSelected()){
			
			trafficChoice = trafficLow.getText();
			
		}else if(trafficMed.isSelected()){
			
			trafficChoice = trafficMed.getText();
			
		}else if(trafficHigh.isSelected()){
			
			trafficChoice = trafficHigh.getText();
		}
		
		return trafficChoice;
	}
	
	public String getExpand(JRadioButton expYes, JRadioButton expNo){
		
		String expendChoice = "";
		
		if(expYes.isSelected()){
			
			expendChoice = expYes.getText();
			
		}else if(expNo.isSelected()){
			
			expendChoice = expNo.getText();
			
		}
		
		return expendChoice;
	}
	
	public String getAccess(JRadioButton accessEasy, JRadioButton accessHard){
		
		String accessChoice = "";
		
		if(accessEasy.isSelected()){
			
			accessChoice = accessEasy.getText();
			
		}else if(accessHard.isSelected()){
			
			accessChoice = accessHard.getText();
		}
		
		return accessChoice;
		
	}
	
	public String getLocation(JRadioButton locEasy, JRadioButton locMed, JRadioButton locHigh){
		
		String locChoice = "";
		
		if(locEasy.isSelected()){
			
			locChoice = locEasy.getText();
			
		}else if(locMed.isSelected()){
			
			locChoice = locMed.getText();
			
		}else if(locHigh.isSelected()){
			
			locChoice = locHigh.getText();
		}
		
		return locChoice;
		
	}
	

}
