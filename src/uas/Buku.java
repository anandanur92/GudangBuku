/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Buku implements java.io.Serializable{
    private String judul;
    private String pengarang;
    private int tahunterbit;
    private String penerbit;
    private String kode;
    
//    private List<Mobil> listMobil = new ArrayList<Mobil>(); 
    
    public Buku(){}
    
    public Buku(String kode, String judul, String pengarang, String penerbit, int tahunterbit){
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
        this.penerbit = penerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    
    
    public boolean validasiTahun(String tahunterbit){
        for(char c: tahunterbit.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Buku <kode:"+kode+
                ", judul: "+judul+
                ", pengarang: "+pengarang+
                ", penerbit: "+penerbit+
                ", tahunterbit: "+String.valueOf(tahunterbit)+">";
    }
}
