package br.com.jovas.operadores.Repeticao;

/*
FAÇA UM PROGRAMA QUE PEÇA UMA NOTE, ENTRE 0 E 10.
MOSTRE UMA MENSAGEM DE ERRO CASO ESTEJA FORA DO INTERVALO, 0–10.
E CONTINUE A SOLICITAR ATÉ QUE INFORME O VALOR CORRETO
 */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;


        System.out.println("Insira um número: ");
        nota = scan.nextInt();


        while (nota < 0 | nota > 10){ // nota menor que 0 ou nota maior que 10
            System.out.println("Nota inválida!! Digite novamente: ");
            nota = scan.nextInt();
        }
    }

}
