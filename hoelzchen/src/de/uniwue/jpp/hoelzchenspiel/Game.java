package de.uniwue.jpp.hoelzchenspiel;

public class Game implements Player{

    //Instanzvariablen
     public Player p1;
     public Player p2;
     public String SpielerAnDerReihe;
     public int numberOfSticksAvailableInTheGame;

     public Game(int initialNumberOfStick, Player p1, Player p2){
         this.numberOfSticksAvailableInTheGame = initialNumberOfStick;
         this.p1 = p1;
         this.p2 = p2;
     }
     public Player play(){
         return null;
         //Diese Methode steuert den Spielablauf, beginnend mit einem Zug des Spielers p1 und gibt den Spieler zurück der das Spiel gewonnen hat
     }

    public static void main(String[] args) {
        // instanziiert das SPiel
    }

    @Override
    public int takeSticks(int numberOfSticksAvailableInTheGame) {
        this.numberOfSticksAvailableInTheGame = numberOfSticksAvailableInTheGame;
        return numberOfSticksAvailableInTheGame;
    }

    @Override
    public String getName() {
       return null;
    }
}
