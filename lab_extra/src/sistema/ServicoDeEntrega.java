package sistema;
import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
	List<Fretavel> fretaveis;
	
	public ServicoDeEntrega() {
		fretaveis = new ArrayList<>();
	}
	
	public void adicionarFretavel(Fretavel item) {
		fretaveis.add(item);
	}
	
	public void limparLista() {
		fretaveis.clear();
	}
	
	public double calcularCustoTotal(double distanciaEmKm) {
		double total = 0;
		for (int i = 0; i < this.fretaveis.size(); i++) {
			total += fretaveis.get(i).calcularCustoFrete(distanciaEmKm);
		}
		return total;
	}
}
