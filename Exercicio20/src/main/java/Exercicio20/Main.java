/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio20;

import java.util.Scanner;
/**
 *
 * @author Maicol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagem = 0.0f;
        float valorDesconto = 0.0f;
        int totalCarros = 0;
        int totalCarrosSemiNovos = 0;

        float valorPagar = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Digite o ano do veículo:");
            anoFabricacao = leitor.nextInt();
            
                if(anoFabricacao<=2000){
                //12%
                System.out.println("Ele terá um desconto de 12%.");
                porcentagem = 0.12f;
                
            } else { 
                //7%
                System.out.println("Ele terá um desconto de 7%.");
                porcentagem = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            System.out.println("Digite o valor do carro:");
            valorCarro = leitor.nextFloat();

            

            
            valorDesconto = valorCarro * porcentagem;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do desconto foi de: "+valorDesconto);
            System.out.println("O novo valor que deve ser pago é: "+valorPagar);
            
            System.out.println("Deseja fazer mais cadastro? sim-(n) / não-(n).");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros semi novos: "+totalCarrosSemiNovos);
        System.out.println("Total de carros: "+totalCarros);
    }
    
}
