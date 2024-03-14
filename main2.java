import caneta1.java;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Vermelha";
        c1.ponta = 0.8f; // Adicionado sufixo f para indicar float
        c1.tampada = false;

        c1.status(); // Exibe o status da caneta
        c1.rabiscar(); // Tenta rabiscar
        c1.tampar(); // Tampar a caneta
        c1.rabiscar(); // Tenta rabiscar novamente após tampar
    }
}
