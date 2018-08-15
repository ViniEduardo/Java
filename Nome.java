package br.com.senai.teste;

public class Nome 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		boolean obrigatório;
		int semestre = 2; 
		
		int valor = 5;
		int valor_b = 10;
		int valor_c = 15;
		
		double valor_d = 10.5;
		double valor_e = 51.69;
		
		String mensagem = "Seja Bem Vindo, ";
		String mensagem_a = "ao Mundo Senai! ";
		System.out.println(mensagem + mensagem_a);
		System.out.println(valor + valor_b + valor_c);
		System.out.println(valor_d + valor_e);
	}
}

