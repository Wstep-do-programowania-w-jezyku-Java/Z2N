import java.util.ArrayList;
import java.util.List;

public class FiguryMain {

	public static void main(String[] args) {
		List<Figura> lista=new ArrayList<>();
		lista.add(new Prostokat(10,16));
		lista.add(new Prostokat(2, 5));
		lista.add(new Kwadrat(5));
		lista.add(new Kwadrat(17));
		lista.add(new Kolo(3));
		lista.add(new Kolo(4));
		
		for(Figura p: lista)
			System.out.println(p.toString());
	}

}
