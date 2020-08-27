
package com.mycompany.projetojogo_01;

import java.util.Random;

public class Personagem {
    // atributos:
    private String nome;
    private double vida = 10.0;
    
    Random r = new Random();
    
    // construtores:
    public Personagem() {
    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    // encapsulamento:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        if(this.vida > 0)
            return vida;
        else
            return 0.0;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    public double atacar(double MIN_DANO, double MAX_DANO){
        return MIN_DANO + (MAX_DANO - MIN_DANO) * r.nextDouble();
    }
    
    public void defender(double dano, double MIN_ARMADURA, double MAX_ARMADURA) {
        double armadura = MIN_ARMADURA + 
                (MAX_ARMADURA - MIN_ARMADURA) * r.nextDouble();
        double ataque = armadura - dano;
        if(ataque > 0)
            this.setVida(this.getVida() - ataque);
    }
    
} // fim da classe
