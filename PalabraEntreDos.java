package palabraentredos;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel
 */
public class PalabraEntreDos {

    public static void main(String[] args) {
        String abcdario[] = new String []{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String cadena1 = JOptionPane.showInputDialog("Ingrese la cadena inicial");
        String cadena2 = JOptionPane.showInputDialog("Ingrese la cadena de en medio");
        String cadena3 = JOptionPane.showInputDialog("Ingrese la cadena final");
        String Vcad1[] = new String [cadena1.length()];
        String Vcad2[] = new String [cadena2.length()];
        String Vcad3[] = new String [cadena3.length()];

        String v_temp[] = null;
        String v_temp2[] = null;
        String v_temp3[] = null;
        
        for(int i = 0; i < cadena1.length();i++){
            v_temp = cadena1.split("");
            Vcad1[i] = v_temp[i];
            //System.out.println(Vcad1[i]);
        }
        
        for(int i = 0; i < cadena2.length();i++){
            v_temp2 = cadena2.split("");
            Vcad2[i] = v_temp2[i];
            //System.out.println(Vcad2[i]);
        }
    
        for(int i = 0; i < cadena3.length();i++){
            v_temp3 = cadena3.split("");
            Vcad3[i] = v_temp3[i];
            //System.out.println(Vcad3[i]);
        }
        int numCad1[] = new int [cadena1.length()];
        for(int i = 0; i < cadena1.length();i++){
            for(int j = 0; j < 26;j++){
                if( (Vcad1[i].equals(abcdario[j]))== true){
                    numCad1[i] = j;
                } 
            }   
             //System.out.println(numCad1[i]);
        }
        int numCad2[] = new int [cadena2.length()];
        for(int i = 0; i < cadena2.length();i++){
            for(int j = 0; j < 26;j++){
                if( (Vcad2[i].equals(abcdario[j]))== true){
                    numCad2[i] = j;
                } 
            }   
             //System.out.println(numCad2[i]);
        }
        int numCad3[] = new int [cadena3.length()];
        for(int i = 0; i < cadena3.length();i++){
            for(int j = 0; j < 26;j++){
                if( (Vcad3[i].equals(abcdario[j]))== true){
                    numCad3[i] = j;
                } 
            }   
             //System.out.println(numCad3[i]);
        }
        if((numCad1[0]< numCad2[0])&& (numCad2[0]< numCad3[0])){
                System.out.println("La palabra: "+cadena2+" esta entre "+ cadena1+" y "+cadena3);
        }
        else if((numCad1[0]== numCad2[0])&& (numCad2[0]== numCad3[0])){
            if((numCad1[1]< numCad2[1])&& (numCad2[1]< numCad3[1])){
                System.out.println("La palabra: "+cadena2+" esta entre "+ cadena1+" y "+cadena3);
            }
            else if((numCad1[1]== numCad2[1])&& (numCad2[1]== numCad3[1])){
                if((numCad1[2]< numCad2[2])&& (numCad2[2]< numCad3[2])){
                    System.out.println("La palabra: "+cadena2+" esta entre "+ cadena1+" y "+cadena3);
                }
            }
        }
        else if((numCad1[0]< numCad3[0])&& (numCad2[0]< numCad1[0])){
            System.out.println("La palabra: "+cadena2+" NO esta entre "+ cadena1+" y "+cadena3);
        }
        else if((numCad1[0]> numCad2[0])&& (numCad2[0]< numCad3[0])){  
            System.out.println("La palabra: "+cadena2+" esta entre "+ cadena1+" y "+cadena3);
        }else {
            System.out.println("La palabra: "+cadena2+" NO esta entre "+ cadena1+" y "+cadena3);
        }
        /*
        else if((numCad1[0]== numCad2[0])&& (numCad2[0]== numCad3[0])){
            if((numCad1[1]== numCad2[1])&& (numCad2[1]== numCad3[1])){
                if((numCad1[2] == numCad2[2]) && numCad2[2] < numCad3[2]){
                    System.out.println("La palabra: "+cadena2+" NO esta entre "+ cadena1+" y "+cadena3);
                }
            }
            
        }  */       
    }   
}
