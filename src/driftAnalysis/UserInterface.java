package driftAnalysis;

import java.awt.List;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import StormLib.GuiParameters;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Component;

import functionDisplayPanels.CropCoordsDisplay;
import functionDisplayPanels.GetLocsPerFrameDisplay;
import functionDisplayPanels.RenderImage2DDisplay;
import functionDisplayPanels.RenderImage3DDisplay;
import functionParameters.CropCoords;
import functionParameters.GetLocsPerFrame;
import functionParameters.RenderImage2D;
import functionParameters.FunctionBasic;
import functionParameters.RenderImage3D;

import java.awt.Color;


public class UserInterface extends JFrame implements ActionListener{
	
//	private String path1;
//	private String fname1;
//	push to upstream	
	/*Left panel (panel) objects*/
	private JButton doItButton;
	private JTextField inputPath1;
	private JTextField inputFname1;
	private JLabel progressBar;
	private JCheckBox dualColorCheckBox;
	private JCheckBox multipleFiles;
	private JLabel path2Label;
	private JTextField inputPath2;
	private Box horizontalBox_6;
	private JLabel fileName2Label;
	private JTextField inputFname2;
	private Component verticalStrut_4;
	private Box verticalBox_1;
	private Box horizontalBox_7;
	private JButton renderImage2DButton;
	private JButton renderImage3DButton;
	private JButton cropCoordsButton;
	private JButton getLocsPerFrameButton;
	

	private ArrayList<Integer> orderList = new ArrayList<Integer>();
	private Box horizontalBox;
	private Box verticalBox;
	private Box horizontalBox_1;
	private Box horizontalBox_2;
	private Box horizontalBox_3;
	private Box horizontalBox_4;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private Component verticalStrut_2;
	private Component horizontalStrut;
	private Component verticalStrut_3;
	private Box horizontalBox_5;
	private Component verticalStrut_5;
	private JButton clearListButton;
	private Component horizontalStrut_1;
	private JPanel executionOrderDisplay;
	private JButton btnNewButton;
	
	public UserInterface(){
		
		JFrame mainWindow = new JFrame("wzapp?");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(1400, 800);

		
		/*
		 *Panel: Left panel to check for dual-color data and batch data progressing. 
		 *Give path of files, overview on possible functions, start button, progress bar
		 */
		
		horizontalBox = Box.createHorizontalBox();
		mainWindow.getContentPane().add(horizontalBox, BorderLayout.NORTH);
						JPanel panel = new JPanel();
							panel.setAlignmentY(Component.TOP_ALIGNMENT);
							horizontalBox.add(panel);
							panel.setMaximumSize(new Dimension(500, 500));
							FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
							verticalBox = Box.createVerticalBox();
							panel.add(verticalBox);							
							horizontalBox_1 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_1);
							dualColorCheckBox = new JCheckBox("dual color data?");
							dualColorCheckBox.addActionListener(this);
							horizontalBox_1.add(dualColorCheckBox);							
							multipleFiles = new JCheckBox("multiple data set?");
							horizontalBox_1.add(multipleFiles);							
							verticalStrut = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut);							
							horizontalBox_2 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_2);
							JLabel pathLabel = new JLabel("Path: ");
							horizontalBox_2.add(pathLabel);
							inputPath1 = new JTextField("C:\\Uni\\STORM-Test-Data\\", 20);
							horizontalBox_2.add(inputPath1);							
							verticalStrut_1 = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut_1);							
							horizontalBox_3 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_3);
							JLabel fileNameLabel = new JLabel("Filename: ");
							horizontalBox_3.add(fileNameLabel);
							inputFname1 = new JTextField("Daten", 20);
							horizontalBox_3.add(inputFname1);
							verticalStrut_2 = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut_2);							
							horizontalBox_5 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_5);							
							path2Label = new JLabel("Path2: ");							
							horizontalBox_5.add(path2Label);							
							inputPath2 = new JTextField();
							inputPath2.setText("C:\\Uni\\STORM-Test-Data\\");
							inputPath2.setEditable(false);							
							horizontalBox_5.add(inputPath2);
							inputPath2.setColumns(10);							
							verticalStrut_3 = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut_3);							
							horizontalBox_6 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_6);							
							fileName2Label = new JLabel("Filename2: ");
							horizontalBox_6.add(fileName2Label);							
							inputFname2 = new JTextField();
							inputFname2.setText("Daten2");
							inputFname2.setColumns(10);
							inputFname2.setEditable(false);
							horizontalBox_6.add(inputFname2);							
							verticalStrut_4 = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut_4);							
							horizontalBox_7 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_7);							
							renderImage2DButton = new JButton("renderImage2D");
							horizontalBox_7.add(renderImage2DButton);
							renderImage2DButton.addActionListener(this);
							renderImage3DButton = new JButton("renderImage3D");
							horizontalBox_7.add(renderImage3DButton);
							renderImage3DButton.addActionListener(this);
							cropCoordsButton = new JButton("cropCoords");
							horizontalBox_7.add(cropCoordsButton);
							cropCoordsButton.addActionListener(this);
							getLocsPerFrameButton = new JButton("getLocsPerFrame");
							horizontalBox_7.add(getLocsPerFrameButton);
							getLocsPerFrameButton.addActionListener(this);
							verticalStrut_5 = Box.createVerticalStrut(20);
							verticalBox.add(verticalStrut_5);
							
							horizontalBox_4 = Box.createHorizontalBox();
							verticalBox.add(horizontalBox_4);
							doItButton = new JButton("Renn!");
							doItButton.addActionListener(this);
							horizontalBox_4.add(doItButton);
							horizontalStrut = Box.createHorizontalStrut(20);
							horizontalBox_4.add(horizontalStrut);
							progressBar = new JLabel("steht noch");
							horizontalBox_4.add(progressBar);
							
							horizontalStrut_1 = Box.createHorizontalStrut(20);
							horizontalBox_4.add(horizontalStrut_1);
							
							clearListButton = new JButton("Clear List");
							clearListButton.addActionListener(this);
							horizontalBox_4.add(clearListButton);
						
									
						JPanel panel2 = new JPanel();
						horizontalBox.add(panel2);
						panel2.setAlignmentY(Component.TOP_ALIGNMENT);
						panel2.setMaximumSize(new Dimension(500, 500));
						FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
						flowLayout.setVgap(120);
						flowLayout.setHgap(70);
						
						verticalBox_1 = Box.createVerticalBox();
						panel2.add(verticalBox_1);
						JLabel label_2 = new JLabel("Execution Order: ");
						label_2.setAlignmentX(Component.CENTER_ALIGNMENT);
						label_2.setHorizontalAlignment(SwingConstants.LEFT);
						verticalBox_1.add(label_2);
						label_2.setAlignmentY(Component.TOP_ALIGNMENT);
						label_2.setVerticalTextPosition(SwingConstants.TOP);
						label_2.setVerticalAlignment(SwingConstants.TOP);
						
						executionOrderDisplay = new JPanel();
						executionOrderDisplay.setBackground(Color.GRAY);
						FlowLayout flowLayout_3 = (FlowLayout) executionOrderDisplay.getLayout();
						flowLayout_3.setVgap(100);
						flowLayout_3.setHgap(60);
						
						
