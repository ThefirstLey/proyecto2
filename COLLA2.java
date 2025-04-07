package com.mycompany.colla2;

public class COLLA2 {
    public static ListaFotos listaFotos = new ListaFotos();
    public static Fotos mainFrame;
    
    public static void main(String[] args) {
        // Inicializar y mostrar la ventana principal
        java.awt.EventQueue.invokeLater(() -> {
            new Fotos().setVisible(true);
        });
    }
}
