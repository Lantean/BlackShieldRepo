package comum.servico.facade;

import java.util.List;

import comum.servico.dao.ServicoDAO;
import comum.servico.entidade.Servico;

public class ServicoFacade {
	
	private ServicoDAO dao;
	
	public ServicoFacade() {
		dao = new ServicoDAO();
	}
	
	
	public List<Servico> listaServicos(){
		return dao.listaServicos();
	}
	
	public boolean insereServico(Servico s){
		return dao.insereServico(s);
	}
	
	public boolean editaServico(Servico s){
		return dao.editaServico(s);
	}
	
	public boolean excluiServico(Servico s){
		return dao.excluiServico(s);
	}

}