//						executionOrderDisplay.add(new JButton ("Hallo"));
//						executionOrderDisplay.add(new JButton ("Hallo"));
						verticalBox_1.add(executionOrderDisplay);
						
						
						
//						for (int i = 0; i < Main.guiFunctionParametersList.size(); i++){
//							verticalBox_1.add(Main.guiFunctionParametersList.get(i).getFunctionButton());
//						}
						
//						scrollPane = new JScrollPane();
//						executionOrderDisplay.add(scrollPane);
//						scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						
						
						
						RenderImage3DDisplay functionDisplayBasic = new RenderImage3DDisplay();
						horizontalBox.add(functionDisplayBasic);
						RenderImage2DDisplay functionDisplayBasic3 = new RenderImage2DDisplay();
						horizontalBox.add(functionDisplayBasic3);
						CropCoordsDisplay functionDisplayBasic2 = new CropCoordsDisplay();
						horizontalBox.add(functionDisplayBasic2);
						GetLocsPerFrameDisplay functionDislpayBasic1 = new GetLocsPerFrameDisplay();
						horizontalBox.add(functionDislpayBasic1);
						
		mainWindow.setVisible(true); 
			
	}
	
	private void placeButtons(){
		for (int i = 0; i < Main.guiFunctionParametersList.size(); i++){
//			for (int i = 0; i < 1; i++){
//				verticalBox_1.add(Main.guiFunctionParametersList.get(i).getFunctionButton());
				executionOrderDisplay.add(new JButton ("Hallo"));
		}
		this.repaint();
	}
	
	public void actionPerformed (ActionEvent ae){
		
		//do it button get path and filename for loading data, add user input to executionlist (guiFunctionParametersList), call execute in main method
		if (ae.getSource() == this.doItButton){
			orderList.clear();
//			Main.guiParameters.setOrderList(null);
			Main.guiParameters.setDualColor(dualColorCheckBox.isSelected());
			Main.guiParameters.setPath1(inputPath1.getText());
			Main.guiParameters.setFname1(inputFname1.getText());
//			Main.guiParameters.addOrderListElement(9);
//			System.out.println(Main.guiParameters.getOrderList().size());
//			orderList.add(9); 
//			Main.guiParameters.setOrderList(orderList);
			Main.execute();
			progressBar.setText("feddich");
		}
		//dual Color Check box enable/disable 2nd path + filename text field
		if (ae.getSource() == this.dualColorCheckBox){
			if (!dualColorCheckBox.isSelected()){
				inputPath2.setEditable(false);
				inputFname2.setEditable(false);
			}
			else {
				inputPath2.setEditable(true);
				inputFname2.setEditable(true);
			}
		}
		//add functions to List for calculation (guiFunctionParametersList)
		if (ae.getSource() == this.renderImage2DButton){
			RenderImage2D ri2 = new RenderImage2D();
			Main.guiFunctionParametersList.add(ri2);
//			mainWindow.revalidate();
			placeButtons();
		}
		if (ae.getSource() == this.renderImage3DButton){
			RenderImage3D ri3 = new RenderImage3D();
			Main.guiFunctionParametersList.add(ri3);
		}
		if (ae.getSource() == this.cropCoordsButton){
			CropCoords cc = new CropCoords();
			Main.guiFunctionParametersList.add(cc);
		}
		if (ae.getSource() == this.getLocsPerFrameButton){
			GetLocsPerFrame glpf = new GetLocsPerFrame();
			Main.guiFunctionParametersList.add(glpf);
		}
		if (ae.getSource() == this.clearListButton){
			Main.guiFunctionParametersList.clear();
		}
	}
}
