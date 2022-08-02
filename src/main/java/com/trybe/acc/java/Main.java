package com.trybe.acc.java;

import java.util.Scanner;

/** Classe principal. */
public class Main {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    final String nome = scan.next();

    System.out.println("Entre com as notas das provas:");
    System.lineSeparator();

    System.out.println("Prova 1:");
    final double p1 = scan.nextDouble();
    System.out.println("Prova 2:");
    final double p2 = scan.nextDouble();
    System.out.println("Prova 3:");
    final double p3 = scan.nextDouble();
    System.out.println("Prova 4:");
    final double p4 = scan.nextDouble();

    scan.close();

    String media = Double.toString(Nota.calcularMedia(p1, p2, p3, p4));

    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder resultado = stringBuilder.append("Olá, ")
                                           .append(nome)
                                           .append(" sua média é ")
                                           .append(media);
    System.out.print(resultado);
  }

}
