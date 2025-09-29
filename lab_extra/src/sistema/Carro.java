package sistema;

public class Carro extends Veiculo implements Fretavel{
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 1.25;
	}
}
