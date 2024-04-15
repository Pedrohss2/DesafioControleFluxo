package application;

import exception.ParametrosInvalidosException;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Contador  {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, vamor começar nosso contador :)");


        System.out.println("Digite o numero inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int numeroFinal = sc.nextInt();

        try {
            contarEVrificar(numeroInicial, numeroFinal);
        }
        catch (Exception e) {
            throw new ParametrosInvalidosException(e.getMessage());
        }

    }

    static void contarEVrificar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) new ParametrosInvalidosException("Erro, o primeiro numero tem q ser maior q o segundo..");

        int valor =  parametroDois - parametroUm;

        IntStream.iterate(1, i -> i <= valor, i -> i + 1).forEach(System.out::println);

    }
}
