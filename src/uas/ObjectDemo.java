/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class ObjectDemo {
    public static String filename = "buku.o";
    
    public static void main(String[] args) {
        //INSTANSIASI OBJEK MOBIL
        Buku m = new Buku();
        
        //set nilai atribut mobil
        m.setKode("CV-R");
        m.setJudul("Honda");
        m.setPengarang("CRV Type R");
        m.setTahunterbit(1200000000);
        
        System.err.println(m);
        
        try{
            simpanObject(m);
            
            Buku n = bacaObject();
            System.out.println(n);
        } catch (IOException ex){
            Logger.getLogger(ObjectDemo.class.getName()).log(Level.SEVERE, null, ex); 
        } catch (ClassNotFoundException ex){
            Logger.getLogger(ObjectDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void simpanObject(Buku m) throws FileNotFoundException, IOException{
        FileOutputStream fout;
        fout = new FileOutputStream(filename);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(m);
        System.out.println("Object berhasil disimpan.");
    }
    public static Buku bacaObject() throws FileNotFoundException,
        IOException, ClassNotFoundException{
        ObjectInputStream ois;
        ois = new ObjectInputStream(new FileInputStream(filename));
        System.out.println("Object dibaca.");
        return (Buku) ois.readObject();
    }
}
    

