package main;

import utilidades.FuncoesUteis;

public class main {
    public static void main(String[] args) {
        // Testando o método Soma
        int resultadoSoma = FuncoesUteis.Soma(5, 10);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Testando o método Triangulo
        System.out.println("Triângulo de altura 5:");
        FuncoesUteis.Triangulo(5);

        // Testando o método printArquivo
        System.out.println("Conteúdo do arquivo:");
        FuncoesUteis.printArquivo("caminho/do/seu/arquivo.txt");
    }
}
