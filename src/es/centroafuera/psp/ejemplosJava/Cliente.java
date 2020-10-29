package es.centroafuera.psp.ejemplosJava;

public class Cliente  extends Thread {

    Camarero camarero;

    public Cliente(Camarero camarero){
        this.camarero = camarero;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Main.list.isEmpty()){
                    camarero.prepararComanda();
                    System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                } else {
                    System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
                    Main.list.remove(0);
                    sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
