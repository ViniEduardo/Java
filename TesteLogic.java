package br.com.senai.teste;

public class TesteLogic {
	public static void main(String[] args) {
		
		int mes = 2;
		if((mes == 12) || (mes == 1))
		{
		System.out.println("f�rias :)" );
		}
		if((mes > 1) && (mes < 12))
		{
		System.out.println("semestre em andamento");
		}
		if((mes != 2))
		{
		System.out.println("n�o tem carnaval ");
		}
	}
}
