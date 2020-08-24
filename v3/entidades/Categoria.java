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
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_categoria;
	
	@NotNull
	@Size(min = 2, max = 50)
	@Column(name = "nome_categoria", nullable = false, length = 50)
	private String nome_categoria;
	
	@NotNull
	@Size(min = 2, max = 200)
	@Column(name = "descricao_categoria", nullable = false, length = 200)
	private String descricao_categoria;

	

	public Categoria(Integer cod_categoria, String nome_categoria,
			String descricao_categoria) {
		super();
		this.cod_categoria = cod_categoria;
		this.nome_categoria = nome_categoria;
		this.descricao_categoria = descricao_categoria;
	}
	
	
	public Categoria() {
		super();
	}




	public Integer getCod_categoria() {
		return cod_categoria;
	}


	public void setCod_categoria(Integer cod_categoria) {
		this.cod_categoria = cod_categoria;
	}


	public String getNome_categoria() {
		return nome_categoria;
	}


	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}


	public String getDescricao_categoria() {
		return descricao_categoria;
	}


	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao_categoria = descricao_categoria;
	}
	
	

}
