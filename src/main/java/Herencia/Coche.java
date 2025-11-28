package Herencia;

import lombok.Data;
import lombok.Getter;

@Getter
public class Coche extends Vehiculo{

  private String matricula;

  public Coche(String marca, String modelo, int ruedas, String matricula) {
    super(marca, modelo, ruedas);
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "Esto es el coche " + getMarca();
  }

//  public String acelerar(){
//    return "";
//  }
//
//  public int acelerar(){
//    return 0;
//  }

}
