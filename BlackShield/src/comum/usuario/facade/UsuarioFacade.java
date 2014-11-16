package comum.usuario.facade;

import java.util.List;

import comum.usuario.dao.UsuarioDAO;
import comum.usuario.entidade.Usuario;

public class UsuarioFacade {

	private UsuarioDAO dao;
	
	public UsuarioFacade() {
		dao = new UsuarioDAO();
	}
	
	
	public List<Usuario> listaUsuarios(){
		return dao.listaUsuarios();
	}
	
	public boolean insereUsuario(Usuario u){
		return dao.insereUsuario(u);
	}
	
	public boolean editaUsuario(Usuario u){
		return dao.editaUsuario(u);
	}
	
	public boolean excluiUsuario(Usuario u){
		return dao.excluiUsuario(u);
	}
	
}

