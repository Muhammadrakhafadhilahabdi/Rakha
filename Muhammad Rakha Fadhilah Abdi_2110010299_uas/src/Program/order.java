/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;


/**
 *
 * @author ASUS
 */
public class order {
    private int user_id;
    private String invoice;
    private String tanggal;
    private int id_provider;
    private int id_nominal;
    private String tujuan;
    private int id_harga;
    private String bank;
    private String status;
    
    // Konstruktor
    public order(int user_id, String invoice, String tanggal, int id_provider, int id_nominal, String tujuan, int id_harga, String bank, String status) {
        this.user_id = user_id;
        this.invoice = invoice;
        this.tanggal = tanggal;
        this.id_provider = id_provider;
        this.id_nominal = id_nominal;
        this.tujuan = tujuan;
        this.id_harga = id_harga;
        this.bank = bank;
        this.status = status;
    }
    
    // Getter dan setter
    public int getUserId() {
        return user_id;
    }
    
    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
    
    public String getInvoice() {
        return invoice;
    }
    
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public int getIdProvider() {
        return id_provider;
    }
    
    public void setIdProvider(int id_provider) {
        this.id_provider = id_provider;
    }
    
    public int getIdNominal() {
        return id_nominal;
    }
    
    public void setIdNominal(int id_nominal) {
        this.id_nominal = id_nominal;
    }
    
    public String getTujuan() {
        return tujuan;
    }
    
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public int getIdHarga() {
        return id_harga;
    }
    
    public void setIdHarga(int id_harga) {
        this.id_harga = id_harga;
    }
    
    public String getBank() {
        return bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    
    public String getstatus() {
        return status;
    }
    
    public void setstatus(String status) {
        this.status = status;
    }
    
     public void displayInfo() {        
        System.out.println("user id : " + user_id);
        System.out.println("invoice : " + invoice);        
        System.out.println("tanggal: " + tanggal);   
        System.out.println("id provider : " + id_provider);
        System.out.println("id nominal : " + id_nominal);        
        System.out.println("tujuan: " + tujuan);   
        System.out.println("id harga : " + id_harga);
        System.out.println("bank : " + bank);  
        System.out.println("status : " + status);
    }

}