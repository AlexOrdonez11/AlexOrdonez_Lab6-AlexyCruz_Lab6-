/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Ordonez
 */
public class Ser_Vivo {
    private String raza,planeta;
    private int max_anios,ki;

    public Ser_Vivo() {
    }

    public Ser_Vivo(String raza, String planeta, int max_anios, int ki) {
        this.raza = raza;
        this.planeta = planeta;
        this.max_anios = max_anios;
        this.ki = ki;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getMax_anios() {
        return max_anios;
    }

    public void setMax_anios(int max_anios) {
        this.max_anios = max_anios;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    @Override
    public String toString() {
        return raza+"  "+ki;
    }
    
}
