
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

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

    public Universo() {
    }

    public Universo(String Nombre, ArrayList<Ser_Vivo> seres) {
        this.Nombre = Nombre;
        this.seres = seres;
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

    public void Guardar() throws IOException {
        File f = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            f = new File("./Universos/" + Nombre + ".txt");
            JFileChooser fc=new JFileChooser();
            fc.setSelectedFile(f);
            int seleccion=fc.showSaveDialog(null);
            if(seleccion==JFileChooser.APPROVE_OPTION){
                f=fc.getSelectedFile();
            }
            fw = new FileWriter(f, false);
            bw = new BufferedWriter(fw);
            for (Ser_Vivo sere : seres) {
                bw.write(sere.getRaza()+"|"+sere.getPlaneta()+"|"+sere.getMax_anios()+"|"+sere.getKi()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
    public void Escribir(File f) throws IOException{
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(f, false);
            bw = new BufferedWriter(fw);
            for (Ser_Vivo sere : seres) {
                bw.write(sere.getRaza()+"|"+sere.getPlaneta()+"|"+sere.getMax_anios()+"|"+sere.getKi()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }

    public void Abrir(File j) {
        if (j.exists()) {
            Scanner sc = null;
            Scanner c = null;
            try {
                sc = new Scanner(j);
                while (sc.hasNextLine()) {
                    c.useDelimiter("[|]");
                    while (c.hasNext()) {
                        seres.add(new Ser_Vivo(c.next(),c.next(),c.nextInt(),c.nextInt()));
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
