/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7e1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class G7E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro nuevoLibro = new Libro();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese ISBN");
        nuevoLibro.setIsbn(leer.nextInt());
        System.out.println("Ingrese N° de páginas");
        nuevoLibro.setPaginas(leer.nextInt());
        System.out.println("Ingrese el Título");
        nuevoLibro.setTitulo(leer.next());
        System.out.println("Ingrese su Autoría");
        nuevoLibro.setAutor(leer.next());
        
        
        System.out.println("\nLibro ingresado");
        System.out.println("***************************************");
        System.out.println(nuevoLibro);
        
    }
    
}
