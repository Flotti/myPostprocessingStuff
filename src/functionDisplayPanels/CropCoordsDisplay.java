package functionDisplayPanels;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CropCoordsDisplay extends JPanel{
	
	//read out data
	private JTextField cropCoordsDisplayDoubleXmin;
	private JTextField cropCoordsDisplayDoubleXmax;
	private JTextField cropCoordsDisplayDoubleYmin;
	private JTextField cropCoordsDisplayDoubleYmax;
	private JTextField cropCoordsDisplayDoubleZmin;
	private JTextField cropCoordsDisplayDoubleZmax;
	private JTextField cropCoordsDisplayIntFrameMin;
	private JTextField cropCoordsDisplayIntFrameMax;
	private String functionlabel = "CropCoords Options";
	
	
	//display junk variables
	private FlowLayout flowLayout;
	private Box verticalBox;
	private JLabel lblRenderimaged;
	private Component verticalStrut;
	private Box horizontalBox;
	private JLabel lblNewLabel;
	private Component verticalStrut_7;
	private Box horizontalBox2;
	private JLabel lblNewLabel_1;
	private Component verticalStrut_8;
	private Box horizontalBox3;
	private JLabel lblNewLabel_2;
	private Component verticalStrut_9;
	private Box horizontalBox4;
	private JLabel lblNewLabel_3;
	private Component verticalStrut_10;
	private Box horizontalBox5;
	private JLabel lblNewLabel_4;
	private Component verticalStrut_11;
	private Box horizontalBox6;
	private JLabel lblNewLabel_5;
	private Component verticalStrut_12;
	private Box horizontalBox7;
	private JLabel lblNewLabel_6;
	private Component verticalStrut_13;
	private Box horizontalBox8;
	private JLabel lblNewLabel_7;

		
	
	public CropCoordsDisplay(){
		

//		this.setBackground(Color.GRAY);
		flowLayout = (FlowLayout) this.getLayout();
		flowLayout.setVgap(150);
		flowLayout.setHgap(35);
		verticalBox = Box.createVerticalBox();
		add(verticalBox);
		lblRenderimaged = new JLabel(functionlabel);
		verticalBox.add(lblRenderimaged);
		lblRenderimaged.setVerticalAlignment(SwingConstants.TOP);
		verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		lblNewLabel = new JLabel("Double Xmin: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox.add(lblNewLabel);
		
		cropCoordsDisplayDoubleXmin = new JTextField();
		horizontalBox.add(cropCoordsDisplayDoubleXmin);
		cropCoordsDisplayDoubleXmin.setColumns(10);
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_7);
		
		horizontalBox2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox2);
		
		lblNewLabel_1 = new JLabel("Double Xmax: ");
		horizontalBox2.add(lblNewLabel_1);
		
		cropCoordsDisplayDoubleXmax = new JTextField();
		cropCoordsDisplayDoubleXmax.setText("");
		horizontalBox2.add(cropCoordsDisplayDoubleXmax);
		cropCoordsDisplayDoubleXmax.setColumns(10);
		
		//
		verticalStrut_8 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_8);		
		horizontalBox3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox3);		
		lblNewLabel_2 = new JLabel("Double Ymin: ");
		horizontalBox3.add(lblNewLabel_2);		
		cropCoordsDisplayDoubleYmin = new JTextField();
		cropCoordsDisplayDoubleYmin.setText("");
		horizontalBox3.add(cropCoordsDisplayDoubleYmin);
		cropCoordsDisplayDoubleYmin.setColumns(10);
		
		verticalStrut_9 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_9);		
		horizontalBox4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox4);		
		lblNewLabel_3 = new JLabel("Double Ymax: ");
		horizontalBox4.add(lblNewLabel_3);		
		cropCoordsDisplayDoubleYmax = new JTextField();
		cropCoordsDisplayDoubleYmax.setText("");
		horizontalBox4.add(cropCoordsDisplayDoubleYmax);
		cropCoordsDisplayDoubleYmax.setColumns(10);
		//
		verticalStrut_10 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_10);		
		horizontalBox5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox5);		
		lblNewLabel_4 = new JLabel("Double Zmin: ");
		horizontalBox5.add(lblNewLabel_4);		
		cropCoordsDisplayDoubleZmin = new JTextField();
		cropCoordsDisplayDoubleZmin.setText("");
		horizontalBox5.add(cropCoordsDisplayDoubleZmin);
		cropCoordsDisplayDoubleZmin.setColumns(10);
		
		verticalStrut_11 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_11);		
		horizontalBox6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox6);		
		lblNewLabel_5 = new JLabel("Double Zmax: ");
		horizontalBox6.add(lblNewLabel_5);		
		cropCoordsDisplayDoubleZmax = new JTextField();
		cropCoordsDisplayDoubleZmax.setText("");
		horizontalBox6.add(cropCoordsDisplayDoubleZmax);
		cropCoordsDisplayDoubleZmax.setColumns(10);
		
		verticalStrut_12 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_12);		
		horizontalBox7 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox7);		
		lblNewLabel_6 = new JLabel("Int Framemin: ");
		horizontalBox7.add(lblNewLabel_6);		
		cropCoordsDisplayIntFrameMin = new JTextField();
		cropCoordsDisplayIntFrameMin.setText("");
		horizontalBox7.add(cropCoordsDisplayIntFrameMin);
		cropCoordsDisplayIntFrameMin.setColumns(10);
		
		verticalStrut_13 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_13);		
		horizontalBox8 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox8);		
		lblNewLabel_7 = new JLabel("Int Framemax: ");
		horizontalBox8.add(lblNewLabel_7);		
		cropCoordsDisplayIntFrameMax = new JTextField();
		cropCoordsDisplayIntFrameMax.setText("");
		horizontalBox8.add(cropCoordsDisplayIntFrameMax);
		cropCoordsDisplayIntFrameMax.setColumns(10);
		
	}
	
	public Double getCropCoordsDoubleXmin(){
		return Double.parseDouble(cropCoordsDisplayDoubleXmin.getText());
	}
	public Double getCropCoordsDoubleXmax(){
		return Double.parseDouble(cropCoordsDisplayDoubleXmax.getText());
	}
	public Double getCropCoordsDoubleYmin(){
		return Double.parseDouble(cropCoordsDisplayDoubleYmin.getText());
	}
	public Double getCropCoordsDoubleYmax(){
		return Double.parseDouble(cropCoordsDisplayDoubleYmax.getText());
	}
	public Double getCropCoordsDoubleZmin(){
		return Double.parseDouble(cropCoordsDisplayDoubleZmin.getText());
	}
	public Double getCropCoordsDoubleZmax(){
		return Double.parseDouble(cropCoordsDisplayDoubleZmax.getText());
	}
	public int getCropCoordsIntFrameMin(){
		return Integer.parseInt(cropCoordsDisplayIntFrameMin.getText());
	}
	public int getCropCoordsIntFrameMax(){
		return Integer.parseInt(cropCoordsDisplayIntFrameMax.getText());
	}
}
