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
public class Reggueton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carta crisa = new Carta("crisa",20,'c');
        Carta AsDePicas= new Carta("As de picas",1,'\u2660');
        Carta dosDePicas= new Carta("2 de picas",2,'\u2660');
        Carta tresDePicas= new Carta("3 de picas",3,'\u2660');
        Carta cuatroDePicas= new Carta("4 de picas",4,'\u2660');
        Carta cincoDePicas= new Carta("5 de picas",5,'\u2660');
        Carta seisDePicas= new Carta("6 de picas",6,'\u2660');
        Carta sieteDePicas= new Carta("7 de picas",7,'\u2660');
        Carta ochoDePicas= new Carta("8 de picas",8,'\u2660');
        Carta nueveDePicas= new Carta("9 de picas",9,'\u2660');
        Carta diezDePicas= new Carta("10 de picas",10,'\u2660');
        Carta onceDePicas= new Carta("J de picas",11,'\u2660');
        Carta doceDePicas= new Carta("Q de picas",12,'\u2660');
        Carta treceDePicas= new Carta("K de picas",13,'\u2660');
        
        System.out.println(AsDePicas.getName()+ " "+ AsDePicas.getvalue()+ AsDePicas.getSuit());
    }
    
}
