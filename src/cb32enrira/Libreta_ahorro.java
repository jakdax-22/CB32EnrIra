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
public class Libreta_ahorro extends Cuenta {
    protected double interes = 0.04;
    
    public Libreta_ahorro (){
    super();
    }
        public void actualizaIntereses (double intereses){
            this.interes = intereses;
        }
        public double getIntereses (){
            return (this.interes * 100);
        }
}
