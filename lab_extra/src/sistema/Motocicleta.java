package sistema;

public class Motocicleta extends Veiculo implements Fretavel{
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.45;
	}
}
