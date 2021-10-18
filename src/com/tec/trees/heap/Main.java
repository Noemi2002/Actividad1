package com.tec.trees.heap;

public class Main {

    public static void main(String[] args) {
        BinaryHeap maxHeap = new BinaryHeap(10);

        /*maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(6);
        maxHeap.insert(7);
        maxHeap.printHeap();*/

        // Min
        //construct a min heap from given data
        System.out.println("The Min Heap is ");
        Min_Heap minHeap = new Min_Heap(7);
        minHeap.insert(12);
        minHeap.insert(15);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(90);
        minHeap.insert(45);
        //minHeap.minHeap();
        //display the min heap contents
        minHeap.display2();
        //display root node of the min heap
        //System.out.println("The Min val(root node):" + minHeap.remove());
        //minHeap.display();

        //Max
        /*ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
        Max_Heap h = new Max_Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);
        System.out.println("Max-Heap array: ");
        h.printArray(array, size);
        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);*/
    }


}