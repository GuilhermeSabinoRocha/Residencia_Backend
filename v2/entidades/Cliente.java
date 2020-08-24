package trabalhoBackend.entidades;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cliente;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="nome_completo", nullable = false, length=50)
	private String nome_completo;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="data_nascimento", nullable = false)
	private Date data_nascimento;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="nome_usuario", nullable = false, length=50)
	private String nome_usuario;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="e_mail", nullable = false, length=50)
	private String e_mail;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="endereco", nullable = false, length=50)
	private String endereco;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="cpf_cliente", nullable = false, length=50)
	private String cpf_cliente;

	public Cliente(Integer cod_cliente, String nome_completo,
			Date data_nascimento,String nome_usuario, String e_mail,
			String endereco,  String cpf_cliente) {
		super();
		this.cod_cliente = cod_cliente;
		this.nome_completo = nome_completo;
		this.data_nascimento = data_nascimento;
		this.nome_usuario = nome_usuario;
		this.e_mail = e_mail;
		this.endereco = endereco;
		this.cpf_cliente = cpf_cliente;
	}

		
	public Cliente() {
		super();
	}

	public Integer getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	
	
}
