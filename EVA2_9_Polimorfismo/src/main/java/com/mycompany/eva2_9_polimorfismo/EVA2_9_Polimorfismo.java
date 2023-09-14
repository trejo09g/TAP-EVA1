/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_9_polimorfismo;

/**
 *
 * @author garci
 */
public class EVA2_9_Polimorfismo {

    static Auto a1;
    static Auto a2;

    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto("Ferrari", "Azul", 46);

        System.out.println(a1);
        System.out.println(a2);

        mensaje(a1);
        mensaje(a2);

    }

    public static void mensaje(Object obj) {
        System.out.println("Metodo mensaje");
        System.out.println(obj);
        if (obj == a1) {
            System.out.println("Auto 1");
        } else {
            System.out.println("Auto 2");
        }
        Auto a1 = (Auto) obj;
        System.out.println(a1.getMarca());
        System.out.println(a1.getColor());
        System.out.println(a1.getModelo());

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
