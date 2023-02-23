/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb32enrira;

public class Cuenta {
    protected double saldo;
    
    public Cuenta () {
        this.saldo = 3000;
    }
    public Cuenta (double saldo){
        this.saldo = saldo;
    }
    public int retirarFon (double retirar){
       if (retirar > this.saldo){
           return -1;
       }
       else{
            this.saldo = this.saldo - retirar;
            return 0;
       }
    }

    public void hacerDep (double ingresar){
        this.saldo = this.saldo + ingresar;
    }
    public String estadoCuenta () {
        String devolver = "El saldo actual de la cuenta es "+this.saldo+ " €";
        return devolver;
    }
    
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public double getSaldo (){
        return this.saldo;
    }
}
