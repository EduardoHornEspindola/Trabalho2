
package com.mycompany.testacalculadora;

/**
 *
 * @author Eduar
 */

import java.util.Scanner;


public class TestaCalculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String operador; 

        System.out.println("Calculadora - Digite '.' para sair.");
       
        while (true) {
            
            System.out.print("Digite o operador (+, -, *, /) ou '.' para sair: ");
            operador = scanner.next();
           
            if (operador.equals(".")) {
                System.out.println("Encerrando...");
                break;
            }
            
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
          
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
        
            Calculadora calculadora = new Calculadora(num1, num2);

            int resultado; 
            switch (operador) {
                case "+":
                    resultado = calculadora.soma(); 
                    System.out.println("Resultado: " + resultado); 
                    break;
                case "-":
                    resultado = calculadora.subtrai(); 
                    System.out.println("Resultado: " + resultado); 
                    break;
                case "*":
                    resultado = calculadora.multiplica(); 
                    System.out.println("Resultado: " + resultado); 
                    break;
                case "/":
                    resultado = calculadora.divide(); 
                    System.out.println("Resultado: " + resultado); 
                    break;
                default:
                    
                    System.out.println("Operador inválido.");
            }
        }

        scanner.close();
    }
}
