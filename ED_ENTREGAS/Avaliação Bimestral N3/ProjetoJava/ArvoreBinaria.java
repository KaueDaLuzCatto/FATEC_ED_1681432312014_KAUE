import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArvoreBinaria {
    No raiz;
    ArrayList<No> listaNos;
    
    public ArvoreBinaria() {
    	raiz = null;
    	listaNos = new ArrayList<>();
    }
    
	public No inserir(No atual, int valor) {
		if(atual == null) {
			 No novoNo = new No(valor);
			listaNos.add(novoNo);
	        return novoNo;
		}
		
		if(valor < atual.valor) { // Se o valor inserido for menor que o valor do nó atual:
			atual.esquerda = inserir(atual.esquerda, valor); // Chama a própria função para inserir no nó esquerdo caso esteja vazio
		}
		else if(valor > atual.valor) { // Se o valor inserido for maior que o valor do nó atual:
			atual.direita = inserir(atual.direita, valor); // Chama a própria função para inserir no nó direito caso esteja vazio
		}
		
		return atual;
	}
	public void comeca(int valor) { //Começa a recursividade inserindo um novo nó
	    raiz = inserir(raiz, valor);
	}
	
	public void emOrdem(No atual, StringBuilder resultado) {
	    if (atual != null) {
	        emOrdem(atual.esquerda, resultado); // Vai para o nó esquerdo
	        resultado.append("valor: ").append(atual.valor).append("\n"); //Concatena os valores em um StringBuilder para exibí-los futuramente
	        emOrdem(atual.direita, resultado);  // Vai para o nó direito
	    }
	}

	public void exibirEmOrdem() {
	    StringBuilder resultado = new StringBuilder();
	    resultado.append("Valores em ordem\n");
	    emOrdem(raiz, resultado); //chama o emOrdem para ordenar os valores
	    JOptionPane.showMessageDialog(null, resultado.toString(), "Em Ordem", JOptionPane.INFORMATION_MESSAGE); // Mostra em ordem
	}
}