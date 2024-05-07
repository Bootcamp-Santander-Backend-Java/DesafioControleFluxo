package edu.paulo.desafio.controle.fluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
			try (Scanner terminal = new Scanner(System.in)) {
				System.out.println("Digite o primeiro parâmetro: ");
				int parametroUm = terminal.nextInt();
				System.out.println("Digite o segundo parâmetro: ");
				int parametroDois = terminal.nextInt();
				// metodo para contar os parametros
				try {
				    contar(parametroUm, parametroDois);
				} catch (ParametrosInvalidosException e) {
				    System.err.println(e.getMessage());
				}
			}
			
		
	}
// Criou a exceção a ser tratada
	
		 static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		        if (parametroUm > parametroDois) {
		            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		        }

		        int contagem = parametroDois - parametroUm;

		        for (int num = 0; num <= contagem; num++) {
		            System.out.println("Imprimindo o número " + num);
		        }
		    
	

	}
}
