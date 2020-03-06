package cifrar;
import javax.swing.JOptionPane;
public class Cifrar {
    public static void main(String[] args) {
        int incremento;
        String palabra, palabraCifrada = "";
        String alfabet = "abcdefghijklmnopqrstuwvyz";
        String alfabetCase = alfabet.toUpperCase();
        palabra = JOptionPane.showInputDialog("Ingresar una cadena");
        String palabraMayuscula = palabra.toUpperCase();//cadena en mayuscula
        incremento = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de cifrado"));
        for( int i = 0; i < palabraMayuscula.length(); i++) {
            
            for(int j = 0; j < alfabetCase.length(); j++){
                
                if(palabraMayuscula.charAt(i) == alfabetCase.charAt(j)){
                    
                    if(j + incremento >= alfabetCase.length()){
                        palabraCifrada += alfabetCase.charAt((j+incremento) % alfabetCase.length());
                    }
                    else palabraCifrada += alfabetCase.charAt(j+incremento);
                }
            }
        }
            System.out.println("La cadena inicial fue: " + palabra.toUpperCase());
            System.out.println("La cadena cifrada con " + incremento + " es : " + palabraCifrada);
    }
}