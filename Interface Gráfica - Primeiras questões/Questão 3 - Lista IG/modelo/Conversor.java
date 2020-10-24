/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Maria
 */
public class Conversor {
    
    private String escolha, retorno;
    private float result, valor;
    
    public Conversor(){}

    public Conversor(float valor, String escolha) {
        this.valor = valor;
        this.escolha = escolha;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEscolha() {
        return this.escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public String getRetorno() {
        return this.retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
    
    public void converter(){
       
       if (escolha == "Libra"){
           this.result = (float) (valor * 7.37);
        } else if (escolha == "Dolar"){
            this.result = (float) (valor * 5.61);
           } else if (escolha == "Euro") {
                this.result = (float) (valor * 6.65);
             }
    
       this.retorno = Float.toString(this.result);        
    }

    public String toString() {
        return "valor: " + this.valor + "\nescolha: " + this.escolha;
    }
}
