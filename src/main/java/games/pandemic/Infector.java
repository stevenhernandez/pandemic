package games.pandemic;

import java.util.Random;
import java.util.Stack;

/**
 * Created by Steven on 1/31/2015.
 */
public class Infector {
    private static Stack<CityName> infectionDeck = new Stack<CityName>();
    private int INFECTION_RATE = 2;

    public void build(){
        for(CityName cityName:CityName.values()){
            infectionDeck.push(cityName);
        }
    }

    public void shuffle(){
        Random rn = new Random();
        Stack<CityName> tempDeck = new Stack<CityName>();
        int deckSize = infectionDeck.size();
        for(int i = 0; i < deckSize; i++){
            int cardAt = rn.nextInt(deckSize - i);
            CityName cityName = infectionDeck.get(cardAt);
            infectionDeck.remove(cardAt);
            tempDeck.push(cityName);
        }
        infectionDeck = tempDeck;
    }

    public CityName draw(){
        return infectionDeck.pop();
    }

    public void pandemic(){

    }
}
