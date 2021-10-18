package com.tec.trees.extra;

public class Min {

    private int[] Heap;
    private int size;
    private int maxSize;

    public Min(int size){
        this.maxSize = size;
        this.size = 0;
        Heap = new int[maxSize];
    }

    //Return if the heap is empty
    private boolean isEmpty(){
        return (size == 0);
    }

    //Return heap size
    private int size(){
        return this.size;
    }

    //Return parent position for the node we´re asking for
    private int getParent(int i) {
        if (i > 0) { //If the parent is not the root
            return (int) Math.floor((i - 1) / 2);
        } else {
            return Integer.MIN_VALUE; //return root
        }
    }

    //Return left child poition
    private int leftChild(int i){
        return (2*i);
    }

    //Return right child poition
    private int rightChild(int i){
        return (2*i) + 1;
    }

    //Checks if it is a leaf
    private boolean isLeaf(int i){
        if (i >= (size / 2) && i <= size){
            return true;
        }else{
            return false;
        }
    }

    //swap nodes from their positions
    private void swapNodes(int one, int two){
        int tmp;
        tmp = Heap[one];
        Heap[one] = Heap[two];
        Heap[two] = tmp;
    }

    //Maintain the property order during inserting new numbers
    private void organize(int i)  {

        // check if the node is non-leaf and greater than its child
        if (!isLeaf(i)) {
            if (Heap[i] > Heap[leftChild(i)]
                    || Heap[i] > Heap[rightChild(i)]) {

                // swap with left child and then organize the left child
                if (Heap[leftChild(i)] < Heap[rightChild(i)]) {
                    swapNodes(i, leftChild(i));
                    organize(leftChild(i));
                }

                // Swap with the right child and organize the right child
                else {
                    swapNodes(i, rightChild(i));
                    organize(rightChild(i));
                }
            }
        }
    }

    //Insert
    public void insert(int NewNode){
        if (size >= maxSize){
            System.out.println("The heap is full, can't insert a new node");
        }else{
            Heap[++size] = NewNode;
            int currentNode = size;

            while(Heap[currentNode] < Heap[getParent(currentNode)]){
                swapNodes(currentNode, getParent(currentNode));
                currentNode = getParent(currentNode);
            }
        }
    }

    //Remove the root (min element)
    public void remove()  {
        int front = 1;
        int popped = Heap[front];
        Heap[front] = Heap[size--];
        organize(front);
    }

    public void printTree()  {
        System.out.println("PARENT1" + "\t" + "LEFT1" + "\t" + "RIGHT1");
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" " + Heap[i] + "\t\t" + Heap[2 * i]
                    + "\t\t" + Heap[2 * i + 1]);
            System.out.println();
        }
    }




}

