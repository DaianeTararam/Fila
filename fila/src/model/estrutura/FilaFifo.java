package model.estrutura;

import java.lang.Exception;
import model.estrutura.No;

public class FilaFifo<T> {
	private No<T> inicio = null;
	private No<T> fim = null;
	
	public void enqueue(T elemento) throws Exception{
		No<T> memoria = new No<>(elemento);
		if (this.inicio == null) {
			this.inicio = memoria;
			this.fim = memoria;
		} else {
					
			this.fim.setProximo(memoria);
			this.fim = memoria;
			
		}
	}
	
	public No<T> dequeue(T elemento){
		No<T> primeiro = this.inicio;
		this.inicio = primeiro.getProximo();
		return primeiro;
		
	}
	
	@Override
	public String toString(){
		if(this.inicio == null){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No<T> memoriaInicio = this.inicio;
		builder.append(memoriaInicio.getValor());
		while(memoriaInicio.getProximo() != null){
			builder.append(", ");
			memoriaInicio = memoriaInicio.getProximo();
			builder.append(memoriaInicio.getValor());
		}
		builder.append("]");
		return builder.toString();
	}
	
}