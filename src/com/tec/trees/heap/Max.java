package com.tec.trees.heap;

public class Max {


    private int[] MaxHeap;
    private int size;
    private int maxSize;

    public Max(int size){
        this.maxSize = size;
        this.size = 0;
        MaxHeap = new int[maxSize + 1];
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
            return i /2;
    }

    //Return left child position
    private int leftChild(int i){
        return (2 * i + 1);
    }

    //Return right child position
    private int rightChild(int i){
        return 2 * i + 2;
    }

    //Checks if it is a leaf
    private boolean isMaxLeaf(int i){
        if (i >= (size / 2) && i <= size){
            return true;
        }else{
            return false;
        }
    }

    //swap nodes from their positions
    private void swap(int one, int two){
        int tmp;
        tmp = MaxHeap[two];
        MaxHeap[two] = MaxHeap[one];
        MaxHeap[one] = tmp;
    }

    //Maintain the property order during inserting new numbers
    private void organize(int i)  {

        // check if the node is non-leaf and greater than its child
        if (!isMaxLeaf(i)) {
            if (MaxHeap[i] > MaxHeap[leftChild(i)] || MaxHeap[i] > MaxHeap[rightChild(i)]) {

                // swap with left child and then organize the left child
                if (MaxHeap[leftChild(i)] < MaxHeap[rightChild(i)]) {
                    swap(i, leftChild(i));
                    organize(leftChild(i));
                }

                // Swap with the right child and organize the right child
                else {
                    swap(i, rightChild(i));
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
            MaxHeap[++size] = NewNode;
            int currentNode = size;

            while(MaxHeap[currentNode] > MaxHeap[getParent(currentNode)]){
                swap(currentNode, getParent(currentNode));
                currentNode = getParent(currentNode);
            }
        }
    }

    //Remove the root (min element)
    public void remove()  {
        int front = 1;
        int popped = MaxHeap[front];
        MaxHeap[front] = MaxHeap[size--];
        organize(front);
    }

    public void HeapMaxOrder()  {
        for (int pos = (size / 2); pos >= 1; pos--) {
            organize(pos);
        }
    }

    public void printTreeMax()  {
        System.out.println("PARENT1" + "\t" + "LEFT1" + "\t" + "RIGHT1");
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" " + MaxHeap[i] + "\t\t" + MaxHeap[2 * i]
                    + "\t\t" + MaxHeap[2 * i + 1]);
            System.out.println();
        }
    }
}
