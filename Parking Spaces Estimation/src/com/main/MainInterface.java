package com.main;

import javax.swing.*;


import com.diagonal.DiagonalAndParallel;
import com.feasibility.Feasibility;
import com.perpendicular.PerpenParking;
import com.road.Road;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserType;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import com.textfield.TextFieldData;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface {
	
	private JFrame frmP;
	private JTextField areaWidthField;
	private JTextField areaLengthField;
	private JTextField areaField;
	private JLabel lblTotalParking;
	private JLabel lblParallel;
	private JLabel lblNewLabel;
	private JLabel lblPerpendicular;
	private JTextField perpenField;
	private JTextField diagonalField;
	private JTextField parallelField;
	private JLabel lblCampusTrafficFlow;
	private JLabel lblExpansionCpabality;
	private JLabel lblAccessFromRoadway;
	private JLabel lblLocationComplexity;
	private JRadioButton trafficLow;
	private JRadioButton trafficMed;
	private JRadioButton trafficHigh;
	private JRadioButton expYes;
	private JRadioButton expNo;
	private JRadioButton accessEasy;
	private JRadioButton accessHard;
	private JRadioButton locEasy;
	private JRadioButton locMed;
	private JRadioButton locHigh;
	private JLabel lblTotal;
	private JTextField angleField;
	private JButton btnPark;
	private JLabel lblNewLabel_1;
	private JLabel lblTypeOfRoad;
	private JRadioButton rdbtnOneWay;
	private JRadioButton rdbtnTwoWay;
	private JLabel lblEnterWay;
	private JLabel lblExitWay;
	@SuppressWarnings("rawtypes")
	private JComboBox enterComboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox exitComboBox;
	private JLabel lblangleIsFor;
	@SuppressWarnings("unused")
	private JPanel googlePanel;
	private JLabel lblFeasibility;
	private JLabel feaTotalPoint;
	private JTextField parallelField1;
	private JTextField diagonalField1;
	private JTextField perpenField1;
	private JLabel label_7;
	private JTextField angleField1;
	private JLabel lblangleIsFor_1;
	private JTextField areaWidthField1;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField areaLengthField1;
	private JTextField areaField1;
	private JLabel label_11;
	private JLabel label_13;
	private JRadioButton rdbtnOneWay1;
	private JRadioButton rdbtnTwoWay1;
	@SuppressWarnings("rawtypes")
	private JComboBox enterComboBox1;
	private JLabel label_14;
	private JLabel label_15;
	@SuppressWarnings("rawtypes")
	private JComboBox exitComboBox1;
	private JLabel label_16;
	private JLabel label_17;
	private JRadioButton trafficLow1;
	private JRadioButton trafficMed1;
	private JRadioButton trafficHigh1;
	private JRadioButton expNo1;
	private JRadioButton expYes1;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JRadioButton accessEasy1;
	private JRadioButton accessHard1;
	private JRadioButton locEasy1;
	private JRadioButton locMed1;
	private JRadioButton locHigh1;
	private JLabel lblUserOption;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frmP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainInterface() {
		initialize();
		
		/**Option 1**/
		
		RoadGroupRdBtn();
		trafficGroupRdBtn();
		expGroupRdBtn();
		accessGroupRdBtn();
		locGroupRdBtn();
		
		
		/**Option 2**/
		
		
		RoadGroupRdBtn1();
		trafficGroupRdBtn1();
		expGroupRdBtn1();
		accessGroupRdBtn1();
		locGroupRdBtn1();
		
		
		//GoogleMapFrame();
		
	}

	/**
	 * Initialise the contents of the frame.
	 */
	
	/** For option 1 **/
	
	private void RoadGroupRdBtn() {

		ButtonGroup bg1 = new ButtonGroup();

		bg1.add(rdbtnOneWay);
		bg1.add(rdbtnTwoWay);

	}
	
	private void trafficGroupRdBtn(){
		
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(trafficLow);
		bg.add(trafficMed);
		bg.add(trafficHigh);
		
	}
	
	private void expGroupRdBtn(){
		ButtonGroup bg = new ButtonGroup();
		bg.add(expYes);
		bg.add(expNo);
		
	}
	
	private void accessGroupRdBtn(){
		
		ButtonGroup bg = new ButtonGroup();

		bg.add(accessEasy);
		bg.add(accessHard);

	}
	
	public void locGroupRdBtn(){
		ButtonGroup bg = new ButtonGroup();
		bg.add(locEasy);
		bg.add(locMed);
		bg.add(locHigh);

	}
	
	
	/** For option 2 **/
	
	
	private void RoadGroupRdBtn1() {

		ButtonGroup bg1 = new ButtonGroup();

		bg1.add(rdbtnOneWay1);
		bg1.add(rdbtnTwoWay1);

	}
	
	private void trafficGroupRdBtn1(){
		
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(trafficLow1);
		bg.add(trafficMed1);
		bg.add(trafficHigh1);
		
	}
	
	private void expGroupRdBtn1(){
		ButtonGroup bg = new ButtonGroup();
		bg.add(expYes1);
		bg.add(expNo1);
		
	}
	
	private void accessGroupRdBtn1(){
		
		ButtonGroup bg = new ButtonGroup();

		bg.add(accessEasy1);
		bg.add(accessHard1);

	}
	
	public void locGroupRdBtn1(){
		ButtonGroup bg = new ButtonGroup();
		bg.add(locEasy1);
		bg.add(locMed1);
		bg.add(locHigh1);

	}
	
	/*
	private void GoogleMapFrame(){
		
		Browser browser = new Browser(BrowserType.LIGHTWEIGHT);
        BrowserView view = new BrowserView(browser);
        browser.loadURL("https://www.google.com.my/maps/@2.2319155,102.294251,12z?hl=en");

        JInternalFrame internalFrame = new JInternalFrame("Maps", true);
        internalFrame.setContentPane(view);
        internalFrame.setLocation(262, 73);
        internalFrame.setSize(796, 365);
        internalFrame.setVisible(true);
        internalFrame.setMaximizable(false);
        //return internalFrame;
		
		frmP.getContentPane().add(internalFrame);    
		
		JLabel lblNewLabel_2 = new JLabel("Estimate parking area here");
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(530, 443, 280, 31);
		frmP.getContentPane().add(lblNewLabel_2);
	}
	*/
    
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		
		frmP = new JFrame();
		frmP.getContentPane().setBackground(new Color(245, 245, 245));
		frmP.getContentPane().setForeground(new Color(0, 0, 51));
		frmP.setTitle("PARKING SPACE ESTIMATION SOFTWARE");
		frmP.setBounds(100, 100, 1366, 768);
		frmP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmP.getContentPane().setLayout(null);
		
		
		
		JLabel lblWidth = new JLabel("Width ");
		lblWidth.setBounds(50, 147, 46, 14);
		frmP.getContentPane().add(lblWidth);
		
		JLabel areaLengthLabel1 = new JLabel("Length ");
		areaLengthLabel1.setBounds(50, 175, 46, 14);
		frmP.getContentPane().add(areaLengthLabel1);
		
		JLabel lblArea = new JLabel("Area ");
		lblArea.setBounds(50, 270, 46, 14);
		frmP.getContentPane().add(lblArea);
		
		areaWidthField = new JTextField();
		areaWidthField.setBounds(151, 144, 86, 20);
		frmP.getContentPane().add(areaWidthField);
		areaWidthField.setColumns(10);
		
		areaLengthField = new JTextField();
		areaLengthField.setBounds(151, 172, 86, 20);
		frmP.getContentPane().add(areaLengthField);
		areaLengthField.setColumns(10);
		
		areaField = new JTextField();
		areaField.setBounds(151, 267, 86, 20);
		frmP.getContentPane().add(areaField);
		areaField.setColumns(10);
		
		lblTotalParking = new JLabel("Total Parking ");
		lblTotalParking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalParking.setBounds(489, 515, 133, 23);
		frmP.getContentPane().add(lblTotalParking);
		
		lblParallel = new JLabel("Parallel :");
		lblParallel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParallel.setBounds(446, 549, 67, 23);
		frmP.getContentPane().add(lblParallel);
		
		lblNewLabel = new JLabel("Diagonal :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(446, 583, 88, 20);
		frmP.getContentPane().add(lblNewLabel);
		
		lblPerpendicular = new JLabel("Perpendicular :");
		lblPerpendicular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerpendicular.setBounds(446, 614, 109, 17);
		frmP.getContentPane().add(lblPerpendicular);
		
		perpenField = new JTextField();
		perpenField.setBounds(565, 585, 86, 20);
		frmP.getContentPane().add(perpenField);
		perpenField.setColumns(10);
		
		diagonalField = new JTextField();
		diagonalField.setBounds(565, 612, 86, 20);
		frmP.getContentPane().add(diagonalField);
		diagonalField.setColumns(10);
		
		parallelField = new JTextField();
		parallelField.setBounds(565, 552, 86, 20);
		frmP.getContentPane().add(parallelField);
		parallelField.setColumns(10);
		
		feaTotalPoint = new JLabel("Result here");
		feaTotalPoint.setBounds(262, 703, 85, 33);
		frmP.getContentPane().add(feaTotalPoint);
		
		lblCampusTrafficFlow = new JLabel("Campus traffic flow :");
		lblCampusTrafficFlow.setBounds(50, 513, 152, 14);
		frmP.getContentPane().add(lblCampusTrafficFlow);
		
		lblExpansionCpabality = new JLabel("Expansion capabality :");
		lblExpansionCpabality.setBounds(50, 549, 152, 14);
		frmP.getContentPane().add(lblExpansionCpabality);
		
		lblAccessFromRoadway = new JLabel("Access from roadway network :");
		lblAccessFromRoadway.setBounds(50, 583, 187, 14);
		frmP.getContentPane().add(lblAccessFromRoadway);
		
		lblLocationComplexity = new JLabel("Location complexity :");
		lblLocationComplexity.setBounds(50, 615, 152, 14);
		frmP.getContentPane().add(lblLocationComplexity);
		
		trafficLow = new JRadioButton("Low");
		trafficLow.setSelected(true);
		trafficLow.setBounds(248, 504, 54, 33);
		frmP.getContentPane().add(trafficLow);
		
		trafficMed = new JRadioButton("Medium");
		trafficMed.setBounds(304, 504, 71, 33);
		frmP.getContentPane().add(trafficMed);
		
		trafficHigh = new JRadioButton("High");
		trafficHigh.setBounds(377, 504, 57, 33);
		frmP.getContentPane().add(trafficHigh);
		
		expYes = new JRadioButton("Yes");
		expYes.setSelected(true);
		expYes.setBounds(248, 540, 54, 33);
		frmP.getContentPane().add(expYes);
		
		expNo = new JRadioButton("No");
		expNo.setBounds(304, 540, 54, 33);
		frmP.getContentPane().add(expNo);
		
		accessEasy = new JRadioButton("Easy");
		accessEasy.setSelected(true);
		accessEasy.setBounds(248, 576, 54, 29);
		frmP.getContentPane().add(accessEasy);
		
		accessHard = new JRadioButton("Hard");
		accessHard.setBounds(304, 574, 57, 33);
		frmP.getContentPane().add(accessHard);
		
		locEasy = new JRadioButton("Easy");
		locEasy.setSelected(true);
		locEasy.setBounds(248, 606, 54, 33);
		frmP.getContentPane().add(locEasy);
		
		locMed = new JRadioButton("Medium");
		locMed.setBounds(304, 606, 71, 33);
		frmP.getContentPane().add(locMed);
		
		locHigh = new JRadioButton("High");
		locHigh.setBounds(377, 606, 57, 33);
		frmP.getContentPane().add(locHigh);
		
		lblTotal = new JLabel("Feasibility result");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(250, 672, 165, 20);
		frmP.getContentPane().add(lblTotal);
		
		angleField = new JTextField();
		angleField.setColumns(10);
		angleField.setBounds(151, 206, 86, 20);
		frmP.getContentPane().add(angleField);
		
		JLabel lblAngle = new JLabel("Angle");
		lblAngle.setBounds(50, 209, 46, 14);
		frmP.getContentPane().add(lblAngle);
		
		btnPark = new JButton("Estimate");
		btnPark.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DiagonalAndParallel diagonalParallel = new DiagonalAndParallel();
				PerpenParking perpenPark = new PerpenParking();
				Road road = new Road();
				Feasibility fea = new Feasibility();
				TextFieldData textFieldData = new TextFieldData();
				
				double areaWidth = 0;
				double areaLength = 0;
				double degree = 0;
				
				double diagonalRoadSize = 0;
				double parallelRoadSize = 0;
				double perpenRoadSize = 0;
				
				String roadType = "";
				String trafficChoice = "";
				String expendChoice = "";
				String accessChoice = "";
				String locChoice = "";
				
				
				/**Diagonal parking size**/
				
				double diagParkingSpaceWidth = 2.4;
				double diagParkingSpaceLength = 4.8;
				
				/**Parallel parking size**/
				
				double paraParkingSpaceWidth = 2.4;
				double paraParkingSpaceLength = 5.4;
				
				/**Perpendicular parking size**/
				
				double perpenParkingSpaceWidth = 2.4;
				double perpenParkingSpaceLength = 4.8;
				
				String areaWidthText = areaWidthField.getText();
				String areaLengthText = areaLengthField.getText();
				String angleText = angleField.getText();
				String areaText = areaField.getText();
				
				String fieldData = textFieldData.getTextFieldData(areaWidthText, areaLengthText, areaText, angleText);
				
				
				
				if(fieldData.isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Please insert data");
					
					
				}else if(fieldData.equalsIgnoreCase("all inserted")){
					
					JOptionPane.showMessageDialog(null, "You can only choose to insert width and length manually or get area and parameter from map");
					
				}else if(fieldData.equalsIgnoreCase("no angle")){
					
					JOptionPane.showMessageDialog(null, "Please insert angle");
					
				}else{
					
					
					String split[] = fieldData.split("\\s");
					areaWidth = Double.parseDouble(split[0]);
					areaLength = Double.parseDouble(split[1]);
					degree = Double.parseDouble(split[2]);
				
					roadType = road.getSelectedRoad(rdbtnOneWay, rdbtnTwoWay);			//get selected road
					
					diagonalRoadSize = road.diagonalRoadWidth(roadType);
					parallelRoadSize = road.parallelRoadWidth(roadType);
					perpenRoadSize = road.perpenRoadWidth(roadType);
					
					int totalExit = Integer.parseInt((String) exitComboBox.getSelectedItem());
					int totalEnter = Integer.parseInt((String)enterComboBox.getSelectedItem());
					
					int totalExitEnter = totalExit + totalEnter;
					
					
					/*-------Diagonal Parking------*/

					
					int diagonalTotalPark = diagonalParallel.totalParkingSpaces(areaLength, areaWidth, diagParkingSpaceLength, diagParkingSpaceWidth, diagonalRoadSize, totalExitEnter);
						
					diagonalField.setText(Double.toString(diagonalTotalPark));
					
					
						
					/*-------Parallel Parking-------------*/
					
					/****parking space width change parameter position with parking space length because parameter length is treated as width*/
					
					int parallelTotalPark = diagonalParallel.totalParkingSpaces(areaLength, areaWidth, paraParkingSpaceWidth,paraParkingSpaceLength, parallelRoadSize, totalExitEnter);
					
					parallelField.setText(Double.toString(parallelTotalPark));
					
					
					/*--------Perpendicular Parking----------*/
					
					
					int perpenTotalPark = perpenPark.perpenTotalParking(degree, perpenParkingSpaceLength, perpenParkingSpaceWidth, areaLength, areaWidth, perpenRoadSize, totalExitEnter);
					
					perpenField.setText(Double.toString(perpenTotalPark));
					
					
					/*-----get selected feasibility radio button string----*/
					
					
					trafficChoice = fea.getTraffic(trafficLow, trafficMed, trafficHigh);
						
					expendChoice = fea.getExpand(expYes, expNo);
						
					accessChoice = fea.getAccess(accessEasy, accessHard);
					
					locChoice = fea.getLocation(locEasy, locMed, locHigh);
					
					
					/*---get all the value from selected feasibility radio button---*/
					
					
					int trafficPoint = fea.trafficFlow(trafficChoice);
					int expandPoint = fea.expandAbility(expendChoice);
					int accessPoint = fea.roadWayAccess(accessChoice);
					int locPoint = fea.locationComplexity(locChoice);
					
					int totalPoint = trafficPoint + expandPoint + accessPoint + locPoint;
					
					String sTotalPoint = Integer.toString(totalPoint);
					
					feaTotalPoint.setText(sTotalPoint);
					
				}
				
				
				
				
				
			}
			
			
			
			
		});
		btnPark.setBounds(489, 686, 117, 33);
		frmP.getContentPane().add(btnPark);
		
		lblNewLabel_1 = new JLabel("User Option 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(85, 94, 117, 39);
		frmP.getContentPane().add(lblNewLabel_1);
		
		lblTypeOfRoad = new JLabel("Type of Road");
		lblTypeOfRoad.setBounds(50, 338, 86, 22);
		frmP.getContentPane().add(lblTypeOfRoad);
		
		rdbtnOneWay = new JRadioButton("One way");
		rdbtnOneWay.setSelected(true);
		rdbtnOneWay.setBounds(152, 339, 85, 20);
		frmP.getContentPane().add(rdbtnOneWay);
		
		rdbtnTwoWay = new JRadioButton("Two way");
		rdbtnTwoWay.setBounds(151, 365, 86, 22);
		frmP.getContentPane().add(rdbtnTwoWay);
		
		lblEnterWay = new JLabel("Enter way");
		lblEnterWay.setBounds(50, 396, 78, 22);
		frmP.getContentPane().add(lblEnterWay);
		
		lblExitWay = new JLabel("Exit way");
		lblExitWay.setBounds(50, 422, 78, 27);
		frmP.getContentPane().add(lblExitWay);
		
		enterComboBox = new JComboBox();
		enterComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		enterComboBox.setBounds(151, 397, 52, 20);
		frmP.getContentPane().add(enterComboBox);
		
		exitComboBox = new JComboBox();
		exitComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		exitComboBox.setBounds(151, 425, 52, 20);
		frmP.getContentPane().add(exitComboBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(440, 485, 224, 179);
		frmP.getContentPane().add(panel);
		
		JLabel lblResult = new JLabel("RESULT 1");
		lblResult.setForeground(Color.RED);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblResult);
		
		lblangleIsFor = new JLabel("*angle is for diagonal parking");
		lblangleIsFor.setForeground(Color.RED);
		lblangleIsFor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblangleIsFor.setBounds(50, 234, 181, 14);
		frmP.getContentPane().add(lblangleIsFor);
		
		JLabel lblWelcome = new JLabel("PARKING eSTIMATION SYSTEM");
		lblWelcome.setForeground(new Color(219, 112, 147));
		lblWelcome.setFont(new Font("Goudy Stout", Font.ITALIC, 30));
		lblWelcome.setBounds(222, 11, 879, 57);
		frmP.getContentPane().add(lblWelcome);
		
		lblFeasibility = new JLabel("Area Feasibility");
		lblFeasibility.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFeasibility.setBounds(86, 456, 151, 33);
		frmP.getContentPane().add(lblFeasibility);
		
		JLabel label = new JLabel("Parallel :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(701, 549, 67, 23);
		frmP.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Total Parking ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(744, 515, 133, 23);
		frmP.getContentPane().add(label_1);
		
		parallelField1 = new JTextField();
		parallelField1.setColumns(10);
		parallelField1.setBounds(820, 552, 86, 20);
		frmP.getContentPane().add(parallelField1);
		
		diagonalField1 = new JTextField();
		diagonalField1.setColumns(10);
		diagonalField1.setBounds(820, 609, 86, 20);
		frmP.getContentPane().add(diagonalField1);
		
		JLabel label_2 = new JLabel("Diagonal :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(701, 583, 88, 20);
		frmP.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Perpendicular :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(701, 614, 109, 17);
		frmP.getContentPane().add(label_3);
		
		perpenField1 = new JTextField();
		perpenField1.setColumns(10);
		perpenField1.setBounds(820, 580, 86, 20);
		frmP.getContentPane().add(perpenField1);
		
		JLabel lblTotal1 = new JLabel("Feasibility result");
		lblTotal1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal1.setBounds(1081, 672, 165, 20);
		frmP.getContentPane().add(lblTotal1);
		
		final JLabel feaTotalPoint1 = new JLabel("Result here");
		feaTotalPoint1.setBounds(1093, 703, 85, 33);
		frmP.getContentPane().add(feaTotalPoint1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(673, 485, 246, 179);
		frmP.getContentPane().add(panel_1);
		
		JLabel lblResult_1 = new JLabel("RESULT 2");
		lblResult_1.setForeground(Color.RED);
		lblResult_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblResult_1);
		
		label_7 = new JLabel("Angle");
		label_7.setBounds(1093, 209, 46, 14);
		frmP.getContentPane().add(label_7);
		
		angleField1 = new JTextField();
		angleField1.setColumns(10);
		angleField1.setBounds(1210, 206, 86, 20);
		frmP.getContentPane().add(angleField1);
		
		lblangleIsFor_1 = new JLabel("*angle is for diagonal parking");
		lblangleIsFor_1.setForeground(Color.RED);
		lblangleIsFor_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblangleIsFor_1.setBounds(1093, 234, 181, 14);
		frmP.getContentPane().add(lblangleIsFor_1);
		
		areaWidthField1 = new JTextField();
		areaWidthField1.setColumns(10);
		areaWidthField1.setBounds(1210, 144, 86, 20);
		frmP.getContentPane().add(areaWidthField1);
		
		label_9 = new JLabel("Width ");
		label_9.setBounds(1093, 150, 46, 14);
		frmP.getContentPane().add(label_9);
		
		label_10 = new JLabel("Length ");
		label_10.setBounds(1093, 175, 46, 14);
		frmP.getContentPane().add(label_10);
		
		areaLengthField1 = new JTextField();
		areaLengthField1.setColumns(10);
		areaLengthField1.setBounds(1210, 172, 86, 20);
		frmP.getContentPane().add(areaLengthField1);
		
		areaField1 = new JTextField();
		areaField1.setColumns(10);
		areaField1.setBounds(1210, 267, 86, 20);
		frmP.getContentPane().add(areaField1);
		
		label_11 = new JLabel("Area ");
		label_11.setBounds(1093, 270, 46, 14);
		frmP.getContentPane().add(label_11);
		
		label_13 = new JLabel("Type of Road");
		label_13.setBounds(1092, 338, 86, 22);
		frmP.getContentPane().add(label_13);
		
		rdbtnOneWay1 = new JRadioButton("One way");
		rdbtnOneWay1.setSelected(true);
		rdbtnOneWay1.setBounds(1227, 339, 85, 20);
		frmP.getContentPane().add(rdbtnOneWay1);
		
		rdbtnTwoWay1 = new JRadioButton("Two way");
		rdbtnTwoWay1.setBounds(1227, 365, 86, 22);
		frmP.getContentPane().add(rdbtnTwoWay1);
		
		enterComboBox1 = new JComboBox();
		enterComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		enterComboBox1.setBounds(1244, 397, 52, 20);
		frmP.getContentPane().add(enterComboBox1);
		
		label_14 = new JLabel("Enter way");
		label_14.setBounds(1127, 396, 78, 22);
		frmP.getContentPane().add(label_14);
		
		label_15 = new JLabel("Exit way");
		label_15.setBounds(1127, 422, 78, 27);
		frmP.getContentPane().add(label_15);
		
		exitComboBox1 = new JComboBox();
		exitComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		exitComboBox1.setBounds(1244, 425, 52, 20);
		frmP.getContentPane().add(exitComboBox1);
		
		label_16 = new JLabel("Area Feasibility");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_16.setBounds(965, 456, 151, 33);
		frmP.getContentPane().add(label_16);
		
		label_17 = new JLabel("Campus traffic flow :");
		label_17.setBounds(929, 513, 152, 14);
		frmP.getContentPane().add(label_17);
		
		trafficLow1 = new JRadioButton("Low");
		trafficLow1.setSelected(true);
		trafficLow1.setBounds(1127, 504, 54, 33);
		frmP.getContentPane().add(trafficLow1);
		
		trafficMed1 = new JRadioButton("Medium");
		trafficMed1.setBounds(1183, 504, 71, 33);
		frmP.getContentPane().add(trafficMed1);
		
		trafficHigh1 = new JRadioButton("High");
		trafficHigh1.setBounds(1256, 504, 57, 33);
		frmP.getContentPane().add(trafficHigh1);
		
		expNo1 = new JRadioButton("No");
		expNo1.setBounds(1183, 540, 54, 33);
		frmP.getContentPane().add(expNo1);
		
		expYes1 = new JRadioButton("Yes");
		expYes1.setSelected(true);
		expYes1.setBounds(1127, 540, 54, 33);
		frmP.getContentPane().add(expYes1);
		
		label_18 = new JLabel("Expansion capabality :");
		label_18.setBounds(929, 549, 152, 14);
		frmP.getContentPane().add(label_18);
		
		label_19 = new JLabel("Access from roadway network :");
		label_19.setBounds(929, 583, 187, 14);
		frmP.getContentPane().add(label_19);
		
		label_20 = new JLabel("Location complexity :");
		label_20.setBounds(929, 615, 152, 14);
		frmP.getContentPane().add(label_20);
		
		accessEasy1 = new JRadioButton("Easy");
		accessEasy1.setSelected(true);
		accessEasy1.setBounds(1127, 576, 54, 29);
		frmP.getContentPane().add(accessEasy1);
		
		accessHard1 = new JRadioButton("Hard");
		accessHard1.setBounds(1183, 574, 57, 33);
		frmP.getContentPane().add(accessHard1);
		
		locEasy1 = new JRadioButton("Easy");
		locEasy1.setSelected(true);
		locEasy1.setBounds(1127, 606, 54, 33);
		frmP.getContentPane().add(locEasy1);
		
		locMed1 = new JRadioButton("Medium");
		locMed1.setBounds(1183, 606, 71, 33);
		frmP.getContentPane().add(locMed1);
		
		locHigh1 = new JRadioButton("High");
		locHigh1.setBounds(1256, 606, 57, 33);
		frmP.getContentPane().add(locHigh1);
		
		lblUserOption = new JLabel("User Option 2");
		lblUserOption.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUserOption.setBounds(1127, 94, 117, 39);
		frmP.getContentPane().add(lblUserOption);
		
		JButton btnEstimate = new JButton("Estimate");
		btnEstimate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiagonalAndParallel diagonalParallel = new DiagonalAndParallel();
				PerpenParking perpenPark = new PerpenParking();
				Road road = new Road();
				Feasibility fea = new Feasibility();
				TextFieldData textFieldData = new TextFieldData();
				
				double areaWidth = 0;
				double areaLength = 0;
				double degree = 0;
				
				double diagonalRoadSize = 0;
				double parallelRoadSize = 0;
				double perpenRoadSize = 0;
				
				String roadType = "";
				String trafficChoice = "";
				String expendChoice = "";
				String accessChoice = "";
				String locChoice = "";
				
				
				/**Diagonal parking size**/
				
				double diagParkingSpaceWidth = 2.4;
				double diagParkingSpaceLength = 4.8;
				
				/**Parallel parking size**/
				
				double paraParkingSpaceWidth = 2.4;
				double paraParkingSpaceLength = 5.4;
				
				/**Perpendicular parking size**/
				
				double perpenParkingSpaceWidth = 2.4;
				double perpenParkingSpaceLength = 4.8;
				
				String areaWidthText = areaWidthField1.getText();
				String areaLengthText = areaLengthField1.getText();
				String angleText = angleField1.getText();
				String areaText = areaField1.getText();
				
				String fieldData = textFieldData.getTextFieldData(areaWidthText, areaLengthText, areaText, angleText);
				
				
				
				if(fieldData.isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Please insert data");
					
					
				}else if(fieldData.equalsIgnoreCase("all inserted")){
					
					JOptionPane.showMessageDialog(null, "You can only choose to insert width and length manually or get area and parameter from map");
					
				}else if(fieldData.equalsIgnoreCase("no angle")){
					
					JOptionPane.showMessageDialog(null, "Please insert angle");
					
				}else{
					
					
					String split[] = fieldData.split("\\s");
					areaWidth = Double.parseDouble(split[0]);
					areaLength = Double.parseDouble(split[1]);
					degree = Double.parseDouble(split[2]);
				
					roadType = road.getSelectedRoad(rdbtnOneWay1, rdbtnTwoWay1);			//get selected road
					
					diagonalRoadSize = road.diagonalRoadWidth(roadType);
					parallelRoadSize = road.parallelRoadWidth(roadType);
					perpenRoadSize = road.perpenRoadWidth(roadType);
					
					int totalExit = Integer.parseInt((String) exitComboBox1.getSelectedItem());
					int totalEnter = Integer.parseInt((String)enterComboBox1.getSelectedItem());
					
					int totalExitEnter = totalExit + totalEnter;
					
					
					/*-------Diagonal Parking------*/

					
					int diagonalTotalPark = diagonalParallel.totalParkingSpaces(areaLength, areaWidth, diagParkingSpaceLength, diagParkingSpaceWidth, diagonalRoadSize, totalExitEnter);
						
					diagonalField1.setText(Double.toString(diagonalTotalPark));
					
					
						
					/*-------Parallel Parking-------------*/
					
					/****parking space width change parameter position with parking space length because parameter length is treated as width*/
					
					int parallelTotalPark = diagonalParallel.totalParkingSpaces(areaLength, areaWidth, paraParkingSpaceWidth,paraParkingSpaceLength, parallelRoadSize, totalExitEnter);
					
					parallelField1.setText(Double.toString(parallelTotalPark));
					
					
					/*--------Perpendicular Parking----------*/
					
					
					int perpenTotalPark = perpenPark.perpenTotalParking(degree, perpenParkingSpaceLength, perpenParkingSpaceWidth, areaLength, areaWidth, perpenRoadSize, totalExitEnter);
					
					perpenField1.setText(Double.toString(perpenTotalPark));
					
					
					/*-----get selected feasibility radio button string----*/
					
					
					trafficChoice = fea.getTraffic(trafficLow1, trafficMed1, trafficHigh1);
						
					expendChoice = fea.getExpand(expYes1, expNo1);
						
					accessChoice = fea.getAccess(accessEasy1, accessHard1);
					
					locChoice = fea.getLocation(locEasy1, locMed1, locHigh1);
					
					
					/*---get all the value from selected feasibility radio button---*/
					
					
					int trafficPoint = fea.trafficFlow(trafficChoice);
					int expandPoint = fea.expandAbility(expendChoice);
					int accessPoint = fea.roadWayAccess(accessChoice);
					int locPoint = fea.locationComplexity(locChoice);
					
					int totalPoint = trafficPoint + expandPoint + accessPoint + locPoint;
					
					String sTotalPoint = Integer.toString(totalPoint);
					
					feaTotalPoint1.setText(sTotalPoint);
					
				}
				
				
				
				
				
			}
		});
		btnEstimate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEstimate.setBounds(744, 686, 109, 33);
		frmP.getContentPane().add(btnEstimate);
		
		//Open new frame for google maps
		
		JButton btnOpenMap = new JButton("Open Map");
		btnOpenMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MapFrame window = new MapFrame();
				window.viewFrame();
				
			}
		});
		btnOpenMap.setBounds(1165, 34, 89, 23);
		frmP.getContentPane().add(btnOpenMap);
		
		
	}
}

