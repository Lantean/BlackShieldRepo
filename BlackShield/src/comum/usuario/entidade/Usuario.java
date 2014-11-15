package comum.usuario.entidade;

import java.io.Serializable;

import javax.persistence.*;

import comum.perfil.entidade.Perfil;



@Entity
@Table (name = "usuario")
public class Usuario implements Serializable{

	
	
	@Id
	@GeneratedValue
	@Column (name = "idUsuario")
	private String idUsuario;
	
	@Column (name = "nomeUsuario")
	private String nome;
	
	@Column (name= "emailUsuario")
	private String email;
	
	@Column (name = "rgUsuario")
	private String rg;
	
	@Column (name = "cpfUsuario")
	private String cpf;
	
	@Column (name = "senhaUsuario")
	private String senha;
	
	@ManyToOne
	@JoinColumn (name = "idPerfil")
	private Perfil perfil;
	
	public Usuario() {
		perfil = new Perfil();
	}

	
	
	
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
