/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;


/**
 *
 * @author ASUS
 */
public class kategori {
    private int id_kategori;
    private String nama_kategori;
    
    // Konstruktor
    public kategori(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }
    
    // Getter dan setter
    public int getIdKategori() {
        return id_kategori;
    }
    
    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
    
    public String getnamakategori() {
        return nama_kategori;
    }
    
    public void setnamakategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public void displayInfo() {        
        System.out.println("id kategori : " + id_kategori);
        System.out.println("nama kategori : " + nama_kategori);
            
    }
}