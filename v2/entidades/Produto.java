package trabalhoBackend.entidades;

import java.util.*;
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
		private Integer cod_produto;
		
		@NotNull
		@Size(min = 3, max = 100)
		@Column(name="nome_produto", nullable = false, length=100)
		private String nome_produto;
		
		@NotNull
		@Size(min = 5, max = 500)
		@Column(name="descricao_produto", nullable = false, length=500)
		private String descricao_produto;
		

		@NotNull
		@Size(min = 1, max = 50)
		@Column(name="valor_unitario", nullable = false, length=50)
		private double valor_unitario;
		
		@Temporal(TemporalType.DATE)
		@JsonFormat(pattern="dd-MM-yyyy")
		@Column(name="data_fabricacao", nullable = false)
		private Date data_fabricacao;
		
		
		@ManyToOne
		@JoinColumn(name = "cod_categoria", referencedColumnName = "cod_produto")
		private Categoria categoria;
		
		@ManyToOne
		@JoinColumn(name = "cod_funcionario", referencedColumnName = "cod_produto")
		private Funcionario funcionario;
				
		@NotNull
		@Size(min = 1, max = 50)
		@Column(name="quant_estoque", nullable = false, length=50)
		private Integer quant_estoque;

		
		
		public Produto() {
			super();
		}



		public Integer getCod_produto() {
			return cod_produto;
		}



		public void setCod_produto(Integer cod_produto) {
			this.cod_produto = cod_produto;
		}



		public String getNome_produto() {
			return nome_produto;
		}



		public void setNome_produto(String nome_produto) {
			this.nome_produto = nome_produto;
		}



		public String getDescricao_produto() {
			return descricao_produto;
		}



		public void setDescricao_produto(String descricao_produto) {
			this.descricao_produto = descricao_produto;
		}



		public double getValor_unitario() {
			return valor_unitario;
		}



		public void setValor_unitario(double valor_unitario) {
			this.valor_unitario = valor_unitario;
		}



		public Date getData_fabricacao() {
			return data_fabricacao;
		}



		public void setData_fabricacao(Date data_fabricacao) {
			this.data_fabricacao = data_fabricacao;
		}



		public Categoria getCategoria() {
			return categoria;
		}



		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}



		public Funcionario getFuncionario() {
			return funcionario;
		}



		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}



		public Integer getQuant_estoque() {
			return quant_estoque;
		}



		public void setQuant_estoque(Integer quant_estoque) {
			this.quant_estoque = quant_estoque;
		}
		
		
		
}
