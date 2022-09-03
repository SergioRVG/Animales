/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author Win 10
 */
public class Animales {
private int ValNum;
private  String fechaAd;
private  int edad;
private String raza;

    public Animales(int ValNum, String fechaAd, int edad, String raza) {
        this.ValNum = ValNum;
        this.fechaAd = fechaAd;
        this.edad = edad;
        this.raza = raza;
    }

    public int getValNum() {
        return ValNum;
    }

    public String getFechaAd() {
        return fechaAd;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

   

    
}
