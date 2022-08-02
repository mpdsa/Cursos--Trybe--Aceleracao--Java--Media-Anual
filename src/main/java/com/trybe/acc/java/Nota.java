package com.trybe.acc.java;


/** Classe Nota dos alunos. */
public class Nota {
  
  /** Média anual dos alunos. */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double calculo = (nota1 + nota2 + nota3 + nota4) / 4;
    
    return calculo;
  }

}
