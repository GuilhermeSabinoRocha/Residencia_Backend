package org.serratec.backend.ecommerce.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(min=3, max=40)
	@Column(name="nome", nullable=false, length=40)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="categoria_id", referencedColumnName = "id", nullable = false)
	private Categoria categoria;
	
	@NotNull
	@Size(min=3, max=50)
	@Column(name="descricao", nullable = true, length= 50)
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="data_fabricacao", nullable = false)
	private Date dataFabricacao;
	
	@NotNull
	@Column(name="quantidade_estoque", nullable = false)
	private Integer quantidadeEstoque;
	
	@NotNull
	@Column(name="valor_unitario", nullable = false)
	private Long valorUnitario;
	
	@ManyToOne
	@JoinColumn(name="funcionario_id", referencedColumnName = "id", nullable = false)
	private Funcionario funcionarioId;
	
		
	public interface ProdutosPorCategoria {
		public String getCategoria();
		public Integer getTotal();
	}
	
	public interface ProdutosPorFuncionario {
		public String getFuncionario();
		public Integer getTotal();
	}
	
	

	public Produto(Integer id, String nome, Categoria categoria,
			 String descricao, Date dataFabricacao, Integer quantidadeEstoque,
			 Long valorUnitario, Funcionario funcionarioId) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorUnitario = valorUnitario;
		this.funcionarioId = funcionarioId;
	}
	
	

	public Produto() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Long getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Long valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Funcionario getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(Funcionario funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	
	
}

