package herança;

import java.util.Date;

public class Pessoa {
	
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	public Pessoa( String nome, String cpf,  Date data_nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
	}


	@Override
	public String toString() {
		return "Nome = " + nome + ", CPF = " + cpf + ", Data de Nascimento = " + data_nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
