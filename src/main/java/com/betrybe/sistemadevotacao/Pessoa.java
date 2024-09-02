package com.betrybe.sistemadevotacao;

abstract class Pessoa {
  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
