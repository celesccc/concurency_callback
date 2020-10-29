package es.centroafuera.psp.ejemplosJava;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Camarero camarero = new Camarero();
        Cliente cliente = new Cliente(camarero);

        cliente.start();
    }
}
