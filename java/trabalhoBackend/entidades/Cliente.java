package trabalhoBackend.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cliente;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="nome_completo", nullable = false, length=30)
	private String nome_completo;

}
