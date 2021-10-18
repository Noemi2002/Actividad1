package com.tec.trees.heap;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Prueba HeapTreeMax
        HeapTreeMax MaxHeap = new HeapTreeMax(10);
        System.out.println("HeapTreeMax:");
        MaxHeap.insert(4);
        MaxHeap.insert(1);
        MaxHeap.insert(9);
        MaxHeap.insert(2);
        MaxHeap.insert(6);
        MaxHeap.insert(11);
        MaxHeap.insert(3);
        MaxHeap.printHeap();


        //Prueba del Min
        System.out.println("Min: ");
        Min minHeap = new Min(7);
        minHeap.insert(4);
        minHeap.insert(1);
        minHeap.insert(9);
        minHeap.insert(2);
        minHeap.insert(6);
        minHeap.insert(11);
        minHeap.insert(3);
        minHeap.printTreeMin();
        //Remove
        System.out.println("Removing root or smallest number:");
        minHeap.remove();
        minHeap.printTreeMin();


        //Array_MaxHeap
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
        System.out.println("Array_MaxHeap:");
        Array_MaxHeap h = new Array_MaxHeap();
        h.insert(array, 4);
        h.insert(array, 1);
        h.insert(array, 9);
        h.insert(array, 2);
        h.insert(array, 6);
        h.insert(array, 11);
        h.insert(array, 3);
        h.printArray(array, size);
        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);


        //Prueba del Max
        System.out.println("Max: ");
        Max HeapMx = new Max(7);
        HeapMx.insert(4);
        HeapMx.insert(1);
        HeapMx.insert(9);
        HeapMx.insert(2);
        HeapMx.insert(6);
        HeapMx.insert(11);
        HeapMx.insert(3);
        HeapMx.printTreeMax();
        //Remove
        System.out.println("Removing root or biggest number:");
        HeapMx.remove();
        HeapMx.printTreeMax();
    }



}
