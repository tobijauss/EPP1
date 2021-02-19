package de.uniwue.jpp.hoelzchenspiel;

import java.util.Scanner;

public class HumanPlayer implements Player {

    /*
       Implementieren Sie nun die Klasse HumanPlayer. Diese soll das Interface Player implementieren (erledigt)
       einen menschlichen Spieler repräsentieren. Der Name soll über den Konstruktor setzbar sein.
       Die Anzahl der zu ziehenden Hölzchen soll für jeden Spielzug über die Standardeingabe eingelesen werden.
       Die Eingabe ungültiger Spielzüge soll verhindert werden, indem der Spieler so lange aufgefordert wird eine gültige Eingabe zu tätigen, bis diese erfolgt ist.
       Es müssen keine Methoden, außer den durch das Interface Player vorgegebenen, implementiert werden.
       Um auch einen KI-Spieler implementieren zu können, soll der folgendene Algorithmus zur Spielzugberechnung verwendet werden.
        */


    private String name;
    private int numberOfSticksAvailableInTheGame;
    Scanner sc;

    public HumanPlayer(String name) {
        this.name = name;
    }

    Player p1 = new HumanPlayer(getName());

    @Override
    public int takeSticks(int numberOfSticksAvailableInTheGame) {
        this.numberOfSticksAvailableInTheGame = numberOfSticksAvailableInTheGame;
        return numberOfSticksAvailableInTheGame;
    }

    @Override
    public String getName() {
       this.name = name;
       return name;
}

}
