/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos_app;

/**
 *
 * @author SMA
 */
public class GatosFav {
    String id;
    String image_id;
    String apikey="live_zrCrMBU1farSXGhfMOKW31afGnIPHmnK2qNCEFyj3u51BaQCSo3Szrr1qftGjDYY";
    Imagex image;

    public GatosFav() {
    }

    public GatosFav(String id, String image_id, Imagex image) {
        this.id = id;
        this.image_id = image_id;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public Imagex getImage() {
        return image;
    }

    public void setImage(Imagex image) {
        this.image = image;
    }
    
    
}
