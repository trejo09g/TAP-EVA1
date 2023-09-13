/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_8_heap;

/**
 *
 * @author garci
 */
public class EVA1_8_HEAP {

    public static void main(String[] args) {
        // Borrar una direcion(Un objeto)
        Auto a = new Auto();
        Auto a2 = new Auto("Camaro", "Rojo", 345);

        //Borrar un objeto, Borrar el obejto de la memoria al eliminar la direccion de memoria al mismo objeto
        a = null;

        System.out.println(a);
        System.out.println(a2);

        //No es una copia de  objetos (Es una copia de dirrecion)
        Auto copia = a2;

        System.out.println(a2);
        System.out.println(copia);
        
        //Hacer copia del oBJETO

        //Coparacion deobjetos
        /*if(a==a2)
                    System.out.println("Obejetos iguales");
                else
                    System.out.println("Objetos distintos");
         */
    }
}

class Auto {

    private String Marca;
    private String Color;
    private int Modelo;

    public Auto() {
    }

    public Auto(String Marca, String Color, int Modelo) {
        this.Marca = Marca;
        this.Color = Color;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

}
