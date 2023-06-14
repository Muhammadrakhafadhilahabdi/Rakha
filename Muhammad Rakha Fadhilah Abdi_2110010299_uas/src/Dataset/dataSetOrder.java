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
public class dataSetOrder {
    
    private ArrayList<Integer> user_id;
    private ArrayList<String> invoice;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<String> tujuan;
    private ArrayList<Integer> id_harga;
    private ArrayList<String> bank;
    private ArrayList<String> status;

    public dataSetOrder() {
        user_id = new ArrayList<Integer> ();
        invoice = new ArrayList<String> ();
        tanggal = new ArrayList<String> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer> ();
        tujuan = new ArrayList<String> ();
        id_harga = new ArrayList<Integer> ();
        bank = new ArrayList<String> ();
        status = new ArrayList<String> ();
    }

    public ArrayList<Integer> getDatasetuserid() {
        return user_id;
    }

    public void insertuserid(int value) {
        this.user_id = user_id;
    }

    public ArrayList<String> getDatasetinvoice() {
        return invoice;
    }

    public void insertinvoice(String value) {
        this.invoice = invoice;
    }

    public ArrayList<String> getDatasettanggal() {
        return tanggal;
    }

    public void inserttanggal(String value) {
        this.tanggal = tanggal;
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

    public void insertidnominal(int value) {
        this.id_nominal = id_nominal;
    }

    public ArrayList<String> getDatasettujuan() {
        return tujuan;
    }

    public void inserttujuan(String value) {
        this.tujuan = tujuan;
    }

    public ArrayList<Integer> getDatasetidharga() {
        return id_harga;
    }

    public void insertidharga(int value) {
        this.id_harga = id_harga;
    }

    public ArrayList<String> getDatasetbank() {
        return bank;
    }

    public void insertbank(String value) {
        this.bank = bank;
    }

    public ArrayList<String> getDatasetstatus() {
        return status;
    }

    public void insertstatus(String value) {
        this.status = status;
    }
    
    
    
    
    
}
