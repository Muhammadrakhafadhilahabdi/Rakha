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
public class dataSetHarga {
    
    private ArrayList<Integer> id_kategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<Integer> id_harga;
    private ArrayList<String> nama_harga;

    public dataSetHarga() {
        id_kategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer>();
        id_harga = new ArrayList<Integer> ();
        nama_harga = new ArrayList<String> ();
        
    
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

    public ArrayList<Integer> getDatasetidnominal() {
        return id_nominal;
    }

    public void insertidnominal(int nominal) {
        this.id_nominal = id_nominal;
    }

    public ArrayList<Integer> getDatasetidharga() {
        return id_harga;
    }

    public void insertidharga(int value) {
        this.id_harga = id_harga;
    }

    public ArrayList<String> getDatasetnamaharga() {
        return nama_harga;
    }

    public void insertnamaharga(String value) {
        this.nama_harga = nama_harga;
    }
    
    
 }
