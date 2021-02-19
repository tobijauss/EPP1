package de.uniwue.jpp.hoelzchenspiel;

public class MaxNode {

    public MaxNode(int numberOfSticksLeft){

        //Soll das selbe Verhalten wie der TreeNode-Konstruktor haben.
    }

    public int getChildLeafValue(){
        return 1;
        //Soll die im Algorithmus spezifizierte Bewertung für MAX-Knoten zurückgeben
    }

    public int getValue(TreeNode parent){
        return 1;
        //Soll derart abgeändert werden, dass das Maximum aller Bewertungen der Kindknoten zurückgegeben wird.
    }

    public TreeNode createChild(int numberOfSticksLeft){
        return null;
        //Soll derart abgeändert werden, dass ein MinNode mit gegebener Hölzchenzahl zurückgegeben wird.
    }
}
