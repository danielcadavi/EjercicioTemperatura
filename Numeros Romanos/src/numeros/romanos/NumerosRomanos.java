/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.romanos;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel
 */
public class NumerosRomanos {

    public static void main(String[] args) {
      Romanos Unidad[]={new Romanos(0,""), new Romanos(1,"I"), new Romanos(2,"II"), new Romanos(3,"III"), new Romanos(4,"IV"), new Romanos(5,"V"), new Romanos(6,"VI")
              , new Romanos(7,"VII"), new Romanos(8,"VIII"), new Romanos(9,"IX")};
      Romanos Decena[]={new Romanos(0,""),new Romanos(10,"X"),new Romanos(20,"XX"),new Romanos(30,"XXX"),new Romanos(40,"XL"),new Romanos(50,"L"),new Romanos(60,"LX"),new Romanos(70,"LXX"),new Romanos(80,"LXXX"),new Romanos(90,"XC")};
      
      int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 100"));
      int u = n % 10;
      int d = (n/10) % 10;
      
        if(n > 100){ 
            System.out.println("Ingrese un numero valido"); 
        }
        else if(n == 100){
            System.out.println((new Romanos(100,"C")).toString());
        }
        else if (n >= 10){
            System.out.println(Romanos.sumValues(Decena[d], Unidad[u]));   
        }
        else if(n > 0){
                System.out.println(Unidad[n].toString());          
        }
        else{
            System.out.println("Ingrese un numero valido");
        }    
               
    }
    
}