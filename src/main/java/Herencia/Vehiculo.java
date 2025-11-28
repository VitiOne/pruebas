package Herencia;

import lombok.Data;

@Data
public class Vehiculo {

  private String marca;
  private String modelo;
  private int ruedas;

  public Vehiculo(String marca, String modelo, int ruedas) {
    this.marca = marca;
    this.modelo = modelo;
    this.ruedas = ruedas;
  }

  @Override
  public String toString() {
    return marca + " " + modelo + " " + ruedas ;
  }
}
