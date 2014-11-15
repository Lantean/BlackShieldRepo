package comum.compra.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import comum.produto.entidade.Produto;
import comum.status.entidade.Status;
import comum.usuario.entidade.Usuario;

@Entity
@Table (name = "venda")
public class Compra implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="idCompra")
	private Integer idCompra;
	
	
	@Column (name = "quantidadeVenda")
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn (name = "idProduto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn (name = "idStatus")
	private Status status;
	
	@ManyToOne
	@JoinColumn (name = "idUsuario")
	private Usuario usuario;

	
	
	
	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
}
