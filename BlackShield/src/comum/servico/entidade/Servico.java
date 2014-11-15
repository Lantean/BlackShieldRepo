package comum.servico.entidade;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "servico")
public class Servico implements Serializable{
	
	
	@Id
	@GeneratedValue
	@Column (name = "idServico")
	private Integer idServico;
	
	@Column(name = "nomeServico")
	private String nome;
	
	@Column(name = "descricaoServico")
	private String descricao;
	
	@Column(name = "custoServico")
	private double custo;
	
	
	
	
	

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	

}
