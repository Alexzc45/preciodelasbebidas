package preciodelasbebidas;

import java.util.Scanner;

public class Preciodelasbebidas {

    public static void main(String[] args) {
// Parte Lopez Orcko Alex Sander
        Scanner sc = new Scanner(System.in);
        System.out.println("BEBIDAS DISPONIBLES");
        System.out.println(" -coca cola");
        System.out.println(" -pepsi");
        System.out.println(" -sprite");
        System.out.println(" -fanta");
        System.out.println("ESCRIBE LA BEBIDA QUE DESEAS ADQUIRIR");
        String bebida = sc.nextLine();

        switch (bebida) {
            case "coca cola":
                System.out.println("Seleccionaste  " + bebida);
                System.out.println("PRECIO: 6bs");
                break;
        }  
    }
}
