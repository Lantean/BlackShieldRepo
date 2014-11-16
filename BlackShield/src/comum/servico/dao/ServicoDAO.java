package comum.servico.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.Base;
import comum.servico.entidade.Servico;

public class ServicoDAO {
	
	public List<Servico> listaServicos(){
		
		Session session = null;
		Transaction tran = null;
		Query query = null;
		List<Servico> lista = null;
		
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			
			query = session.createQuery("from Servico");
			lista = query.list();
			tran.commit();
			
			
			
			
		} catch (HibernateException e) {
			System.out.println("Falha ao listar os serviços");
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Falha ao fechar a operação de listagem de serviços");
				e.printStackTrace();
			}
		}
		
		return lista;
	}
	
	public boolean insereServico(Servico s){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.save(s);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir serviço");
			e.printStackTrace();
			return false;
			
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de inserção de serviço");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean editaServico(Servico s){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.update(s);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir editar o serviço");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de edição de serviço");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean excluiServico(Servico s){
		
	
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.delete(s);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao excluir o serviço");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de exclusão de serviço");
				e.printStackTrace();
			}
		}
		
		
	}

}
