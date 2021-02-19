package de.uniwue.jpp.hoelzchenspiel;

import java.util.ArrayList;
import java.util.Collection;

public interface Player {

    public int takeSticks(int numberOfSticksAvailableInTheGame);
    //Dieser Methode wird die Anzahl der im Spiel befindlichen Hölzchen übergeben. Der Rückgabewert ist die Anzahl der Hölzchen, die der Spieler zieht.

    public String getName();
        //Gibt den Namen des Spieler als String zurück

    public static Collection<Integer> getValidDraws(){
        Collection <Integer> valid = new ArrayList<>();
        valid.add(1);
        valid.add(2);
        valid.add(3);
        return valid;
    }
    //Gibt eine Collection zurück, die alle im Allgemeinen gültigen Spielzüge enthält (hier 1,2,3).

    public static Collection<Integer> getValidDraws(int numberOfSticksAvailableInTheGame) {
        return null;
    }
    //Gibt eine Collection zurück, die alle gültigen Spielzüge enthält, die beim übergebenen Spielstand gültig sind

    public static boolean isValidDraw(int draw){
        return false;
    }
    //Gibt zurück, ob der übergebene Zug im Allgemeinen valide ist.

    public static boolean isValidDraw(int draw, int numberOfSticksAvailableInTheGame){
        return false;
    }
    //Gibt zurück, ob der übergebene Zug bei dem übergebenem Spielstand valide ist.
}
