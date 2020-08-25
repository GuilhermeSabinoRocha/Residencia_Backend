package org.serratec.backend.ecommerce.entidades;

public class Consultas {
	public interface ProdutosPorCategoria {
		public String getCategoria();
		public Integer getTotal();
	}
	
	public interface ProdutosPorFuncionario {
		public String getFuncionario();
		public Integer getTotal();
	}
}
