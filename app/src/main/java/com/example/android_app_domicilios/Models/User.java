package com.example.android_app_domicilios.Models;

public class User {
    private String _id;
    private long identificacion;
    private String nombre;

    public User(){
        this.identificacion = 0;
        this.nombre = "";
        this._id = "";
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
