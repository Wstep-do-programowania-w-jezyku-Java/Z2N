
public class Prostokat extends Figura{
	private double szer,wys;

	public Prostokat(double szer, double wys) {
		super();
		this.szer = szer;
		this.wys = wys;
		setRodzaj("prostokąt");
	}

	public double getSzer() {
		return szer;
	}

	public double getWys() {
		return wys;
	}

	@Override
	public double getPole() {
		// TODO Auto-generated method stub
		return szer*wys;
	}

	@Override
	public double getObw() {
		// TODO Auto-generated method stub
		return 2*(wys+szer);
	}
	
	@Override
	public String toString() {
		return "Rodzaj:"+getRodzaj()+", szer="+getSzer()+", wys="+getWys()+", Obw="
	+getObw()+", Pole="+getPole();
	}

}
