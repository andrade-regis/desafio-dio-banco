public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}

		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de depósito deve ser maior que zero");
		}

		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return String.format("Titular: %s\nAgencia: %d\nNumero: %d\nSaldo: %.2f",
				this.cliente.getNome(), this.agencia, this.numero, this.saldo);
	}
}
