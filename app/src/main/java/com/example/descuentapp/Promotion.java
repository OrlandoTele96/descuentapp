package com.example.descuentapp;

import java.io.Serializable;

public class Promotion implements Serializable {

    String Promotion,description_prom;

    Local local;

    public Promotion(String promotion, String description_prom, Local local) {
        Promotion = promotion;
        this.description_prom = description_prom;
        this.local = local;
    }

    public String getPromotion() {
        return Promotion;
    }

    public void setPromotion(String promotion) {
        Promotion = promotion;
    }

    public String getDescription_prom() {
        return description_prom;
    }

    public void setDescription_prom(String description_prom) {
        this.description_prom = description_prom;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }



}
