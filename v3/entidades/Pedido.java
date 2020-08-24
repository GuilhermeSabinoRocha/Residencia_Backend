package trabalhoBackend.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_pedido;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="data_pedido", nullable = false)
	private Date data_pedido;
	
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name = "cod_pedido")
	private Set<CarrinhoDeCompras> carrinhodecompras;
	
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente")
	private Cliente cliente;


	
	
	public Pedido(Integer cod_pedido, Date data_pedido, Set<CarrinhoDeCompras> carrinhodecompras, Cliente cliente) {
		super();
		this.cod_pedido = cod_pedido;
		this.data_pedido = data_pedido;
		this.carrinhodecompras = carrinhodecompras;
		this.cliente = cliente;
	}
	
	


	public Pedido() {
		super();
	}




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


	public Set<CarrinhoDeCompras> getCarrinhoDeCompras() {
		return carrinhodecompras;
	}


	public void setCarrinhoDeCompras(Set<CarrinhoDeCompras> carrinhodecompras) {
		this.carrinhodecompras = carrinhodecompras;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
