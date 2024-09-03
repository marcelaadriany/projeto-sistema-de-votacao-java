package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Tipo principal.
 */
public class Principal {

  /**
   * Componente principal.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    int cadidate = 0;

    while (cadidate != 2) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      cadidate = Integer.parseInt(scanner.next());

      switch (cadidate) {
        case 1:
          System.out.println("Entre com o nome da pessoa candidata:");
          String nomeCandidato = scanner.next();
          System.out.println("Entre com o número da pessoa candidata:");
          int numeroCandidato = Integer.parseInt(scanner.next());
          gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);
          break;
        case 2:
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }

    int options = 0;

    while (options != 2) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      options = Integer.parseInt(scanner.next());

      switch (options) {
        case 1:
          System.out.println("Entre com o nome da pessoa eleitora:");
          String nomeEleitor = scanner.next();
          System.out.println("Entre com o CPF da pessoa eleitora:");
          String cpfEleitor = scanner.next();
          gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitor, cpfEleitor);
          break;
        case 2:
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }

    int optionsToVote = 0;

    while (optionsToVote != 3) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar votação");
      optionsToVote = Integer.parseInt(scanner.next());

      switch (optionsToVote) {
        case 1:
          System.out.println("Entre com o CPF da pessoa eleitora:");
          String cpfEleitor = scanner.next();
          System.out.println("Entre com o número da pessoa candidata:");
          int numeroCandidato = Integer.parseInt(scanner.next());
          gerenciamentoVotacao.votar(cpfEleitor, numeroCandidato);
          break;
        case 2, 3:
          gerenciamentoVotacao.mostrarResultado();
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }
}