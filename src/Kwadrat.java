
public class Kwadrat extends Prostokat {

	public Kwadrat(double bok) {
		super(bok, bok);
		setRodzaj("kwadrat");
	}

	@Override
	public String toString() {
		return "Rodzaj:"+getRodzaj()+", bok="+ getSzer()+", Obw="+getObw()+", Pole="+getPole();
	}
}
