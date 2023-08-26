package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;
    this.tempoVoo = (int) Math.round(duracaoDouble);
    return tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    String info = String.format("Embarque: %s, Origem: %s, Desembarque: %s, Destino: %s",
        embarque, origem, desembarque, destino);
    return info;
  }
}
