package comum.perfil.entidade;

import java.io.Serializable;



import javax.persistence.*;


@Entity
@Table ( name = "perfil")
public class Perfil implements Serializable {
	
	@Id
	@GeneratedValue
	@Column (name = "idPerfil")
	private Integer idPerfil;
	
	@Column (name = "descricaoPerfil")
	private String descricaoPerfil;
	
	@Column (name = "isAdmin")
	private String isAdmin;
	
	
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}
	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	

}
