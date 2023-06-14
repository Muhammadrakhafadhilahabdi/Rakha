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
public class dataSetUser {
    
    private ArrayList<Integer> id;
    private ArrayList<String> username;
    private ArrayList<String> password;

    public dataSetUser() {
        id = new ArrayList<Integer> ();
        username = new ArrayList<String> ();
        password = new ArrayList<String> ();
    }

    public ArrayList<Integer> getDatasetid() {
        return id;
    }

    public void insertid(int value) {
        this.id = id;
    }

    public ArrayList<String> getDatasetusername() {
        return username;
    }

    public void insertusername(String value) {
        this.username = username;
    }

    public ArrayList<String> getDatasetpassword() {
        return password;
    }

    public void insertpassword(String value) {
        this.password = password;
    }
    
    
    
    
    
    
}
