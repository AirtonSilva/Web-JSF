package br.edu.ifpb.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.entidade.Inversao;

@RequestScoped
@ManagedBean
public class InversaoBean {
	
	private Inversao inversao;
	private String auxiliar;
	
	public Inversao getInversao() {
		return inversao;
	}
	
	public String inverter(){
		
		auxiliar = inversao.getCampo1();
		inversao.setCampo1(inversao.getCampo2());
		inversao.setCampo2(auxiliar);
		
		System.out.println(inversao.getCampo1());
		System.out.println(inversao.getCampo2());
		return null;
		
	}

	public void setInversao(Inversao inversao) {
		this.inversao = inversao;
	}

	public InversaoBean() {
		this.inversao = new Inversao();	
	}
	
}
