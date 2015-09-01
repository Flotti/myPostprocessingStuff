package functionParameters;

import javax.swing.*;


public class FunctionBasic {
	
	private int functionID;
	private JButton functionButton;
	
	public FunctionBasic(int functionID, String buttonName){
		this.setFunctionID(functionID);
		this.setFunctionButton(new JButton(buttonName));
	}

	public int getFunctionID() {
		return functionID;
	}

	public void setFunctionID(int functionID) {
		this.functionID = functionID;
	}

	public JButton getFunctionButton() {
		return functionButton;
	}

	public void setFunctionButton(JButton functionButton) {
		this.functionButton = functionButton;
	}
}
