
package com.mycompany.projetoh;

public class ProjetoH {
    public static void main(String[] args) {
       
        Carro meuCarro = new Carro("Porche", "718 Boxters", 2024, 4);
        Moto minhaMoto = new Moto("Honda", "NXR-160", 2019, true);
     
        System.out.println("Carro:");
        meuCarro.exibirInformacoes();
        meuCarro.abrirPortaMalas();
            
        System.out.println("\nMoto:");
        minhaMoto.exibirInformacoes();
        minhaMoto.empinar();
      
    }
}
