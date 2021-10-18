package com.tec.trees.extra;

public class mAIN2 {
    public static void main(String[] args) {


        //Prueba del MinHeap
    /*System.out.println("The Min Heap is ");
   /* Min minHeap = new Min(8);
        minHeap.insert(12);
        minHeap.insert(15);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(90);
        minHeap.insert(45);
        minHeap.printTree();
        minHeap.remove();
        minHeap.printTree();*/

        //Prueba del MaxHeap
        Max maxHeap = new Max(8);
        maxHeap.insert(12);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(50);
        maxHeap.insert(90);
        maxHeap.insert(45);
        maxHeap.printTree();
        maxHeap.remove();
        maxHeap.printTree();
        maxHeap.printTree();
        System.out.println("Remove");
        maxHeap.remove();
        maxHeap.printTree();

    }
}
