package functionParameters;

import javax.swing.JButton;

public class RenderImage3D extends FunctionBasic{
	
	private double pixelSize;
	private String tag;
	
	public RenderImage3D(){
		super(2, "RenderImage3D");
		this.setPixelSize(10);
		this.setTag("");
	}

	public double getPixelSize() {
		return pixelSize;
	}

	public void setPixelSize(double pixelSize) {
		this.pixelSize = pixelSize;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}	
}
