package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe que gerencia a votação.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas;
  private final ArrayList<PessoaEleitora> pessoasEleitoras;
  private final ArrayList<String> cpfsComputados;

  /**
   * Implementação da classe.
   */

  public GerenciamentoVotacao() {
    // atributos
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    PessoaCandidata newPerson = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(newPerson);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitora : pessoasEleitoras) {
      if (eleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    PessoaEleitora newEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(newEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    boolean jaVotou = cpfsComputados.contains(cpfPessoaEleitora);
    if (jaVotou) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      pessoasCandidatas.stream()
              .filter(n -> n.getNumero() == numeroPessoaCandidata)
              .findFirst()
              .ifPresent(PessoaCandidata::receberVoto);
    }
    cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    int totalVotos = pessoasCandidatas.stream()
            .mapToInt(PessoaCandidata::getVotos)
            .sum();
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      String output = String.format(
              "Nome: %s - %d votos ( %.0f%% )",
              pessoaCandidata.getNome(),
              pessoaCandidata.getVotos(),
              (double) pessoaCandidata.getVotos() / totalVotos * 100
      );
      System.out.println(output);
      System.out.println("Total de votos: " + totalVotos);
    }
  }
}