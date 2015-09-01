package StormLib;

import java.util.ArrayList;

public class GuiParameters {
	private String path1 = null;
	private String path2 = null;
	private String fname1 = null;
	private String fname2 = null;
	private String pattern1 = null;
	private String pattern2 = null;
//	private ArrayList<Integer> orderList = null;
	private boolean dualColor = false;
	private boolean multipleFiles = false;

	public GuiParameters(){
	}

//	public GuiParameters(String path1, String fname1, String path2, String fname2, String pattern1, String pattern2,
//			 ArrayList<Integer> orderList, boolean dualColor, boolean multipleFiles){
//		this.path1 = path1;
//		this.path2 = path2;
//		this.fname1 = fname1;
//		this.fname2 = fname2;
//		this.pattern1 = pattern1;
//		this.pattern2 = pattern2;
//		this.orderList = orderList;
//		this.dualColor = dualColor;
//		this.multipleFiles = multipleFiles;
//	}
	
	public String getPath1(){
		return path1;
	}	
	public String getPath2(){
		return path2;
	}
	public String getFname1(){
		return fname1;
	}
	public String getFname2(){
		return fname2;
	}
	public String getPattern1(){
		return pattern1;
	}
	public String getPattern2(){
		return pattern2;
	}
//	public ArrayList<Integer> getOrderList(){
//		return orderList;
//	}
	public boolean isDualColor(){
		return dualColor;
	}
	public boolean getMultipleFiles(){
		return multipleFiles;
	}
	public void setPath1(String path1){
		this.path1 = path1;
	}
	public void setPath2(String path2){
		this.path2 = path2;
	}
	public void setFname1(String fname1){
		this.fname1 = fname1+".txt";
	}
	public void setFname2(String fname2){
		this.fname2 = fname2+".txt";
	}
	public void setPattern1(String pattern1){
		this.pattern1 = pattern1;
	}
	public void setPattern2(String pattern2){
		this.pattern2 = pattern2;
	}
//	public void setOrderList(ArrayList<Integer> orderList){
//		this.orderList = orderList;
//	}
	public void setDualColor(boolean dualColor){
		this.dualColor = dualColor;
	}
	public void setMultiplefiles(boolean multipleFiles){
		this.multipleFiles = multipleFiles;
	}
//	public void addOrderListElement(int element){
//		this.orderList.add(element);
//	}
}
