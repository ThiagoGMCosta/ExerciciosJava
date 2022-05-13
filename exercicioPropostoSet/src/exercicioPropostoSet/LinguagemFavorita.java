package exercicioPropostoSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class LinguagemFavorita {

	public static void main(String[] args) {

		@SuppressWarnings("serial")
		Set<Linguagem> linguagens = new HashSet<>() {{
			add(new Linguagem("Java", 1995, "Eclipse"));
			add(new Linguagem("C#", 1999, "VisualStudio"));
			add(new Linguagem("JavaScript", 1998, "VsCode"));
			add(new Linguagem("Python", 1993, "PyCharm"));
			add(new Linguagem("C#", 1998, "NotePad"));
		}};
		
		for (Linguagem linguagem : linguagens) {
			System.out.println(linguagem);
		}
		
		imprimirTraco();		
		System.out.println("ordem de inserção: ");
		@SuppressWarnings("serial")
		Set<Linguagem> linguagem2 = new LinkedHashSet<>() {{
			add(new Linguagem("Java", 1995, "Eclipse"));
			add(new Linguagem("C#", 1999, "VisualStudio"));
			add(new Linguagem("JavaScript", 1998, "VSCode"));
			add(new Linguagem("Python", 1993, "PyCharm"));
		}};
		for (Linguagem linguagem : linguagem2) {
			System.out.println(linguagem.getNome() + " * " + linguagem.getAno() + " * " +
					" * " + linguagem.getIde());
		}
		
		imprimirTraco();
		System.out.println("ordem natural:");
		Set<Linguagem> linguagens3 = new TreeSet<>(linguagem2);
		for (Linguagem linguagem : linguagens3) {
			System.out.println(linguagem.getNome() + " * " + linguagem.getAno() + " * " +
					" * " + linguagem.getIde());
		}
		
		imprimirTraco();		
		
		Set<Linguagem> linguagens4 = new TreeSet<>(new ComparatorIDE());
		System.out.println("ordem por IDE: ");
		linguagens4.addAll(linguagens);
		for (Linguagem linguagem : linguagens4) {
			System.out.println(linguagem.getNome() + " * " + linguagem.getAno() + " * " 
					 + linguagem.getIde());
		}
		
		imprimirTraco();
		Set<Linguagem> linguagens5 = new TreeSet<>(new ComparatorAnoNome());
		System.out.println("ordem por ano e nome: ");
		linguagens5.addAll(linguagens);
		for (Linguagem linguagem : linguagens5) {
			System.out.println(linguagem.getNome() + " * " + linguagem.getAno() + " * " 
					 + linguagem.getIde());
			
		}
		
		imprimirTraco();
		Set<Linguagem> linguagens6 = new TreeSet<>(new ComparatorNomeAnoCriacao());
		System.out.println("ordem nome, ano e IDE: ");
		linguagens6.addAll(linguagens);
		for (Linguagem linguagem : linguagens6) {
			System.out.println(linguagem);
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void imprimirTraco() {
		System.out.println("*******************************************************************");
	}
}



class Linguagem implements Comparable<Linguagem>{
	private String nome;
	private Integer ano;
	private String ide;
	
	
	public Linguagem(String nome, Integer ano, String ide) {
		this.nome = nome;
		this.ano = ano;
		this.ide = ide;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", ano: " + ano + ", ide: " + ide + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linguagem other = (Linguagem) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Linguagem o) {
		int nomeLinguagem = o.getNome().compareToIgnoreCase(nome);
		return nomeLinguagem;
	}
	
}

class ComparatorIDE implements Comparator<Linguagem>{

	

	@Override
	public int compare(Linguagem o1, Linguagem o2) {
		// TODO Auto-generated method stub
		return o1.getIde().compareToIgnoreCase(o2.getIde());
	}
	
}

class ComparatorAnoNome implements Comparator<Linguagem>{

	@Override
	public int compare(Linguagem o1, Linguagem o2) {
		int ano = o1.getAno().compareTo(o2.getAno());
		if(ano != 0) return ano;
		
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}
	
}

class ComparatorNomeAnoCriacao implements Comparator<Linguagem>{

	@Override
	public int compare(Linguagem o1, Linguagem o2) {
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if(nome != 0) return nome;
		
		int ano = Integer.compare(o1.getAno(), o2.getAno());
		if(ano != 0) return ano;
		
		return o1.getIde().compareToIgnoreCase(o2.getIde());
		
		
	}
	
}