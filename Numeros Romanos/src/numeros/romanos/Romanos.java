/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.romanos;

/**
 *
 * @author Daniel
 */
public class Romanos {
    private int num;
    private String valorRomano;
    public Romanos(int num, String rep){
        this.num = num;
        this.valorRomano = rep;
    }
    public Romanos(){
        
    }
    public int getNum(){
        return this.num;
    }
    
    public String getValorRomanos(){
        return this.valorRomano;
}
    public void setNum(int num){
        this.num = num;
    }
    
    public void setValorRomanos(String str){
        this.valorRomano = str;
    }
    public static String sumValues(Romanos one, Romanos two){
        Romanos r = new Romanos();
        r.setNum(one.getNum() + two.getNum());
        r.setValorRomanos(one.getValorRomanos() + two.getValorRomanos());
        return r.toString();
    }
    @Override
    public String toString(){
        return "El valor del numero "+num+" en romano es " + valorRomano;
    }
}
