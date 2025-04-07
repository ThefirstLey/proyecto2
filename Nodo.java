package com.mycompany.colla2;

public class Nodo {
    Nodo anterior,siguiente;
    String ruta;
    String Descripcion;
    String Emoji;
    String fecha;

  public Nodo(Nodo anterior, Nodo siguiente, String ruta, String descripcion, String fecha) {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.ruta = ruta;
        this.Descripcion = descripcion;
        this.fecha = fecha;
        this.Emoji = "";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEmoji() {
        return Emoji;
    }

    public void setEmoji(String Emoji) {
        this.Emoji = Emoji;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
}
    
