package comum.pedidoservico.facade;

import java.util.List;

import comum.pedidoservico.dao.PedidoServicoDAO;
import comum.pedidoservico.entidade.PedidoServico;


public class PedidoServicoFacade {
	
	private PedidoServicoDAO dao;
	
	public PedidoServicoFacade() {
		dao = new PedidoServicoDAO();
	}
	
	
	

	public List<PedidoServico> listaPedidosServico(){
		return dao.listaPedidosServico();
	}
	
	public boolean inserePedidoServico(PedidoServico p){
		return dao.inserePedidoServico(p);
	}
	
	public boolean editaPedidoServico(PedidoServico p){
		return dao.editaPedidoServico(p);
	}
	
	public boolean excluiPedidoServico(PedidoServico s){
		return dao.excluiPedidoServico(s);
	}
	
}
