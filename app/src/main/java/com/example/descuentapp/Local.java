package com.example.descuentapp;

import java.io.Serializable;

public class Local implements Serializable {

    String local_name,direction,website;
    String telefono, email;
    //Menu

    public Local(String local_name, String direction, String website) {
        this.local_name = local_name;
        this.direction = direction;
        this.website = website;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }



}
