package es.centroafuera.psp.ejemplosJava;

public class Camarero extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                prepararComanda();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void prepararComanda() throws InterruptedException {
        System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
        Main.list.add("Zumo");
        sleep(1000);
        Main.list.add("Tostada");
        sleep(1000);
        Main.list.add("Mermelada");
        sleep(1000);
        System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
        sleep(5000);
    }
}
