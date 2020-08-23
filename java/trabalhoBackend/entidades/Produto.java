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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
		
		@NotNull
		@Size(min = 5, max = 50)
		@Column(name="data_fabricacao", nullable = false, length=50)
		private Date data_fabricacao;
		

		@NotNull
		@Size(min = 1, max = 50)
		@Column(name="cod_categoria", nullable = false, length=50)
		private Integer cod_categoria;
		
		@ManyToOne
		@JoinColumn(name = "cod_categoria", referencedColumnName = "cod_produto")
		private Categoria categoria;
				

		@ManyToMany( )
		@JoinTable(name = "pedido" , 
			joinColumns = @JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto"),
			inverseJoinColumns = @JoinColumn(name = "cod_pedido", referencedColumnName = "cod_pedido"))
		private Set<Pedido> pedidos;
		
		@NotNull
		@Size(min = 1, max = 50)
		@Column(name="cod_estoque", nullable = false, length=50)
		private Integer cod_estoque;
		
		@ManyToOne
		@JoinColumn(name = "cod_estoque", referencedColumnName = "cod_produto")
		private Estoque estoque;
		



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




		public Integer getCod_categoria() {
			return cod_categoria;
		}




		public void setCod_categoria(Integer cod_categoria) {
			this.cod_categoria = cod_categoria;
		}




		public Categoria getCategoria() {
			return categoria;
		}




		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}




		public Set<Pedido> getPedidos() {
			return pedidos;
		}




		public void setPedidos(Set<Pedido> pedidos) {
			this.pedidos = pedidos;
		}




		public Integer getCod_estoque() {
			return cod_estoque;
		}




		public void setCod_estoque(Integer cod_estoque) {
			this.cod_estoque = cod_estoque;
		}




		public Estoque getEstoque() {
			return estoque;
		}




		public void setEstoque(Estoque estoque) {
			this.estoque = estoque;
		}


		
		
		
}
