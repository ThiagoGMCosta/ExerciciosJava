package sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class OrdenarElementosSets {

	public static void main(String[] args) {

		System.out.println("ordem aleatoria: ");
		Set<Serie> series = new HashSet<>() {{
			add(new Serie("got", "fantasia",60));
			add(new Serie("dark", "drama",60));
			add(new Serie("lost", "comedia",25));
		}};
		for (Serie serie : series) {
			System.out.println(serie.getNome()+" * " + 
		serie.getGenero() + " * " + serie.getTempoEpisodio());
		}
		System.out.println("=-------------------=----------------=-----------------");
		System.out.println("ordem de inserção: ");
		Set<Serie> series2 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia",60));
			add(new Serie("dark", "drama",60));
			add(new Serie("lost", "comedia",25));
		}};
		for (Serie serie : series2) {
			System.out.println(serie.getNome()+" * " + 
					serie.getGenero() + " * " + serie.getTempoEpisodio());
		}
		
		System.out.println("=-------------------------=----------===================");
		System.out.println("ordem natural:");
		Set<Serie> series3 = new TreeSet<>(series2);
		for (Serie serie : series3) {
			System.out.println(serie.getNome()+" * " + 
					serie.getGenero() + " * " + serie.getTempoEpisodio());
		}
		
		System.out.println("-==============-===============-=======================");
		System.out.println("ordem nome/genero/tempoEpisodio");
		Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
		series4.addAll(series);
		for (Serie serie : series4) {
			System.out.println(serie.getNome()+" * " + 
					serie.getGenero() + " * " + serie.getTempoEpisodio());
		}
		
		System.out.println("========================================================");
		System.out.println("ordem genero e tempoEpisodio");
		Set<Serie> series5 = new TreeSet<>(new ComparatorGeneroTempo());
		series5.addAll(series);
		for (Serie serie : series5) {
			System.out.println(serie.getNome()+" * " + 
					serie.getGenero() + " * " + serie.getTempoEpisodio());
		}
	}

}



class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return this.getGenero().compareTo(serie.getGenero());
	}
}

class ComparatorNomeGeneroTempo implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	 
}

class ComparatorGeneroTempo implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}