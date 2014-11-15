package comum.status.entidade;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table (name = "status")
public class Status implements Serializable{
	
	@Id
	@GeneratedValue
	@Column (name = "idStatus")
	private Integer idStatus;
	
	@Column (name = "descricaoStatus")
	private String descricaoStatus;

}
