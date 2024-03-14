import main2.java;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não é possível rabiscar com a caneta tampada.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    
}





