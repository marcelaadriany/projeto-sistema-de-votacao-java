package com.betrybe.sistemadevotacao;

abstract class Pessoa {
  protected String nome;

  public String getName() {
    return nome;
  }

  public void setName(String name) {
    this.nome = name;
  }
}
