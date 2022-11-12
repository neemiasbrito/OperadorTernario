/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author neemi
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner opt = new Scanner(System.in);
        
        System.out.println("Digite primeiro numero: ");
        int n1 = opt.nextInt();
        System.out.println("Digite segundo numero: ");
        int n2 = opt.nextInt();
        
        int r;
        String nome1 = "maior";
        String nome2 = "menor";
      
        r = (n1>n2) ? 0 : 1; //se o n1 for maior quer o n2, recebe 0 senao recebe 1
        System.out.println("Se " + n1 + " for maior que " + n2 + " Resposta vai ser 0 (false), Se senão vai ser 1 (true)  ");
        System.out.println("Resposta: " + r);
    }
    
}
