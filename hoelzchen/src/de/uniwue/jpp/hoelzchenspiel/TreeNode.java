package de.uniwue.jpp.hoelzchenspiel;

import java.util.Collection;
import java.util.Optional;

public abstract class TreeNode {

    public TreeNode(int numberOfSticksLeft){

        if(numberOfSticksLeft<0){
            throw new IllegalArgumentException("numberOfSticksLeft less than 0");
        }
        /*

        Der Konstruktor. Falls numberOfSticksLeft kleiner als 0 ist, soll eine IllegalArgumentException geworfen werden,
        die mindestens die Worte "numberOfSticksLeft" und "less than 0" beinhaltet. Der Konstruktor soll den ganzen Baum
        unter der neuen Node erstellen. Dies ist mit Hilfe der folgenden Methoden bereits hier ohne direkte Kenntnis
        der nicht-abstrakten Klassen MaxNode, MinNode und Leaf möglich.
         */
    }
    public TreeNode createChild(int numberOfSticksLeft){
        return null;
        /*
        Mit dieser Methode liefert ein TreeNode-Objekt ein passendes Nachfolge-TreeNode-Objekt.
        Da nicht alle Subklassen diese Funktionalität besitzen, soll die generelle Implementierung
        hier eine UnsupportedOperationException werfen.
         */
    }

    public TreeNode createChildChecked(int sticksToTake){
        return null;
        /*
        Während die createChild-Methode für polymorphe Zwecke existiert, implementiert diese Methode generelle Fehlerbehandlung.
        Bei Übergabe einer nicht erlaubten Anzahl an zu entfernenden Hölzchen soll eine IllegalArgumentException geworfen werden,
        die mindestens die Worte "invalid draw" enthält. Falls die Zahl der Hölzchen nach dem Zug kleiner als 0 wäre,
        soll eine IllegalArgumentException mit mindestens den Worten "numberOfSticksLeft" und "less than 0" geworfen werden.
        Ist der Zug gültig, soll der richtige Typ TreeNode mit der restlichen Anzahl Hölzchen zurückgegeben werden.
         */
    }


    public int getNumberOfSticksLeft(){
        return 1;
        /*
        Gibt die in der durch den Knoten repräsentierten Spielstellung noch im Spiel befindlichen Hölzchen zurück
         */
    }

    public int getChildLeafValue(){
        return 1;
        /*
        Liefert die Bewertung, die ein Leaf hat, wenn dieser Knoten dessen Elternknoten ist.
        Nicht alle Subklassen überschreiben diese Methode, deswegen soll hier eine UnsupportedOperationException geworfen werden.
         */
    }
    public Collection<TreeNode> getSuccessors(){
        return null;
        //Gibt die Kindknoten dieses Knotens zurück.
    }

    public Optional<Integer> getDrawWithHighestValueSuccessor(){
        return null;
        /*Gibt den Spielzug, der zum Kindknoten mit der größten Bewertung führt, als Optional zurück oder einen leeren Optional, falls der Knoten keine Kinder besitzt.
                Falls mehrere Kindknoten die selben höchsten Bewertungen aufweisen, kann beliebig zwischen deren Zügen entschieden werden.

         */
    }

}
