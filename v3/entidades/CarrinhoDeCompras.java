package trabalhoBackend.entidades;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "carrinhodecompras")
public class CarrinhoDeCompras {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column (name="cod_carrinhodecompras")
		private Integer cod_carrinhodecompras;
	    
		@NotNull
		@Size(min = 1, max = 50)
		@Column(name="quantidade", nullable = false, length=50)
		private Integer quantidade;
		
		@ManyToOne
		@JoinColumn(name="cod_produto", referencedColumnName = "cod_produto")
		private Produto produto;


		
		public CarrinhoDeCompras(Integer cod_carrinhodecompras, Integer quantidade,
				Produto produto) {
			super();
			this.cod_carrinhodecompras = cod_carrinhodecompras;
			this.quantidade = quantidade;
			this.produto = produto;
		}



		public CarrinhoDeCompras() {
			super();
		}



		public Integer getCod_carrinhoDeCompras() {
			return cod_carrinhodecompras;
		}

		public void setCod_carrinhoDeCompras(Integer cod_carrinhodecompras) {
			this.cod_carrinhodecompras = cod_carrinhodecompras;
		}

		

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		
}
