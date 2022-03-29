package com.datastructures.queue;

public class QueueArray {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;
    
    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
        this.front = 0;
        this.rear = 0;
    }

    public boolean isFull(){
        return (this.rear + 1) % this.maxSize == this.front;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public int getSize() {
        return (this.rear - this.front + this.maxSize) % this.maxSize;
    }

    public void addQueue(int number) {
        if(isFull()){
            System.out.println("队列满");
        }
        else{
            arr[rear] = number;
            this.rear = (this.rear+1) % this.maxSize;
        }
    }

    public int getQueue() {
        int temp;
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        else{
            temp = arr[this.front];
            this.front = (this.front + 1) % this.maxSize;
            return temp;
        }
    }
    
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列空");
        }else{
            for(int i = this.front; i < this.front+getSize(); i++){
                System.out.printf("arr[%d]=%d\n", i % this.maxSize, this.arr[i % this.maxSize]);
            }
        }
    }

    public void showFront() {
        if(isEmpty()){
            System.out.println("队列空");
        }else{
            System.out.println(this.arr[this.front]);
        }
    }
}
