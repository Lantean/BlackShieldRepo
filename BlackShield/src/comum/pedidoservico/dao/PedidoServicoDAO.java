package comum.pedidoservico.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.Base;
import comum.pedidoservico.entidade.PedidoServico;

public class PedidoServicoDAO {
	
	public List<PedidoServico> listaPedidosServico(){
		
		Session session = null;
		Transaction tran = null;
		Query query = null;
		List<PedidoServico> lista = null;
		
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			
			query = session.createQuery("from PedidoServico");
			lista = query.list();
			tran.commit();
			
			
			
			
		} catch (HibernateException e) {
			System.out.println("Falha ao listar os pedidos de servi�o");
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Falha ao fechar a opera��o de listagem de pedidos de servi�o");
				e.printStackTrace();
			}
		}
		
		return lista;
	}

	public boolean inserePedidoServico(PedidoServico p){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.save(p);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir pedido de servi�o");
			e.printStackTrace();
			return false;
			
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sess�o de inser��o de pedido de servi�o");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean editaPedidoServico(PedidoServico p){
		
		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.update(p);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao inserir editar o pedido de servi�o");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sess�o de edi��o de pedido de servi�o");
				e.printStackTrace();
			}
		}
		
	}

	public boolean excluiPedidoServico(PedidoServico s){
		

		Session session = null;
		Transaction tran = null;
		
		try {
			
			session = Base.getSessionfactory().openSession();
			tran = session.beginTransaction();
			session.delete(s);
			tran.commit();
			
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Falha ao excluir o pedido de servi�o");
			e.printStackTrace();
			return false;
		} finally{
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a sess�o de exclus�o de pedido de servi�o");
				e.printStackTrace();
			}
		}
		
		
	}
	
}
