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
public class dataSetNominal {
    
    private ArrayList<Integer> id_kategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<String> nama_nominal;

    public dataSetNominal() {
        id_kategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer> ();
        nama_nominal = new ArrayList<String> ();
    }

    public ArrayList<Integer> getDatasetkategori() {
        return id_kategori;
    }

    public void insertkategori(int value) {
        this.id_kategori = id_kategori;
    }

    public ArrayList<Integer> getDatasetidprovider() {
        return id_provider;
    }

    public void insertidprovider(int value) {
        this.id_provider = id_provider;
    }

    public ArrayList<Integer> getDatasetnominal() {
        return id_nominal;
    }

    public void insertnominal(int value) {
        this.id_nominal = id_nominal;
    }

    public ArrayList<String> getDatasetnamanominal() {
        return nama_nominal;
    }

    public void insertnamanominal(String value) {
        this.nama_nominal = nama_nominal;
    }
    
    
    
    
}
