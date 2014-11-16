package comum.compra.dao;

import java.util.List;

import org.hibernate.*;

import util.Base;
import comum.compra.entidade.Compra;
import comum.produto.entidade.Produto;

public class CompraDAO {
	
	public List<Produto> listaCompra(){
		
		Session session = null;
		Transaction tran = null;
		Query query = null;
		List<Produto> lista = null;
		
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			
			query = session.createQuery("from Compra");
			lista = query.list();
			tran.commit();
			
			
			
			
		} catch (HibernateException e) {
			System.out.println("Falha ao listar compras");
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Falha ao fechar a operação de listagem de compras");
				e.printStackTrace();
			}
		}
		
		return lista;
	
		
		
	}
	
	public boolean insereCompra(Compra c){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.save(c);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir compra");
			e.printStackTrace();
			return false;
			
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de inserção de compra");
				e.printStackTrace();
			}
		}
		
	}
	
	
	public boolean editaCompra(Compra c){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.update(c);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao editar o a compra");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de edição de compra");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean excluiCompra(Compra c){
		

		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.delete(c);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao excluir compra");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de exclusão de compra");
				e.printStackTrace();
			}
		}
		
		
	}

}
