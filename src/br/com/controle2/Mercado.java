/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle2;

/**
 *
 * @author laboratorio
 */
public class Mercado {
    private double valordaCompra;
    private double desconto;
    double entre;
    double maior;
    int qtd;

    public double getValordaCompra() {
        return valordaCompra;
    }

    public void setValordaCompra(double valordaCompra) {
        this.valordaCompra = valordaCompra;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcular_Desconto(){
        //MAIOR
        if (this.valordaCompra < maior){
            maior = this.valordaCompra;
        }
        
        
        //DESCONTO
        if(this.valordaCompra < 500){
            this.desconto = this.valordaCompra*(5/100);
        }else{
            this.desconto = this.valordaCompra*(3/100);
        }
        
        //ENTRE 200 E 500
        if (this.valordaCompra > 200 && this.valordaCompra < 500){
            qtd++;            
        }
        
        entre = qtd;
        
        return 0;
    }
    
    public double resp_maior(){
        return maior;
    }
    
    public double resp_desconto(){
        return desconto;
    }
    
    public double resp_entre(){
        return entre;
    }
}
