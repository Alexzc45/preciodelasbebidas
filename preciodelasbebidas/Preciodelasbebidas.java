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
// Parte de Liz Mariela Perez Gervacio                        
            case "pepsi":
                System.out.println("Seleccionaste " + bebida);
                System.out.println("PRECIO: 5bs");
                break;
//  Parte de Anahi Belen Quispe Mamani                      
            case "sprite":
                System.out.println("Seleccionaste " + bebida);
                System.out.println("PRECIO: 5bs");
                break;
// parte de Jose Gabriel Palacios Arizana                      
            case "fanta":
                System.out.println("Seleccionaste " + bebida);
                System.out.println("PRECIO: 6bs");
                break;
// Parte de Damian Alain Oyola Gutiérrez               
            case "blue label":
                System.out.println("seleccionaste "+bebida);
                System.out.println("PRECIO: 400bs");
                   
            default:
                System.out.println("Esa bebida no esta disponible");
                break;
        }
        sc.close();
    }
} 

