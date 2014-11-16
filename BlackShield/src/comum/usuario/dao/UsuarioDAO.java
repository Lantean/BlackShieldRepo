package comum.usuario.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.Base;
import comum.usuario.entidade.Usuario;

public class UsuarioDAO {
	
	public List<Usuario> listaUsuarios(){
		
		Session session = null;
		Transaction tran = null;
		Query query = null;
		List<Usuario> lista = null;
		
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			
			query = session.createQuery("from Usuario");
			lista = query.list();
			tran.commit();
			
			
			
			
		} catch (HibernateException e) {
			System.out.println("Falha ao listar os usuários");
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Falha ao fechar a operação de listagem de usuários");
				e.printStackTrace();
			}
		}
		
		return lista;
	}
	

	public boolean insereUsuario(Usuario u){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.save(u);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir usuário");
			e.printStackTrace();
			return false;
			
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de inserção de usuário");
				e.printStackTrace();
			}
		}
		
	}
	

	public boolean editaUsuario(Usuario u){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.update(u);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir editar o usuário");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de edição de usuário");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean excluiUsuario(Usuario u){
		

		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.delete(u);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao excluir o usuário");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de exclusão de usuário");
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
