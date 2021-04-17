
public class Kolo extends Figura {
	private double r;

	public Kolo(double r) {
		this.r = r;
		setRodzaj("koło");
	}

	@Override
	public double getPole() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(r, 2);
	}

	@Override
	public double getObw() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

}
