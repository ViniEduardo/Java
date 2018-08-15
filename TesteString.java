package br.com.senai.teste;

public class TesteString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		String disciplina = "Diego Gay da o brioco";
		System.out.println ("Disciplina: " + disciplina);
	
		System.out.print("\nprimeiro caractere: ");
		System.out.println(disciplina.charAt(0));
		System.out.print("\no que o Diego da?: ");
		System.out.println(disciplina.substring(13, 21));
		
		
		char letra = disciplina.charAt(2) ;
		
		System.out.print("\nprimeiras cinco letras: ");
		System.out.println(disciplina.substring(0, 5));
		System.out.print("\nletras a partir da quarta:" );
		System.out.println(disciplina.substring(4));
		}
}
