/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;

/**
 *
 * @author Toshiba
 */
public class dataSetKategori {
    
    private ArrayList<Integer> id_kategori;
    private ArrayList<String> nama_kategori;

    public dataSetKategori() {
        id_kategori = new ArrayList<Integer> ();
        nama_kategori = new ArrayList<String> ();
    }

    public ArrayList<Integer> getDatasetidkategori() {
        return id_kategori;
    }

    public void insertidkategori(int value) {
        this.id_kategori = id_kategori;
    }

    public ArrayList<String> getDatasetnamakategori() {
        return nama_kategori;
    }

    public void insertnamakategori(String values) {
        this.nama_kategori = nama_kategori;
    }
    
    

    
    
    
}
