package Herencia;

import lombok.Data;
import lombok.Getter;

@Getter
public class Bicicleta extends Vehiculo{

  public static int radios = 50;

  public Bicicleta(String marca, String modelo, int ruedas) {
    super(marca, modelo, ruedas);
  }
}
