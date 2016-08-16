/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

/**
 *
 * @author ASUS
 */
public class metodosdeBusqueda {
    static boolean b=false;
    public static void busquedaSecuencial(int x[], int a){
        for (int i=0; i<x.length; i++){
        if (x[i]==a){
            System.out.println("Busqueda secuencial: El elemento se encuentra en la posición "+(i+1));
            System.out.println("Recorrido búsqueda secuencial "+(i));
            b=true;
        }
}
        if(!b){
            System.out.println("Búsqueda secuencial: El elemento no se enecuentra almacenado /:");
       } 
        
    } 
    
        
    public static int busquedaBinaria(int x[], int dato){ 
        
        int centro;
        boolean b=false;
        int cont =0;
        int inicio=0;
        int fin=(x.length)-1; 
        while(inicio<=fin){ 
            centro=(fin+inicio)/2; 
            if(x[centro]==dato){
                System.out.println("Búsqueda Binaria: El elemento se encuentra en la posición "+(centro+1) );
                System.out.println("Vueltas búsqueda binaria: "+cont);
                b=true;
                return centro; }
            else if(dato < x[centro] ){ 
                fin=centro-1; 
            } else { 
                inicio=centro+1; 
            }
           
            cont++;
        }
        
         if(!b){
            System.out.println("Búsqueda binaria: El elemento no se enecuentra almacenado /:");
            
       } 
        return -1; 
    } 
}
