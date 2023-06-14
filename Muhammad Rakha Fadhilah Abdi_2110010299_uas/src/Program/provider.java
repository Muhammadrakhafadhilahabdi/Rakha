/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;


/**
 *
 * @author ASUS
 */
public class provider {
    private int id_kategori;
    private int id_provider;
    private String nama_provider;
    
    // Konstruktor
    public provider(int id_kategori, int id_provider, String nama_provider) {
        this.id_kategori = id_kategori;
        this.id_provider = id_provider;
        this.nama_provider = nama_provider;
    }
    
    // Getter dan setter
    public int getIdKategori() {
        return id_kategori;
    }
    
    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
    
    public int getIdProvider() {
        return id_provider;
    }
    
    public void setIdProvider(int id_provider) {
        this.id_provider = id_provider;
    }
    
    public String getnamaprovider() {
        return nama_provider;
    }
    
    public void setnamaprovider(String nama_provider) {
        this.nama_provider = nama_provider;
    }
    
     public void displayInfo() {        
        System.out.println("id kategori : " + id_kategori);
        System.out.println("id provider : " + id_provider);
        System.out.println("nama_provider : " + nama_provider);
    }
}