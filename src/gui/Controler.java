package gui;

import java.util.ArrayList;

import functionDefinitions.MultipleFileInput;
import functionDefinitions.RenderImage2D;
import functionDefinitions.SingleFileInput;
import StormLib.StormData;
import StormLib.Utilities;

public class Controler {
	MainFrame mf;
	StormData ch1;
	StormData ch2;
	Controler(){
		
	}
	
	public void setMainFrameReference(MainFrame mf) {
		this.mf = mf;
	}
	public void startProcessing(
			ArrayList<ProcessingStepsPanel> functions) {
		for (int i = 0; i<functions.size(); i++){
			if (functions.get(i).getClass() == SingleFileInput.class){
				SingleFileInput sfi = (SingleFileInput) functions.get(i);
				ch1 = new StormData(sfi.getPath(),sfi.getFoldername());
			}
			if (functions.get(i).getClass() == MultipleFileInput.class){
				MultipleFileInput mfi = (MultipleFileInput) functions.get(i);
				System.out.println(mfi.getPath1());
				ArrayList<StormData> list = Utilities.openSeries(mfi.getPath1(), mfi.getPattern1(), mfi.getPath2(), mfi.getPattern2());
				ch1 = list.get(0);
				ch2 = list.get(1);
				System.out.println(ch1.getSize());
				System.out.println(ch2.getSize());
			}
			
			if (functions.get(i).getClass() == RenderImage2D.class){
				RenderImage2D ri2D = (RenderImage2D) functions.get(i);
				ch1.renderImage2D(ri2D.getPixelsize(), ri2D.getTag());
			}
		}
	}
}
