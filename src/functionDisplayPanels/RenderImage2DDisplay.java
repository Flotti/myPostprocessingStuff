package functionDisplayPanels;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RenderImage2DDisplay extends JPanel{
	
	//read out data
	private JTextField renderImage2DDisplayString;
	private JTextField renderImage2DDisplayDouble;
	private String functionlabel = "RenderImage2D Options";
	
	
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
	
	
	public RenderImage2DDisplay(){
		

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
		
		lblNewLabel = new JLabel("Double: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox.add(lblNewLabel);
		
		renderImage2DDisplayDouble = new JTextField();
		horizontalBox.add(renderImage2DDisplayDouble);
		renderImage2DDisplayDouble.setColumns(10);
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_7);
		
		horizontalBox2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox2);
		
		lblNewLabel_1 = new JLabel("String: ");
		horizontalBox2.add(lblNewLabel_1);
		
		renderImage2DDisplayString = new JTextField();
		renderImage2DDisplayString.setText("");
		horizontalBox2.add(renderImage2DDisplayString);
		renderImage2DDisplayString.setColumns(10);
		
	}
	
	public String getRenderImage2DString(){
		return renderImage2DDisplayString.getText();
	}

	public double getRenderImage2DDouble(){
		return Double.parseDouble(renderImage2DDisplayDouble.getText());
	}
}
