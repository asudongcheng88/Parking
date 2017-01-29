package com.main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MapFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapFrame window = new MapFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	public void viewFrame(){
		
		MapFrame window = new MapFrame();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MapFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 982, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

}
