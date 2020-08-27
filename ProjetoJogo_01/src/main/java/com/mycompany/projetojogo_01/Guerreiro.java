
package com.mycompany.projetojogo_01;

public class Guerreiro extends Personagem implements IInterjeicao {
    private final double MIN_DANO = 1.5;
    private final double MAX_DANO = 5.0;
    private final double MIN_ARMADURA = 0.5;
    private final double MAX_ARMADURA = 4.5;

    public Guerreiro(String nome) {
        super(nome);
    }
    
    public double atacar() {
        this.ataque();
        return super.atacar(MIN_DANO, MAX_DANO); 
    }

    public void defender(double dano) {
        this.defesa();
        super.defender(dano, MIN_ARMADURA, MAX_ARMADURA);
    }

    @Override
    public void ataque() {
        System.out.println("G: Pow!");
    }

    @Override
    public void defesa() {
        System.out.println("G: Ouch...");
    }

    
    
    
    
    
    
} // fim da classe
