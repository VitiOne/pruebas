import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //recoger x numeros por teclado y mostrarlos en orden inverso

    int list[] ={5,8,10,25};

    for (int i = list.length -1; i >= 0; i--) {
      System.out.println(list[i]);
    }

    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
  }
}
