package exerciciospraticos;

import java.util.Random;

public class ArrayNotaEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alunos[] [] = new int [9][2];
		
		Random notasMaximas = new Random();
		int numeroAluno = 1;
		
		
		for(int[] nota : alunos){
			float media, notaDeRecuperacao;
			
			nota[0] = notasMaximas.nextInt(10);
			nota[1] = notasMaximas.nextInt(10);
			
			media = (nota[0] + nota[1])/2;
			
			System.out.println("Aluno : " +numeroAluno);
			System.out.println("Nota B1 : " +nota[0]);
			System.out.println("Nota B2: " +nota[1]);
			System.out.println("Media: " +media);
		
		if(media<=4){
			System.out.println("Aluno: " +numeroAluno+ "Esta de Recuperacao!");
			
		}else if(media >4 && media<7){
			notaDeRecuperacao = notasMaximas.nextInt(10);
			if(media+notaDeRecuperacao>=10){
				System.out.println("Nota de Recuperacao: " +notaDeRecuperacao);
				System.out.println("Aluno: " +numeroAluno+ "Passou de Ano");	
			}else{
				System.out.println("Aluno: " +numeroAluno+ "Nao Passou de Ano");
			}
		}else if(media >= 7){
			System.out.println("Aluno : " +numeroAluno+ " Passou de Ano!");
		}
		else{
			System.out.println("Aluno : " +numeroAluno+" Não Passou de Ano");
		}
		System.out.println("-----------------------------------------------");
		
		numeroAluno++;
		
		}
		
		
	}

}
