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
        
        cc1.hacerDep(220);
        l1.hacerDep(400);
        la1.hacerDep(400);
        
        System.out.println (cc1.estadoCuenta());
        System.out.println (l1.estadoCuenta());
        System.out.println (la1.estadoCuenta());        

        switch  (cc1.pagar(220)){
            case -1:
                System.out.println ("Has retirado más de lo que tiene la cuenta y la libreta, error");                        
            break;
            
            case -2:
                System.out.println ("Operación realizada con éxito, pero quitando de la libreta");
            break;
            default:
                System.out.println ("Operación realizada con éxito");        
        }
        if (l1.retirarFon(400) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta, error");        
        else
            System.out.println ("Operación realizada con éxito");        

        if (la1.retirarFon(400) == -1)
            System.out.println ("Has retirado más de lo que tiene la cuenta, error");        
        else
            System.out.println ("Operación realizada con éxito");   
        
        System.out.println (cc1.estadoCuenta());
        System.out.println (l1.estadoCuenta());
        System.out.println (la1.estadoCuenta());
        
        l1.actualizaIntereses();
        la1.actualizaIntereses();
        System.out.println ("Los intereses de la libreta 2020 han cambiado,tu saldo actual es: " +l1.getSaldo()+ " €");
        System.out.println ("Los intereses de la libreta de ahorros han cambiado,tu saldo actual es: " +la1.getSaldo()+ " €");        
        
        double retirar;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println ("Dime la cantidad de dinero a retirar de la cuenta corriente");
        retirar = teclado.nextDouble();
        
        switch  (cc1.pagar(retirar)){
            case -1:
                System.out.println ("Has retirado más de lo que tiene la cuenta y la libreta, error");                        
            break;
            
            case -2:
                System.out.println ("Operación realizada con éxito, pero quitando de la libreta");
                System.out.println (cc1.estadoCuenta());
                System.out.println (la1.estadoCuenta());                
            break;
            default:
                System.out.println ("Operación realizada con éxito"); 
                System.out.println (cc1.estadoCuenta());
                System.out.println (la1.estadoCuenta());                
        }
        
    }
    
}
