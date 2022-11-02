package br.unir.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Se você ver o mesmo valor, então o Singleton foi reutilizado (:" + "\n"
                + "Se você ver valores diferentes, então dois Singletons foram criados ):" + "\n\n"
                + "Resultado:" + "\n");
        
        Singleton singleton = Singleton.getInstance("Valor Original");
        Singleton anotherSingleton = Singleton.getInstance("Novo valor");
        
        System.out.println(singleton.valor);
        System.out.println(anotherSingleton.valor);
    }
}
