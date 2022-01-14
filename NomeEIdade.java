package br.com.jovas.operadores.Repeticao;

/*
FAÇA UM PROGRAMA QUE LEIA CONJUNTO DE 2 VALORES, SENDO O PRIMEIRO REPRESENTANDO O NOME DO ALUNO
E O SEGUNDO REPRESENTANDO SUA IDADE.
(FINALIZE O PROGRAMA INSERINDO O VALOR 0 NO CAMPO NOME)
 */

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;;
            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Programa finalizado");
       scan.close();
    }

}
