package com.tec.trees.heap;

public class Min {

    private int[] MinHeap;
    private int Heapsize;
    private int maxSize;

    public Min(int size){
        this.maxSize = size;
        this.Heapsize = 0;
        MinHeap = new int[this.maxSize+1];
        MinHeap[0] = Integer.MIN_VALUE;

    }

    //Return if the heap is empty
    private boolean isEmpty(){
        return (Heapsize == 0);
    }

    //Return heap size
    private int size(){
        return this.Heapsize;
    }

    //Return parent position for the node we´re asking for
    private int getParent(int i) {
        return i / 2;
    }

    //Return left child position
    private int leftChild(int i){
        return (2*i);
    }

    //Return right child position
    private int rightChild(int i){
        return (2*i) + 1;
    }

    //Checks if it is a leaf
    private boolean isLeaf(int i){
        if (i >= (Heapsize / 2) && i <= Heapsize){
            return true;
        }else{
            return false;
        }
    }

    //swap nodes from their positions
    private void swapNodes(int one, int two){
        int tmp;
        tmp = MinHeap[one];
        MinHeap[one] = MinHeap[two];
        MinHeap[two] = tmp;
    }

    //Maintain the property order during inserting new numbers
    private void organize(int i)  {

        // check if the node is non-leaf and greater than its child
        if (!isLeaf(i)) {
            if (MinHeap[i] > MinHeap[leftChild(i)]
                    || MinHeap[i] > MinHeap[rightChild(i)]) {

                // swap with left child and then organize the left child
                if (MinHeap[leftChild(i)] < MinHeap[rightChild(i)]) {
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
        if (Heapsize >= maxSize){
            System.out.println("The heap is full, can't insert a new node");
        }else{
            MinHeap[++Heapsize] = NewNode;
            int currentNode = Heapsize;

            while(MinHeap[currentNode] < MinHeap[getParent(currentNode)]){
                swapNodes(currentNode, getParent(currentNode));
                currentNode = getParent(currentNode);
            }
        }
    }

    // build min heap
    public void minHeap()  {
        for (int i = (Heapsize / 2); i >= 1; i--) {
            organize(i);
        }
    }

    //Remove the root (min element)
    public void remove()  {
        int front = 1;
        int popped = MinHeap[front];
        MinHeap[front] = MinHeap[Heapsize--];
        organize(front);
    }

    public void printTreeMin()  {
        System.out.println("PARENT1" + "\t" + "LEFT1" + "\t" + "RIGHT1");
        for (int i = 1; i <= Heapsize / 2; i++) {
            System.out.print(" " + MinHeap[i] + "\t\t" + MinHeap[2 * i]
                    + "\t\t" + MinHeap[2 * i + 1]);
            System.out.println();
        }
    }




}