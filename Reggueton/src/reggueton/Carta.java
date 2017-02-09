/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reggueton;

/**
 *
 * @author Rubén
 */
public class Carta {
    final char suit;
    final String name;
    private boolean faceUp;     // true = boca arriba
    final int value;
    
    /* Contructor de la carta*/
    public Carta(String name, int value,char suit){
        this.name=name;
        this.value=value;
        this.suit=suit;
        faceUp= true;
    }
    
    
    /*metodos para consultar los valores de una carta, condicianados a su cara*/
    
    public String getName(){
        if(faceUp){
            return name;            
        }else{
            return null;
        }
        
    }
    
    public char getSuit(){
        if(faceUp){
            return suit;            
        }else{
            return 'x';
        }
    }
    public int getvalue(){
        if(faceUp){
            return value;            
        }else{
            return 0;
        }
    }
    
    public boolean getface(){
        return faceUp;
    }
    
    
    /*Metodo para cambiar la cara*/
    public void chageFace(){
        faceUp=!faceUp;
    }
    
   
    /*Futura clase para las habilidades */
    /*
    public void ability(){
        switch(value){
            case 1:
                break;
            case 2:
                break;
            case 7:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
    }*/
    
    /*implementar el compareTo()*/
    
}
