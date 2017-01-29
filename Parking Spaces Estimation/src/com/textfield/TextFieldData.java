package com.textfield;


import com.area.Area;

public class TextFieldData {
	
	public String getTextFieldData(String areaWidthText, String areaLengthText, String areaText, String angleText){
		
		Area areaClass = new Area();
		
		String bigString = "";
		String areaWidth = "";
		String areaLength = "";
		String degree = "";
		
		if(!areaWidthText.isEmpty() && !areaLengthText.isEmpty() && !areaText.isEmpty()){
			
			bigString = "all inserted";
			
		}else if(angleText.isEmpty()){
			
			bigString = "no angle";
			
		}else if(!areaWidthText.isEmpty() && !areaLengthText.isEmpty()){
			
			areaWidth = areaWidthText;
			areaLength = areaLengthText;
			degree = angleText;
			
			bigString = areaWidth + " " + areaLength + " " +degree;

			
		}else if((!areaWidthText.isEmpty() || !areaLengthText.isEmpty()) && !areaText.isEmpty()){
			
			double area = Double.parseDouble(areaText);
			double width = 0;
			
			if(!areaWidthText.isEmpty()){
				
				width = Double.parseDouble(areaWidthText);
				
			}else if(!areaLengthText.isEmpty()){
				
				width = Double.parseDouble(areaLengthText);
				
			}
			
			degree = angleText;
			
			String widthLength = areaClass.calculateWidthLength(area, width);			//get length and width based on area and parameter
			
			
			
			bigString = widthLength + " " + degree; 
			
			
		}
		
		
		
		return bigString;
		
	}

}
