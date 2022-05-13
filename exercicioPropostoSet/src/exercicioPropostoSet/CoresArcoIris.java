package exercicioPropostoSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class CoresArcoIris {

	public static void main(String[] args) {

		Set<Cores> cores = new HashSet<>() {{
			add(new Cores("azul"));
			add(new Cores("preto"));
			add(new Cores("branco"));
			add(new Cores("amarelo"));
			
			
		}};
		
		
		System.out.println("cores uma a baixo da outra: ");
		System.out.println("\n" + cores.toString());
		
		System.out.println("quantidade de cores: " + cores.size());
		
		System.out.println("ordem alfabetica: ");
		Set<Cores> cores2 = new TreeSet<>(new ComparatorNome());
		cores2.addAll(cores);
		System.out.println(cores2);
		
		List<Cores> cores3 = new ArrayList<>();
		cores3.addAll(cores);
		System.out.println("ordem aleatoria: ");
	    Collections.shuffle(cores3);
	    System.out.println(cores3);
	    
	    List<Cores> cores4 = new ArrayList<>();
	    cores4.addAll(cores3);
	    System.out.println("ordem inversa: ");
	    Collections.reverse(cores4);
	    System.out.println(cores4);
	    
	    System.out.println("Exiba todas as cores que começam com a letra ”a”: ");
        for (Cores cor: cores) {
            if(cor.startsWith("a")) System.out.println("a" + cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “a”: ");
        Iterator<Cores> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("a")) iterator2.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
	    
	}

}

class Cores {
	private String cores;
	
	public Cores(String cores) {
		this.cores = cores;
	}

	public boolean startsWith(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	@Override
	public String toString() {
		return " " + cores + " ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cores other = (Cores) obj;
		return Objects.equals(cores, other.cores);
	}
	
}

class ComparatorNome implements Comparator<Cores>{

	@Override
	public int compare(Cores c1, Cores c2) {

		return c1.getCores().compareToIgnoreCase(c2.getCores());
	}
	
}

