import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Czlowiek c1=new Czlowiek("Jan","kowalski",47);
		System.out.println(c1.getImie()+" "+c1.getNazwisko()+" "+c1.getWiek());

		Czlowiek[] ludzie=new Czlowiek[3];
		ludzie[0]=new Czlowiek("Maria", "Konopnicka", 23);
		ludzie[1]=new Czlowiek("Zofia", "Kosowska", 30);
		ludzie[2]=new Czlowiek("Marian", "Kania", 50);
		
		for(Czlowiek c: ludzie)
			System.out.println(c.getImie()+" "+c.getNazwisko()+" "+c.getWiek());
		
		List<Czlowiek> lista=new ArrayList<>();
		lista.add(new Czlowiek("Jan", "Karaś", 60));
		lista.add(new Czlowiek("Piotr", "Konopka", 65));
		
		for(Czlowiek c: lista)
			System.out.println(c);
		
		Czlowiek cz1,cz2;
		cz1=new Czlowiek("Jan", "Kowalski",10);
		cz2=new Czlowiek("Jan", "Kowalski",10);
		System.out.println(cz1.equals(cz2));
		System.out.println(cz1.hashCode());
		System.out.println(cz2.hashCode());
	}

}
