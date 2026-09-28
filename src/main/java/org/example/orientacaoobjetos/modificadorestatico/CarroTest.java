package org.example.orientacaoobjetos.modificadorestatico;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("BMW", 285);

        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
