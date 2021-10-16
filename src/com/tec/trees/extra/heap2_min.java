package com.tec.trees.extra;

public class heap2_min {

    private int[] data;
    private int heapSize;

    public heap2_min(int size) {
        data = new int[size];
        heapSize = 0;
    }

    public boolean isEmpty() {
        return (heapSize == 0);
    }

    public int getMinimum() {
        if (isEmpty()) {
            return -1; //Error representation
        } else {
            return data[0]; //root
        }
    }


    //Return left child position
    private int getLeftChild(int i){
            return 2 * i + 1;
        }

    //Return right child position
    private int getRightChild(int i){
            return 2 * i + 2;
        }

    //Return parent position
    private int getParent ( int i){
            return (i - 1) / 2;
        }
}

