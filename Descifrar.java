package descifrar;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Descifrar {
    
    public static String cifrar(String txt, int cod) {
        StringBuilder palCifrada = new StringBuilder();
        cod = cod % 26;
        for (int i=0; i<txt.length();i++){
            
            if (txt.charAt(i)>='a'&&txt.charAt(i)<='z'){
                if ((txt.charAt(i)+cod)>'z') palCifrada.append((char)(txt.charAt(i)+cod-26)); 
                else palCifrada.append((char)(txt.charAt(i)+cod));
            
            } else if(txt.charAt(i)>='A'&&txt.charAt(i)<='Z'){   
                if ((txt.charAt(i)+cod)>'Z') palCifrada.append((char)(txt.charAt(i)+cod-26));
                else  palCifrada.append((char)(txt.charAt(i)+cod));
            }
        }
        return palCifrada.toString();
    }
    public static String descifrar(String txt, int cod) {
        cod = cod%26;
        StringBuilder palCifrada = new StringBuilder();
        for(int i=0; i<txt.length(); i++){
            
            if(txt.charAt(i)>='a'&&txt.charAt(i)<='z'){
                if((txt.charAt(i)-cod)<'a')palCifrada.append((char)(txt.charAt(i)-cod+26));
                else palCifrada.append((char)(txt.charAt(i)-cod));
            } 
            else if(txt.charAt(i)>='A'&&txt.charAt(i)<='Z'){
                if((txt.charAt(i)-cod)<'A') palCifrada.append((char)(txt.charAt(i)-cod+26));
                else palCifrada.append((char)(txt.charAt(i)-cod));
            }
        }
        return palCifrada.toString();
    }
    public static void main(String[] args) throws IOException {
        
        char op;
        String txt;
        int cod;
        do{
            txt = JOptionPane.showInputDialog("Ingrese un texto");
        }while(txt.isEmpty());
        
        do{
           cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código: "));
        } while(cod<1);
        
        do{
            System.out.print("Ingrese (C) para cifrar o (D) para descifrar: ");
            op = (char)System.in.read();
        }while(Character.toUpperCase(op)!='C'&&Character.toUpperCase(op)!='D');
        if(Character.toUpperCase(op)=='C')System.out.println("Texto cifrado es: "+cifrar(txt,cod));
        else System.out.println("Texto descifrado es: "+descifrar(txt,cod));
    }

}
