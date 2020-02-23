package calendariomaya;
import javax.swing.JOptionPane;
public class CalendarioMaya {
    public static void main(String[] args) {
        
        String fecha, d;
        fecha = JOptionPane.showInputDialog("Ingrese la fecha en calendario HAAB ");
        String mesesHAAB[] = {"pop", "no", "zip", "zotz", "tzec", "xul", "yoxkin", "mol", "chen", "yax", "zac", "ceh", "mac", "kankin", "muan", "pax", "koyab", "cumhu","uayet"};
        String diasTZOLKIN[] = {"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk", "ok", "chuen", "eb", "ben", "ix", "mem", "cib", "caban", "eznab", "canac", "ahau"};
        String[] divisionFechas;
        divisionFechas = fecha.split(" ");
        d = divisionFechas[0].substring(0,divisionFechas[0].length() - 1);
        
        int lim,numDia, numAno, contador, diasTzolkin, tzolkinCont, mx;
        numDia = Integer.parseInt(d);
        String m, a;
        m = divisionFechas[1].trim();
        a = divisionFechas[2].trim();
        numAno = Integer.parseInt(a);
        mx = 4000;
        tzolkinCont = 0;
        diasTzolkin = 1;
        contador = 0;
        
        boolean bool;
        bool = false;
        
        System.out.println("Calendario HAAB: " + fecha);
            for(int i = 0 ; i <= numAno ; i++){
                
                for(int j = 0 ; j < 19 ; j++){
                    
                    if(j == 18){
                        lim = 5;
                    }else{
                        lim = 20;
                    }
                    for(int k = 0 ; k < lim ; k++){
                        
                        if(k == numDia && (mesesHAAB[j] == null ? m == null : mesesHAAB[j].equals(m)) && i == numAno){
                            bool = true;
                            break;
                        }
                        contador++;
                    }
                    if(bool){
                        break;
                    }
                }
                if(bool){
                    break;
                } 
            }
            for(int i = 0 ; i < mx; i++){
                
                for(int j = 1 ; j <= 13 ; j++){
                    
                    for(int k = 0 ; k < 20 ; k++){
                        
                        if(diasTzolkin >= 14){
                            diasTzolkin = 1;
                        }
                        if (contador == tzolkinCont){
                            System.out.println("Calendario TZOLKIN "+" " + diasTzolkin++ +" " +diasTZOLKIN[k]+" "+i);
                            bool = true;
                            break;
                        }
                        tzolkinCont++;
                        diasTzolkin++;
                    }
                    if(bool){
                        break;
                    }  
                }
                if(bool){
                    break;
                }
            }   
    }
}
