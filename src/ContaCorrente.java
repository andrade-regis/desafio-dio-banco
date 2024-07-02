public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
