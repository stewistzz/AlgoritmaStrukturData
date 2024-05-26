package Kuis02_Dimas08;

import jobsheet12.praktikum.Node;

/**
 * Node_08
 */
public class Node_08 {
    int data08;
    Node_08 next08;
	Pembeli_08 pembeli08;

    // constructor
    public Node_08() {

    }
    // parameter
    public Node_08(int data, Node_08 next) {
        this.data08 = data;
        this.next08 = next;
    }
    public Node_08(Pembeli_08 pembeli) {
        this.pembeli08 = pembeli;
    }

}