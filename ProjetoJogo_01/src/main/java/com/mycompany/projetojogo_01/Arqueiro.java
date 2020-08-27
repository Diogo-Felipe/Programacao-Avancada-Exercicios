
package com.mycompany.projetojogo_01;

public class Arqueiro extends Personagem implements IInterjeicao {
    private final double MIN_DANO = 0.3;
    private final double MAX_DANO = 3.7;
    private final double MIN_ARMADURA = 0.1;
    private final double MAX_ARMADURA = 7.5;

    public Arqueiro(String nome) {
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
        System.out.println("A: Thiu!");
    }

    @Override
    public void defesa() {
        System.out.println("A: Arg...");
    }

    
    
    
    
    
    
} // fim da classe
