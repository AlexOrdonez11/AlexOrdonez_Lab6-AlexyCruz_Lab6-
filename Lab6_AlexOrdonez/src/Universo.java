
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Ordonez
 */
public class Universo {
    private String Nombre;
    private ArrayList<Ser_Vivo> seres;
    private String Ruta="./"+Nombre+".txt";

    public Universo() {
    }

    public Universo(String Nombre, ArrayList<Ser_Vivo> seres) {
        this.Nombre = Nombre;
        this.seres = seres;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Ser_Vivo> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Ser_Vivo> seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public void Guardar(String seres) throws IOException{
        File f=null;
        BufferedWriter bw=null;
        FileWriter fw=null;
        try {
            f=new File(Ruta);
            fw=new FileWriter(f,false);
            bw=new BufferedWriter(fw);
            bw.write();
            bw.flush();
        } catch (Exception e) {
            
        }
        bw.close();
        fw.close();
    }
    public void Abrir(){
        
    }
}
