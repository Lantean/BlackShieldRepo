package comum.produto.dao;

import java.util.List;

import org.hibernate.*;

import util.Base;
import comum.produto.entidade.Produto;

public class ProdutoDAO {
	
	public List<Produto> listaProdutos(){
		
		Session session = null;
		Transaction tran = null;
		Query query = null;
		List<Produto> lista = null;
		
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			
			query = session.createQuery("from Produto");
			lista = query.list();
			tran.commit();
			
			
			
			
		} catch (HibernateException e) {
			System.out.println("Falha ao listar");
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Falha ao fechar a operação de listagem");
				e.printStackTrace();
			}
		}
		
		return lista;
	
		
		
	}
	
	public boolean insereProduto(Produto p){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.save(p);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir Produto");
			e.printStackTrace();
			return false;
			
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão");
				e.printStackTrace();
			}
		}
		
	}
	
	
	public boolean editaProduto(Produto p){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.update(p);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao editar o produto");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão de edição de produto");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean excluiProduto(Produto p){
		

		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.delete(p);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao excluir Produto");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sessão");
				e.printStackTrace();
			}
		}
		
		
	}

}
