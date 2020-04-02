package seriefibonacci;
import javax.swing.JOptionPane;
/**
 * @author Daniel Cadavid
 */
public class SerieFibonacci {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la serie"));
        int temp = 0;
        int n1 = 0; 
        int n2 = 1;
        
        if(n <= 0)System.out.println("Ingrese una longitud valida para la serie");
        else if(n == 1)System.out.println(n1);
        else if(n == 2)System.out.println(n1+"\n"+n2);
        else{
            System.out.println(n1);//0
            System.out.println(n2);//1
            for(int i = 1; i < n-1; i++){
                temp=n1;                // temp=0;  temp=1
                n1=n2;                  //n1=1;       n1=1
                n2=temp+n1;             //n2=0+1  2= 1+1 
                System.out.println(n2); //1
            }
        }
    }
}
