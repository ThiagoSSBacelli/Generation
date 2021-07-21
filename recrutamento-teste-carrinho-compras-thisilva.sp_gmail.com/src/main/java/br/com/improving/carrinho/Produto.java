package br.com.improving.carrinho;

/**
 * Classe que representa um produto que pode ser adicionado
 * como item ao carrinho de compras.
 *
 * Importante: Dois produtos são considerados iguais quando ambos possuem o
 * mesmo código.
 */
public class Produto {

	
    private Long codigo;
    private String descricao;

    
    
    /**
     * Construtor da classe Produto.
     *
     * @param codigo
     * @param descricao
     */
    public Produto(Long codigo, String descricao) {
    	
    	this.codigo = codigo;
		this.descricao = descricao;
    	
    }

	/**
     * Retorna o código da produto.
     *
     * @return Long
     */
    public Long getCodigo() {
    	return this.codigo;
    }

    /**
     * Retorna a descrição do produto.
     *
     * @return String
     */
    public String getDescricao() {
		return this.descricao;
    }
}

/*package br.com.improving.carrinho.mainteste;

import java.math.BigDecimal;

import br.com.improving.carrinho.CarrinhoCompras;
import br.com.improving.carrinho.Produto;

public class MainTeste {
	
	public static void main(String[] args) {
		
		CarrinhoCompras carrinho = new CarrinhoCompras();
		Produto produto = new Produto(1L, "Chocolate");
		
		carrinho.adicionarItem(produto, new BigDecimal("0.6"), 2) ;
		
	}

}
*/