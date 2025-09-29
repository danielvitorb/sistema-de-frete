package sistema;

public class Autonomo extends Entregador implements Fretavel{
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.95;
	}
}
