
package com.mycompany.projetojogo_01;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Guerreiro g = new Guerreiro("Rosevaldo");
        Zumbi z = new Zumbi("Conam");
        Arqueiro l = new Arqueiro("Legolas");
        
        Scanner sc = new Scanner(System.in);
             
        int op1;
               
        System.out.println("Escolha seu campeão:");
        System.out.println("1 - Rosevaldo (Guerreiro)");
        System.out.println("2 - Legolas (Arqueiro)");
        op1 = sc.nextInt();
        
        int contBatalha = 1;
        
        switch (op1) {
		case 1:
	        while(g.getVida() > 0 && z.getVida() > 0) {
	            System.out.println("Iniciando batalha #" + (contBatalha++));
	            z.defender( g.atacar() );
	            g.defender( z.atacar() );
	            System.out.printf("%s %.2f vs %.2f %s \n", g.getNome(), 
	                    g.getVida(), z.getVida(), z.getNome());
	            Thread.sleep(3000);
	        } // fim do while
	        System.out.println("###################################");
	        if(z.getVida() > 0 && z.getVida() == 0) {
	            System.out.println("Guerreiro " + z.getNome() + " venceu!");
	        } else if(z.getVida() == 0 && z.getVida() > 0) {
	            System.out.println("Zumbi " + z.getNome() + " venceu!");
	        } else {
	            System.out.println("PARTIDA EMPATADA!");
	        }
			break;
			
		case 2:
	        while(l.getVida() > 0 && z.getVida() > 0) {
	            System.out.println("Iniciando batalha #" + (contBatalha++));
	            z.defender( l.atacar() );
	            l.defender( z.atacar() );
	            System.out.printf("%s %.2f vs %.2f %s \n", l.getNome(), 
	                    l.getVida(), z.getVida(), z.getNome());
	            Thread.sleep(3000);
	        } // fim do while
	        System.out.println("###################################");
	        if(l.getVida() > 0 && z.getVida() == 0) {
	            System.out.println("Guerreiro " + l.getNome() + " venceu!");
	        } else if(l.getVida() == 0 && z.getVida() > 0) {
	            System.out.println("Zumbi " + z.getNome() + " venceu!");
	        } else {
	            System.out.println("PARTIDA EMPATADA!");
	        }
			break;
			
		default:
			System.out.println("Entrada invalida");
			return;
		}        

    }
}
