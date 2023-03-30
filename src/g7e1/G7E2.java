/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7e1;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class G7E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        for (int i = 0; i < 3; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Intrduzca un radio ");
            System.out.println(circulo.crearCircunferencia(leer.nextInt(), circulo));
            System.out.println("El area de un circulo con ese radio es: " + circulo.getArea());
            System.out.println("El perimetro de un circulo con ese radio es: " + circulo.getPerimetro());
        }
    }

}
