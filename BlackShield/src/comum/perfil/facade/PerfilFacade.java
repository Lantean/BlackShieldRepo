package comum.perfil.facade;

import java.util.List;

import comum.perfil.dao.PerfilDAO;
import comum.perfil.entidade.Perfil;


public class PerfilFacade {
	
	private PerfilDAO dao;
	
	public PerfilFacade() {
		dao = new PerfilDAO();
	}
	
	public List<Perfil> listaPerfil(){
		return dao.listaPerfil();
	}
	
	public boolean inserePerfil(Perfil p){
		return dao.inserePerfil(p);
	}
	
	public boolean editaPerfil(Perfil p){
		return dao.editaPerfil(p);
	}
	
	public boolean excluiPerfil(Perfil p){
		return dao.excluiPerfil(p);
	}


}
