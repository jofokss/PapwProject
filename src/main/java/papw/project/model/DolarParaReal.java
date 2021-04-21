package papw.project.model;

import java.text.DecimalFormat;

public class DolarParaReal {
	
	
	private double real = 5.56;
	private double dolar;
	private double r;
	
	public DolarParaReal() {}
	
	public DolarParaReal(double dolar) {}

	public String getr() {
		DecimalFormat rFormat = new DecimalFormat("#.00");
		return rFormat.format(r);
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
		r = dolar * real;
	}


}
