package functionDisplayPanels;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GetLocsPerFrameDisplay extends JPanel{
	
	//read out data
	private String functionlabel = "GetLocsPerFrame Options";
	
	
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
	
	
	public GetLocsPerFrameDisplay(){
		

//		this.setBackground(Color.GRAY);
		flowLayout = (FlowLayout) this.getLayout();
		flowLayout.setVgap(150);
		flowLayout.setHgap(35);
		verticalBox = Box.createVerticalBox();
		add(verticalBox);
		lblRenderimaged = new JLabel(functionlabel);
		verticalBox.add(lblRenderimaged);
		lblRenderimaged.setVerticalAlignment(SwingConstants.TOP);
				
	}
	
}
