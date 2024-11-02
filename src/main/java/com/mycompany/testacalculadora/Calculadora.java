/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testacalculadora;

/**
 *
 * @author Eduar
 */


class Calculadora {
    
    private int num1;
    private int num2;
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   
    public int getNum1() {
        return num1;
    }
   
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int soma() {
        return num1 + num2;
    }
   
    public int subtrai() {
        return num1 - num2;
    }
    
    public int multiplica() {
        return num1 * num2;
    }
   
    public int divide() {
        if (num2 != 0) { 
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero!"); 
            return 0; 
        }
    }
}