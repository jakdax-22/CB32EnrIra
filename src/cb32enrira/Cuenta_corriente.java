/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb32enrira;

/**
 *
 * @author enriq
 */
public class Cuenta_corriente extends Cuenta {
    private Libreta_ahorro la1 = new Libreta_ahorro();
    public Cuenta_corriente (int saldo, Libreta_ahorro la1){
        this.saldo = saldo;
        this.la1 = la1;
    }
    public int pagar(double retirar){
        if (retirar > this.saldo){
            if ((this.saldo * -1) > la1.getSaldo()){
                return -1;                
            }
            else{
            la1.retirarFon((retirar - this.saldo));
            this.saldo=0;
            return -2;
            }
        }
        else {
            this.saldo -= retirar;
            return 0;
        }
    }
}

























































