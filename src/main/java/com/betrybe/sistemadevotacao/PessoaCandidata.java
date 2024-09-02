package com.betrybe.sistemadevotacao;

/**
 * A classe PessoaEleitora representa uma pessoa eleitora no sistema de votação.
 */

public class PessoaCandidata extends Pessoa {
  // atributos
  private int numero;
  private int votos;

  // métodos
  // de número
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  // de votos
  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }

  /**
   * A PessoaEleitora e seus votos.
   */
  // construtor
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }
}
