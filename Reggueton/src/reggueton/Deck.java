package reggueton;
import java.util.*;
        
public class Deck {
    
    private List<Carta> deck;
    
    public Deck (){
        deck = new LinkedList<>();
    }
    
    public void addCard (Carta newCard){
        deck.add(newCard);
    }
    
    public void shuffle (){
        Random rnd = new Random();
        int rNum = (int)(rnd.nextDouble()*deck.size()-1);
        Carta aux = deck.get(rNum);
        
        for(int i=0; i < 500; i++){
            rNum = (int)(rnd.nextDouble()*deck.size()-1);
            aux = deck.set(rNum, aux);
        }
        
        deck.add(aux);
    }
    
    public Carta draw (){
        return deck.remove(deck.size()-1);
    }
    
    public void clear(){
        deck.clear();
    }
}
