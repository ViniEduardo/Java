package br.com.senai.teste;

public class Tarefa1e2 {
	public static void main(String[] args) {
		
		double h = 10.2;
		double b = 5.5;
		double B = 7.5;
		double Area = h*(b + B)/2;
		float Area1 = (int) Area;
		
		System.out.println("Exercício 1/2\n");
		System.out.println(h*(b+B)/2);
		System.out.println("Valor exato da área: " + Area);	
		System.out.println("Valor arredondado da área: "+ Area1);
	}
}