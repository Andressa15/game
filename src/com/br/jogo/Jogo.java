package com.br.jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int adivinhe = aleatorio.nextInt(51);
		int chute;

		int vidas = 10;

		while (vidas > 0) {
			System.out.println("Digite um número entre 0 e 50 : ");
			chute = entrada.nextInt();
			if (chute == adivinhe) {
				System.out.println("Você acertou o número");
				break;
			} else {
				System.out.println("Você errou o número, tente novamente." + "\n");
				vidas--;
				System.out.println("Tentativas restantes "+ vidas);
			}
		}
		System.out.println("Fim de jogo");
		System.out.println("numero sorteado era " + adivinhe);
		entrada.close();
	}
}
