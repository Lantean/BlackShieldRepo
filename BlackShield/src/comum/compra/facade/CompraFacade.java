package comum.compra.facade;

import java.util.List;

import comum.compra.dao.CompraDAO;
import comum.compra.entidade.Compra;
import comum.produto.entidade.Produto;


public class CompraFacade {
	
	private CompraDAO dao;
	
	public CompraFacade() {
		dao = new CompraDAO();
	}
	
	
	public List<Produto> listaCompra(){
		return dao.listaCompra();
	}
	
	public boolean insereCompra(Compra c){
		return dao.insereCompra(c);
	}
	
	public boolean editaCompra(Compra c){
		return dao.editaCompra(c);
	}
	
	public boolean excluiCompra(Compra c){
		return dao.excluiCompra(c);
	}
	
	

}
