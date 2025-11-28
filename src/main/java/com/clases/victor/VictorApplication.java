package com.clases.victor;

import Herencia.Bicicleta;
import Herencia.Coche;
import Herencia.Vehiculo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//@SpringBootApplication
public class VictorApplication {

	/**
	 * 1.uso de claúsula try sin catch
	 * 2.herencia, static/dinamic
	 * 3.clases abstractas
	 * 4.excepciones
	 * 5.conocimiento de programación y código
	 * 6.temas técnicos como APIs
	 * 7.procesos
	 * 8.arquitectura
	 * 9.sobrecarga de funciones difiriendo el parametro de salida
	 *
	 * Dos preguntas de lógica ( la de la botella y el vaso y la de las monedas).
	 * Por último preguntas de java técnicas ( concatenación de strings, sobrecarga de metodos, excepciones, static/dinamic y ejemplo de herencia)
	 * @param args
	 */

	public static void main(String[] args){
    //		try{
//			//codigo que genera un error
//			int n[] = new int[2];
//			System.out.println(n[2]);
//		}catch (Exception e){
//			throw e;
//		} finally {
//			System.out.println("Acaba en finally");
//		}
	  Vehiculo v1 = new Coche("opel","Astra", 4, "1234-MNM");
		Vehiculo v2 = new Bicicleta("BH","Spike", 2);

		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(v1);
		lista.add(v2);

		if (v1 instanceof Coche){
			System.out.println(((Coche) v1).getMatricula());
		}else if (v2 instanceof Bicicleta){
			System.out.println(Bicicleta.radios);
		}




		FileReader fr = null;
		BufferedReader bf = null;
		try {
      fr = new FileReader("fichero.txt");
			bf = new BufferedReader(fr);
    } catch (FileNotFoundException e) {
      System.out.println("El fichero no existe");
    }finally {

		}


  }


	public static void funcionSuma() throws Exception{
		throw new RuntimeException("Error funcion Suma");
	}
}
