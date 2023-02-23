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
public class Libreta_2020 extends Libreta_ahorro {
    private double interes = 0.08;
    private double penalizacion = 0.02;
    
        public Libreta_2020 (){
        super ();
    }    
        public int retirarFon (double retirar){
            if (this.saldo < retirar){
                return -1;
            }
            else{
                super.retirarFon(retirar);
                return 0;
            }
           
        }
        
}
