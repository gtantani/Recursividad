/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author pc
 */
public class clsRecursividad {
    public clsRecursividad(){
        
    }
    
    public boolean esPar(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esParN(int n){
        return (n%2 == 0 ? true : false);
    }
    
    public int factorial(int n){
        //caso base
        if(n == 0){
            return 1;
        }else{ // hipotesis mas el último proceso
            return factorial(n-1)*n;
        }
    }
    
    public int factorial2(int n){
        return n == 0 ? 1 : factorial2(n-1)*n;
    }
    
    public int sumadig(int n){
        return n<10 ? n : (sumadig(n/10)+n%10) ;
    }
    
    public int sumadigPar(int n){
        if(n == 0){
            return 0;
        }else{
            if((n%10)%2 == 0){
                return sumadigPar(n/10)+n%10;
            }else{
                return sumadigPar(n/10);
            }
        }
    }
    
    public int sumadigPar2(int n){
        return n == 0 ? 0 : (((n%10)%2 == 0 )? (sumadigPar2(n/10)+n%10):(sumadigPar2(n/10))) ;
    }
    
    public int sumaBit(int n){
        if(n == 1){
            return 1;
        }else{
            return sumaBit(n/2)+n%2;
        }
    }
    
    public int sumaBit2(int n){
        return n == 1 ? 1 : sumaBit2(n/2)+n%2;
    }
    
    private int funCanDivisores(int n, int i){
        if(n == i){
            return 1;
        }else{
            return funCanDivisores(n, i+1) + (n%i == 0 ? 1: 0);
        }
    }
    
    public boolean esPrimo(int n){
        int cd = funCanDivisores(n, 1);
        return (cd <= 2 ? true : false);
    }
    
    public boolean estaOrdeNumDig(int n){
        if(n < 10){
            return true;
        }else{
            return estaOrdeNumDig(n/10)&&((n%10 >= (n/10)%10)? true : false);
        }
    }
    
    public int sumaDivisores(int n){
        return sumaDivisoresNu(n,n);
    }
    
    private int sumaDivisores(int n, int i){
        if(i == 1){
            return 1;
        }else{
            return sumaDivisores(n, i-1)+(n%i == 0 ? i : 0);
        }
    }
    
    private int sumaDivisoresNu(int n, int i){
        return (i == 1 ? 1 : (sumaDivisoresNu(n, i-1)+(n%i == 0 ? i : 0)));
    }
    
    public int sumaFactores(int n){
     return 0;
    }
    
    
}
