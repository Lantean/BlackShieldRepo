package comum.status.facade;

import java.util.List;

import comum.status.dao.StatusDAO;
import comum.status.entidade.Status;


public class StatusFacade {
	
	private StatusDAO dao;
	
	public StatusFacade() {
		dao = new StatusDAO();
	}
	
	public List<Status> listaStatus(){
		return dao.listaStatus();
	}
	
	public boolean insereStatus(Status s){
		return dao.insereStatus(s);
	}
	
	public boolean editaStatus(Status s){
		return dao.editaStatus(s);
	}
	
	public boolean excluiStatus(Status s){
		return dao.excluiStatus(s);
	}

}
