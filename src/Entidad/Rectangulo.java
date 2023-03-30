/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base y altura :D, :3, B)");
        this.setBase(leer.nextInt());
        this.setAltura(leer.nextInt());
    }

    public void calcularSuperficie() {
        int superficie = base * altura;
        System.out.println("Su superficie es: " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        System.out.println("su perimetro es: " + perimetro);
    }

    public void dibujo() {
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                if(i==0 || i==this.base-1 || j==0 || j== this.altura-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
