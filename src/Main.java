
public class Main {

	public static void main(String[] args) {	
		
		Cliente cliente = new Cliente();
				cliente.setNome("Felipe");
				cliente.setcpf("11111111111");

		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(cliente);
		
		cc.transferir(cp, 75);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
