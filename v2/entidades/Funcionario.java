package trabalhoBackend.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_funcionario;
	
	@NotNull
	@Size(min = 5, max = 100)
	@Column(name="nome_funcionario", nullable = false, length=50)
	private String nome_funcionario;
	
	@NotNull
	@Size(min = 11, max = 11)
	@Column(name="cpf_funcionario", nullable = false, length=11)
	private Integer cpf_funcionario;

	public Funcionario(Integer cod_funcionario, String nome_funcionario,
			Integer cpf_funcionario) {
		super();
		this.cod_funcionario = cod_funcionario;
		this.nome_funcionario = nome_funcionario;
		this.cpf_funcionario = cpf_funcionario;
	}

	public Funcionario() {
		super();
	}

	public Integer getCod_funcionario() {
		return cod_funcionario;
	}

	public void setCod_funcionario(Integer cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public Integer getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(Integer cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}
	

	

}
