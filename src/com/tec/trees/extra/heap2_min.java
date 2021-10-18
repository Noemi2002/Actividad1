package com.tec.trees.extra;

public class heap2_min {

    private int[] HeapArray;
    private int heapSize;


    public heap2_min(int size) {
        HeapArray = new int[size];
        heapSize = 0;
    }

    public boolean isEmpty() {
        return (heapSize == 0);
    }

    public void getMinimum() {
        if (isEmpty())
            System.out.println("Heap is empty");
        else
            System.out.println("The min value is: " + HeapArray[0]);
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


    public void insert(int value) {
        if (heapSize == HeapArray.length)
            System.out.println("Heap's underlying storage is overflow");
        else {
            heapSize++;
            HeapArray[heapSize - 1] = value;
            siftUp(heapSize - 1);
        }
    }

    private void siftUp(int i) {
        int parentIndex, tmp;
        if (i != 0) {
            parentIndex = getParent(i);
            if (HeapArray[parentIndex] > HeapArray[i]) {
                tmp = HeapArray[parentIndex];
                HeapArray[parentIndex] = HeapArray[i];
                HeapArray[i] = tmp;
                siftUp(parentIndex);
            }
        }
    }

    public void removeMin() {
        if (isEmpty())
            System.out.println("Heap is empty");
        else {
            HeapArray[0] = HeapArray[heapSize - 1];
            heapSize--;
            if (heapSize > 0)
                siftDown(0);
        }
    }

    private void siftDown(int nodeIndex) {
        int leftChildIndex, rightChildIndex, minIndex, tmp;
        leftChildIndex = getLeftChild(nodeIndex);
        rightChildIndex = getRightChild(nodeIndex);
        if (rightChildIndex >= heapSize) {
            if (leftChildIndex >= heapSize)
                return;
            else
                minIndex = leftChildIndex;
        } else {
            if (HeapArray[leftChildIndex] <= HeapArray[rightChildIndex])
                minIndex = leftChildIndex;
            else
                minIndex = rightChildIndex;
        }
        if (HeapArray[nodeIndex] > HeapArray[minIndex]) {
            tmp = HeapArray[minIndex];
            HeapArray[minIndex] = HeapArray[nodeIndex];
            HeapArray[nodeIndex] = tmp;
            siftDown(minIndex);
        }
    }

    public void display()  {
        System.out.println("PARENT " + "\t" + "LEFT" + "\t" + "RIGHT");
        for (int i = 1; i <= heapSize / 2; i++) {
            System.out.print(" " + HeapArray[i] + "\t\t" + HeapArray[2 * i]
                    + "\t\t" + HeapArray[2 * i + 1]);
            System.out.println();
        }
    }

}


