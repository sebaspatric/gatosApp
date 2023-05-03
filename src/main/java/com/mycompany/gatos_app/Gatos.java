/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos_app;

/**
 *
 * @author SMA
 */
public class Gatos {
    String id;
    String url;
    String apikey = "live_zrCrMBU1farSXGhfMOKW31afGnIPHmnK2qNCEFyj3u51BaQCSo3Szrr1qftGjDYY";
    String image;

    public Gatos() {
    }

    public Gatos(String id, String url, String image) {
        this.id = id;
        this.url = url;
        this.image = image;
    }
    
    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
