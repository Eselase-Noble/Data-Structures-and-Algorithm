package org.nobleson.basicDataStructures;


import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Author : Nobleson
 * Version: 1.0.0
 *
 */

//Implementing the QUEUE data structure which follows the FIFO pattern
public class Queue<E> {

    //Declaring an array list
    private ArrayList<E> queue;

    //Constructor for the Queue structure
    public Queue(){
        queue = new ArrayList<>();
    }

    //Checking if the Queue data structure is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //Getting the size of the data structure
    public int size(){
        return queue.size();
    }

    //Adding object or element to the tail Queue structure
    public void enqueue(E object){
        queue.add(object);
    }

    //Removing element from the front of the Queue
    public E dequeue(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return queue.remove(0);
    }

    //Viewing elememet the front of the Queue
    public E peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return queue.get(0);
    }
}
