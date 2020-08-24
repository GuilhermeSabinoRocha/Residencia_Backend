package trabalhoBackend.entidades;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

@Entity
@Table (name = "carrinhoDeCompras")
public class CarrinhoDeCompras {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer cod_carrinhoDeCompras;
		
		@DecimalMin(value = "1", inclusive = true)
		@DecimalMax(value = "999", inclusive = true)
		@Column(name="quantidade", nullable = false, scale = 3)
		private Integer quantidade;
		
		@ManyToOne
		@JoinColumn(name="cod_produto", referencedColumnName = "cod_carrinhoDeCompras", nullable = false)
		private Produto produto;

		public Integer getCod_carrinhoDeCompras() {
			return cod_carrinhoDeCompras;
		}

		public void setCod_carrinhoDeCompras(Integer cod_carrinhoDeCompras) {
			this.cod_carrinhoDeCompras = cod_carrinhoDeCompras;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		
}
