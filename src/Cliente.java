
public class Cliente {
		
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcpf() {		
		return this.cpf;
	}

	public void setcpf(String cpf) {
		if(cpf == null || cpf.isEmpty() || cpf.length() != 11)
			throw new RuntimeException("O cpf deve conter 11 dígitos.");				
		this.cpf = cpf;
	}
	
	

}
