package com.betrybe.sistemadevotacao;

/**
 * A classe PessoaEleitora representa uma pessoa eleitora no sistema de votação.
 */

public class PessoaEleitora extends Pessoa {
  // atributos
  private String cpf;

  // métodos
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
}
