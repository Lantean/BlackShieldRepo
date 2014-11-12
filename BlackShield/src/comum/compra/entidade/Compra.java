package comum.compra.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

import comum.produto.entidade.Produto;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue
	@Column(name="idCompra")
	private Integer idCompra;
	
	@Column(name="produto")
	private Produto produto;
	// private Status status;
	// private double quantidade
	
	
	
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
