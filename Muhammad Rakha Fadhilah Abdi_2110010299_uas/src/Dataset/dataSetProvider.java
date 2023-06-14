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
public class dataSetProvider {
    
    private ArrayList<Integer> id_kategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<String> nama_provider;

    public dataSetProvider() {
        id_kategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        nama_provider = new ArrayList<String> ();
    }

    public ArrayList<Integer> getDatasetidkategori() {
        return id_kategori;
    }

    public void insertidkategori(int value) {
        this.id_kategori = id_kategori;
    }

    public ArrayList<Integer> getDatasetidprovider() {
        return id_provider;
    }

    public void insertidprovider(int value) {
        this.id_provider = id_provider;
    }

    public ArrayList<String> getDatasetnamaprovider() {
        return nama_provider;
    }

    public void insertnamaprovider(String value) {
        this.nama_provider = nama_provider;
    }
    
    
    
    
    
}
