/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author laboratorio
 */
public class Semestre {
    private double nota1;
    private double nota2;
    private double media;
    int qtd;
    double total;
    double menor;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcular_Media(double v1, double v2){
        this.media=(v1+v2)/2;
        if(this.media < menor){
            menor = this.media;
        }
        
        total += this.media;
        qtd++;
        
        return 0;
    } 
    
    public double calcular_Media(String v1, String v2){
        this.media=((Double.valueOf(v1) + Double.valueOf(v2)))/2;
        if(this.media < menor){
            menor = this.media;
        }
        
        total += this.media;
        qtd++;
        
        return 0;
    } 
    
    public double resp_menor(){
        return menor;
    }
    
    public double resp_Media_Turma(){
        return total/qtd;
    }
}
