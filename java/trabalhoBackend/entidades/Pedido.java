package trabalhoBackend.entidades;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_pedido;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="data_pedido", nullable = false, length=50)
	private Date data_pedido;
	
	@NotNull
	@Size(min = 5, max = 50)
	@Column(name="cod_cliente", nullable = false, length=50)
	private Integer cod_cliente;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", referencedColumnName = "cod_pedido")
	private Cliente cliente;

	public Integer getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(Integer cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public Integer getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
