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
    private double interes = 0.8;
    private double penalizacion = 0.02;
    
        public Libreta_2020 (){
        super ();
    }  
        public double getIntereses (){
            return (this.interes * 100);
        }        
        public int retirarFon (double retirar){
            if (super.retirarFon(retirar + (retirar * this.penalizacion)) == 0){            
                return 0;
            }
                return -1;          
        }
        
}
