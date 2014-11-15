package comum.pedidoservico.entidade;


import java.io.Serializable;

import javax.persistence.*;

import comum.servico.entidade.Servico;
import comum.usuario.entidade.Usuario;



@Entity
@Table (name = "solicitacaoServico")
public class PedidoServico implements Serializable{

	@Id
	@GeneratedValue
	@Column (name = "idSolicitacao")
	private Integer idSolicitacao;
	
	@Column (name = "descricaoSolicitacao")
	private String descricaoSolicitacao;
	
	@ManyToOne
	@JoinColumn (name = "idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (name = "idServico")
	private Servico servico;

	
	
	
	
	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(Integer idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public String getDescricaoSolicitacao() {
		return descricaoSolicitacao;
	}

	public void setDescricaoSolicitacao(String descricaoSolicitacao) {
		this.descricaoSolicitacao = descricaoSolicitacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
}
