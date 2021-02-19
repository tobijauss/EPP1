package de.uniwue.jpp.hoelzchenspiel;

public class Leaf {

    public Leaf(){
        //Soll numberOfSticksLeft des Super-Konstruktors auf 0 setzen, da Blätter nur den Spielstand repräsentieren, bei dem kein Hölzchen übrig ist.
    }
    public int getValue(TreeNode parent){
        return 1;
        //Soll so überschrieben werden, dass die nach dem Algorithmus korrekte Bewertung in Abhängigkeit des Elternknotens zurürckgegeben wird.
    }
}
