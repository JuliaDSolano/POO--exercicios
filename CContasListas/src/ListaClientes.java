import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
	private List<Clientes> clientes;
	
	public ListaClientes() {
		clientes = new ArrayList<Clientes>();
	}
	
	public void addClientes(Clientes cli) {
		clientes.add(cli);
	}
	
	public void imprimeClientes() {
		for(Clientes cli: clientes)
			System.out.println(cli);
	}
}
