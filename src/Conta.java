
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected  int agencia;
	protected int numero;
	protected double saldo;	
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
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
	
	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= this.saldo)
			this.saldo -= valor;
		else throw new RuntimeException ("N�o h� saldo suficiente."); 
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns(){
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));	
		System.out.println(String.format("Ag�ncia: %d", this.agencia));	
		System.out.println(String.format("N�mero: %d", this.numero));		
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
	
	
	
	
	
	

}
