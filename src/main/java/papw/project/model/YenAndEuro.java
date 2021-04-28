package papw.project.model;

import java.text.DecimalFormat;

public class YenAndEuro {
	
	
	private double BaseYen = 131.53;
	private double euro;
	private double BaseEuro = 0.0076028283;
	private double yen;
	private double y;
	private double e;
	
	public YenAndEuro() {}
	
	public YenAndEuro(double euro) {}

	public String gety() {
		DecimalFormat rFormat = new DecimalFormat("#.00");
		euro = 0;
		return rFormat.format(y);
	}
	
	public String gete() {
		DecimalFormat rFormat = new DecimalFormat("#.0000");
		yen = 0;
		return rFormat.format(e);
	}
	
	public double getya() {
		return euro;
	}
	
	public double getea() {
		return yen;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
		y = euro * BaseYen;
	}
	
	public double getYen() {
		return yen;
	}

	public void setYen(double yen) {
		this.yen = yen;
		e = yen * BaseEuro;
	}	


}

