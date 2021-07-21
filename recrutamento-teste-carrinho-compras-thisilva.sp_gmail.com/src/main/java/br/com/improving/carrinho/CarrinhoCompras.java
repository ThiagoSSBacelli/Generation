package br.com.improving.carrinho;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Classe que representa o carrinho de compras de um cliente.
 */
public class CarrinhoCompras {

	private List<Item> listaItens;

	
	public CarrinhoCompras() {
		this.listaItens =  new ArrayList<>();;
	}

	/**
	 * Permite a adição de um novo item no carrinho de compras.
	 *
	 * Caso o item já exista no carrinho para este mesmo produto, as seguintes regras deverão ser
	 * seguidas: - A quantidade do item deverá ser a soma da quantidade atual com a quantidade
	 * passada como parâmetro. - Se o valor unitário informado for diferente do valor unitário atual
	 * do item, o novo valor unitário do item deverá ser o passado como parâmetro.
	 *
	 * Devem ser lançadas subclasses de RuntimeException caso não seja possível adicionar o item ao
	 * carrinho de compras.
	 *
	 * @param produto
	 * @param valorUnitario
	 * @param quantidade
	 */
	public void adicionarItem(Produto produto, BigDecimal valorUnitario, int quantidade) {

		if (listaItens.size() != 0) {

			for (int x = 0; x <= listaItens.size(); x++) {
				Item item = listaItens.get(x);
				Produto produtoDoCarrinho = item.getProduto();

				int quantidadeDoItem = item.getQuantidade();
				BigDecimal valorUniAtual = item.getValorUnitario();

				if (produtoDoCarrinho.getCodigo() == produto.getCodigo()) {
					quantidadeDoItem = quantidadeDoItem + quantidade;
					if (valorUnitario != valorUniAtual) {
						valorUniAtual = valorUnitario;
					}
				} else {
					Item novoItem = new Item(produto, valorUnitario, quantidade);
					listaItens.add(novoItem);
				}
			}

		} else {
			Item novoItem = new Item(produto, valorUnitario, quantidade);
			listaItens.add(novoItem);
		}
	}

	/**
	 * Permite a remoção do item que representa este produto do carrinho de compras.
	 *
	 * @param produto
	 * @return Retorna um boolean, tendo o valor true caso o produto exista no carrinho de compras e
	 *         false caso o produto não exista no carrinho.
	 */
	public boolean removerItem(Produto produto) {
		boolean itemRemovido = false;
		for (int x = 0; x <= listaItens.size(); x++) {
			Item item = listaItens.get(x);
			Produto produtoDoCarrinho = item.getProduto();

			if (produtoDoCarrinho == produto) {
				listaItens.remove(x);
				itemRemovido = true;
			}
			itemRemovido = false;
		}
		return itemRemovido;
	}

	/**
	 * Permite a remoção do item de acordo com a posição. Essa posição deve ser determinada pela
	 * ordem de inclusão do produto na coleção, em que zero representa o primeiro item.
	 *
	 * @param posicaoItem
	 * @return Retorna um boolean, tendo o valor true caso o produto exista no carrinho de compras e
	 *         false caso o produto não exista no carrinho.
	 */
	public boolean removerItem(int posicaoItem) {
		listaItens.remove(posicaoItem);
		if (listaItens.get(posicaoItem).equals(null)) {
			return true;
		}
		return false;
	}

	/**
	 * Retorna o valor total do carrinho de compras, que deve ser a soma dos valores totais de todos
	 * os itens que compõem o carrinho.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getValorTotal() {
		BigDecimal soma = null;

		for (int x = 0; x <= listaItens.size(); x++) {
			Item item = listaItens.get(x);
			BigDecimal valorUniAtual = item.getValorUnitario();
			soma = soma.add(valorUniAtual);
		}
		return soma;
	}

	/**
	 * Retorna a lista de itens do carrinho de compras.
	 *
	 * @return itens
	 */
	public Collection<Item> getItens() {
		return this.listaItens;
	}
}