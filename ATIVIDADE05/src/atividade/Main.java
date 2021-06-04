package atividade;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante01 = new Estudante("Janaylson Pessoa", "Olinda-PE");
			estudante01.addCursoNota("Matematica", 8);
			estudante01.addCursoNota("Portugu�s", 10);
			
			Estudante estudante02 = new Estudante("Rodrigo", "Recife - PE");
			estudante02.addCursoNota("Matem�tica", 10);
			estudante02.addCursoNota("Portugu�s", 9);
		
			
			Estudante estudante03 = new Estudante("Francisco", "Jaboat�o - PE");
			estudante03.addCursoNota("Matem�tica", 8);
			estudante03.addCursoNota("Portugu�s", 9);
			pessoas.add(estudante01);
			pessoas.add(estudante02);
			pessoas.add(estudante03);

			Professor  professor01 = new Professor("J�lio Cesar", "Recife-PE");
			professor01.addCurso("matematica");
			
			
			Professor professor02 = new Professor("Maria", "Olinda-PE");
			professor02.addCurso("Portugu�s");
	
			
			pessoas.add(professor01);
			pessoas.add(professor02);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						str += "Curso: "+ teacher.getCursos().get(y)+"\n";
						str += "Professor: " + teacher.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}

}
