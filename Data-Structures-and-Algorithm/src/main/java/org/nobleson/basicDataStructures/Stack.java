package org.nobleson.basicDataStructures;

public class Stack<E> {

    private Node<E> top;

    private int size;

    //Creating a Node
    private static class Node<E>{
        //Declaring an object of Generic data type
        private E object;

        //Declaring a Node to hold the next element
        private Node<E> next;

        //Constructor for the node
        public Node (E object){
            this.object = object;
        }
    }

    //Constructor for the Stack
    public Stack(){
        top = null;
        size = 0;

    }

    //Checking if the Stack is empty
    public boolean isEmpty(){
        return top == null;
    }

    public int getSize(){
        return size;
    }

    //Adding element to the stack
    public void push(E object){
        Node<E> newNode = new Node<>(object);
        newNode.next = top;
        top = newNode;
        size++;
    }

    //removing element from the stack
    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        E object = top.object;
        top = top.next;
        size--;
        return object;
    }

    //view the element at the top without removing it

    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is fucking empty");
        }
        return top.object;
    }
}
