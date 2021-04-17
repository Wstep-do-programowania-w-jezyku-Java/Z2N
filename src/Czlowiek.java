import java.util.Objects;

public class Czlowiek extends Object {
	private String imie, nazwisko;
	private int wiek;
//	private String miejscUr="Lublin";
	private String miejscUr;
	
	{
		miejscUr="Lublin";
	}
	
	public Czlowiek(String imie, String nazwisko, int liczbaLat) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		wiek=liczbaLat;
	}
	
	public Czlowiek(String imie, String nazwisko, int liczbaLat, String miejscUr) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		wiek=liczbaLat;
		this.miejscUr=miejscUr;
	}
	
	public Czlowiek(String imie, String nazwisko) {
//		this.imie=imie;
//		this.nazwisko=nazwisko;
//		wiek=0;
		this(imie,nazwisko,0);	
	}
	
	public int getWiek() {
		return wiek;
	}

	public String getImie() {
		return imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	@Override
	public String toString() {
		return imie+", "+nazwisko+", "+wiek;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		
		if (obj==null)
			return false;
		
		if (this.getClass()!=obj.getClass())
			return false;
		
		Czlowiek otherObject=(Czlowiek)obj;
		return this.getImie().equals(otherObject.getImie()) && this.nazwisko.equals(otherObject.nazwisko) &&
				this.wiek==otherObject.wiek;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imie,nazwisko,wiek);
	}
}
