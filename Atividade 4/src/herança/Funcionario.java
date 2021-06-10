package herança;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private double salario;
	private double carga_horaria;
	
	public Funcionario(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
		this.salario = 2.000;
		this.carga_horaria = 40;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public double getCarga_horaria() {
		return this.carga_horaria;
	}
	
}
