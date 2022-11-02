package br.unir.singleton;

public final class Singleton {

    private static Singleton instance;
    public String valor;

    private Singleton(String valor) {
        try {
            Thread.sleep(1000);
        
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    public static Singleton getInstance(String valor) {
        if (instance == null) {
            instance = new Singleton(valor);
        }
        return instance;
    }
}
