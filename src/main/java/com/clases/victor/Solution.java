package com.clases.victor;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  /*
  Al inicio se crea una lista "lista" a la cual se le añade un elemento "primero".
  Posteriormente se llama al metodo manejoLista2 pasando como argumento "lista"
  Una vez dentro del metodo se le añade un segundo elemento al parametro "listaEntrada" y con el contenido de "listaEntrada" se crea una nueva listaSalida para devolverla
  por último se muestra los elemento de la lista obtenida del metodo manejoLista2 la cual contiene 2 elementos primero y segundo


  en la  lista se le añade un elemento,
  despues el metodo manejolista2 se añade un segundo elemento a lista con entrada,
  con esta lista se construye una nueva lista salida,
  con el contenido que tiene la anterior.
  Es decir 2 elementos priemro y segundo.


  El programa dara como salida:
  el resultado es: [primero, segundo]
  */

    public static void main(String[] args) {
      System.out.println(isCousin(1));
    }

    public static boolean isCousin(int n) {
      if (n <= 1){
        return false;
      }

      for(int i = 2; i < n;i++){
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }
  }
