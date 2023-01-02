package one.digitalinnovation.oo;

/**
* classe de exemplo para o exercício da Aula 3 de Orientação a objetos
*/
public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor aqui

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadedeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadedeTanque;
    }
    void setCor (String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //get e set tanque

    //método do total para encher o tanque

    void  setCapacidadeTanque(int capacidadeTanque) {
        this. capacidadeTanque = capacidadeTanque;
            }

     int getCapacidadeTanque() {
        return capacidadeTanque;
     }

    double totalValorTanque (double valorCombustivel) {
        return capacidadeTanque  * valorCombustivel;
    }

    public boolean getModelo() {
        return false;
    }
}
