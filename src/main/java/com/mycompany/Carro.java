package com.mycompany;

public class Carro {
    int numeroPlaca, velocidade, velocidadeMax,potencia;
        Carro() {
            this.numeroPlaca = 500;
            this.velocidade = 0;
            this.velocidadeMax = 200;
            this.potencia = 450;
        }
        Carro(int numeroPlaca, int velocidade, int velocidadeMax, int potencia){
            this.numeroPlaca = numeroPlaca;
            this.velocidade = velocidade;
            this.velocidadeMax = velocidadeMax;
            this.potencia = potencia;
        }
}
