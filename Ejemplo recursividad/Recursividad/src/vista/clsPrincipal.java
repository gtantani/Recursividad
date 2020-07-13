/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import logica.clsRecursividad;
/**
 *
 * @author pc
 */
public class clsPrincipal {
    public clsPrincipal(){
    
    }
    
    public static void main(String[] args) {
        clsRecursividad obj = new clsRecursividad();
        int aa = obj.sumaDivisores(12);
        System.out.println("res : "+aa);
    }
}
