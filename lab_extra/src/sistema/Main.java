package sistema;

public class Main {

	public static void main(String[] args) {
		ServicoDeEntrega servico = new ServicoDeEntrega();
		
		servico.adicionarFretavel(new Funcionario());
		servico.adicionarFretavel(new Carro());
		
		
		System.out.println(servico.calcularCustoTotal(10));
		
		servico.limparLista();
		
		servico.adicionarFretavel(new Autonomo());
		servico.adicionarFretavel(new Motocicleta());
		
		System.out.println(servico.calcularCustoTotal(25));
	}

}
