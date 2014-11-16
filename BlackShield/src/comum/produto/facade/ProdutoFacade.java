package comum.produto.facade;

import java.util.List;

import comum.produto.dao.ProdutoDAO;
import comum.produto.entidade.Produto;


public class ProdutoFacade {
	
	private ProdutoDAO dao;
	
	public ProdutoFacade() {
		dao = new ProdutoDAO();
	}
	
	public List<Produto> listaProdutos(){
		return dao.listaProdutos();
	}
	
	public boolean insereProduto(Produto p){
		return dao.insereProduto(p);
	}
	
	
	public boolean editaProduto(Produto p){
		return dao.editaProduto(p);
	}
	
	public boolean excluiProduto(Produto p){
		return dao.excluiProduto(p);
	}
	
	
	

}
