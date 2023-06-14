/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;


/**
 *
 * @author ASUS
 */
public class user {
    private int id;
    private String username;
    private String password;
    
    // Konstruktor
    public user(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    // Getter dan setter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getpassword() {
        return password;
    }
    
    public void setpassword(String password) {
        this.password = password;
    }
    public void displayInfo() {        
        System.out.println("id  : " + id);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}