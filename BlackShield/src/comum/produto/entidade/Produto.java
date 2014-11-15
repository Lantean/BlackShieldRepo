package comum.produto.entidade;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "produto")
public class Produto implements Serializable{
	
	
	@Id
	@GeneratedValue
	@Column(name = "idProduto")
	private Integer idProduto;
	
	@Column(name = "nomeProduto")
	private String nome;
	
	@Column(name = "descricaoProduto")
	private String descricao;
	
	@Column(name = "custoProduto")
	private double custo;
	
	
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
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
