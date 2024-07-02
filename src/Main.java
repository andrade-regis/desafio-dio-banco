
public class Main {

	public static void main(String[] args) {
		Cliente Clayton = new Cliente("Clayton");
		Clayton.setNome("Clayton Da Costa");
		
		Conta cc = new ContaCorrente(Clayton);
		Conta poupanca = new ContaPoupanca(Clayton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		poupanca.depositar(500);
		poupanca.sacar(120);
		poupanca.transferir(50, cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}