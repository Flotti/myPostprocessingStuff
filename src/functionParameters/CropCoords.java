package functionParameters;

import javax.swing.JButton;

public class CropCoords extends FunctionBasic{
	
	private double xmin;
	private double xmax;
	private double ymin;
	private double ymax;
	private double zmin;
	private double zmax;
	private int framemin;
	private int framemax;
	
	public CropCoords(){
		super(3, "CropCoords");
		this.setXmin(10);
		this.setXmax(11);
		this.setYmin(10);
		this.setYmax(11);
		this.setZmin(10);
		this.setZmax(11);
		this.setFramemin(0);
		this.setFramemax(1);
	}

	public double getXmin() {
		return xmin;
	}
	public void setXmin(double xmin) {
		this.xmin = xmin;
	}
	public double getXmax() {
		return xmax;
	}
	public void setXmax(double xmax) {
		this.xmax = xmax;
	}
	public double getYmin() {
		return ymin;
	}
	public void setYmin(double ymin) {
		this.ymin = ymin;
	}
	public double getYmax() {
		return ymax;
	}
	public void setYmax(double ymax) {
		this.ymax = ymax;
	}
	public double getZmin() {
		return zmin;
	}
	public void setZmin(double zmin) {
		this.zmin = zmin;
	}
	public double getZmax() {
		return zmax;
	}
	public void setZmax(double zmax) {
		this.zmax = zmax;
	}
	public int getFramemin() {
		return framemin;
	}
	public void setFramemin(int framemin) {
		this.framemin = framemin;
	}
	public int getFramemax() {
		return framemax;
	}
	public void setFramemax(int framemax) {
		this.framemax = framemax;
	}
}
