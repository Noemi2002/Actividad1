package com.tec.trees.extra;

public class mAIN2 {
    public static void main(String[] args) {


    System.out.println("The Min Heap is ");
    Min minHeap = new Min(8);
        minHeap.insert(12);
        minHeap.insert(15);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(90);
        minHeap.insert(45);
        minHeap.printTree();
        minHeap.remove();
        minHeap.printTree();
    //display root node of the min heap
    //System.out.println("The Min val(root node):" + minHeap.removeMin());
}
}
