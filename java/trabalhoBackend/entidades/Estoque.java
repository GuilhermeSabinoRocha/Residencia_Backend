package trabalhoBackend.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="estoque")
public class Estoque {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer cod_estoque;
		
		@NotNull
		@Size(min = 1, max = 100)
		@Column(name="quantidade_estoque", nullable = false, length=100)
		private Integer quantidade_estoque;
		
		

	
}
