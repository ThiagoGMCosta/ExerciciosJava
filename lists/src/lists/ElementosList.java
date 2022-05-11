package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ElementosList {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        System.out.println("odem de inserção: ");
        System.out.println(gatos);
        
        System.out.println("ordem aleatoria: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        
        System.out.println("ordem natural: ");
        Collections.sort(gatos);
        System.out.println(gatos);
        
        System.out.println("ordem idade: ");
        Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        
        System.out.println("ordem por cor: ");
        Collections.sort(gatos, new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        
        System.out.println("ordem por nome, idade e cor");
        Collections.sort(gatos, new ComparatorNomeIdadeCor());
        gatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(gatos);
        
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(getNome()) ;
	}
	
	
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato o1, Gato o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato o1, Gato o2) {
		// TODO Auto-generated method stub
		return o1.getCor().compareTo(o2.getCor());
	}
	
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{

	@Override
	public int compare(Gato o1, Gato o2) {

		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if (nome != 0) {
			return nome;
		}
		
		int idade = Integer.compare(o1.getIdade(), o2.getIdade());
		if(idade != 0) {
			return idade;
		}
		
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
	
}
