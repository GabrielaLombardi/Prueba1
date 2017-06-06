
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cynthia
 */
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = lector.nextInt();
        if (numero % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
    }
    
}
