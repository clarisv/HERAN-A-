
package com.mycompany.projetoh;

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano); 
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("abrindo o porta-malas do carro.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();  
        System.out.println("numero de portas: " + portas);
    }
}
    
