package com.mycompany.colla2;

public class ListaFotos {
    private Nodo primero;
    private Nodo ultimo;
    private Nodo actual;
    
    public void agregar(Nodo nuevo) {
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        actual = nuevo;
    }
    
    public Nodo getSiguiente() {
        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public Nodo getAnterior() {
        if (actual != null && actual.getAnterior() != null) {
            actual = actual.getAnterior();
        }
        return actual;
    }
    
    public Nodo getActual() {
        return actual;
    }
}
