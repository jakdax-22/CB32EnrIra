/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb32enrira;
import java.util.*;

/**
 *
 * @author enriq
 */
public class CB32EnrIra {

    public static void main(String[] args) {
        Libreta_ahorro la1 = new Libreta_ahorro();        
        Cuenta_corriente cc1 = new Cuenta_corriente(3000,la1);
        Libreta_2020 l1 = new Libreta_2020();
       
        System.out.println (cc1.estadoCuenta());
        System.out.println (l1.estadoCuenta());
        System.out.println (la1.estadoCuenta());

        if (cc1.pagar(220) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta y la libreta, error");        
        else if (cc1.pagar(220) == -2)
            System.out.println ("Operación realizada con éxito, pero quitando de la libreta");
        else
            System.out.println ("Operación realizada con éxito");        

        if (l1.retirarFon(799) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta, error");        
        else
            System.out.println ("Operación realizada con éxito");        

        if (la1.retirarFon(20) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta, error");        
        else
            System.out.println ("Operación realizada con éxito");   
        
        System.out.println (cc1.estadoCuenta());
        System.out.println (l1.estadoCuenta());
        System.out.println (la1.estadoCuenta());
        
        l1.actualizaIntereses(0.45);
        System.out.println (l1.getIntereses());
        
        double retirar;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println ("Dime la cantidad de dinero a retirar de la cuenta corriente");
        retirar = teclado.nextDouble();
        
        if (cc1.pagar(retirar) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta y la libreta, error");        
        else if (cc1.pagar(retirar) == -2){
            System.out.println ("Operación realizada con éxito, pero quitando de la libreta");
            System.out.println(cc1.estadoCuenta());
            System.out.println(cc1.estadoCuenta());
         }
        else{
            System.out.println ("Operación realizada con éxito");      
        System.out.println (la1.estadoCuenta());
        System.out.println (cc1.estadoCuenta());
        }
        
    }
    
}
