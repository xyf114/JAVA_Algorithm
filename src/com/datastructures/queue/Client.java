package com.datastructures.queue;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(3);//空间为2，有一个作为满判定
        char key = ' ';
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while(loop){
            System.out.println("s(show)");
            System.out.println("e(exit)");
            System.out.println("a(add)");
            System.out.println("g(get)");
            System.out.println("h(head)");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queueArray.showQueue();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.println("input number");
                    int number = scanner.nextInt();
                    queueArray.addQueue(number);
                    break;
                case 'g':
                    try {
                        int temp = queueArray.getQueue();
                        System.out.println(temp);
                    } catch (Exception e) {
                        continue;
                    }
                    break;
                case 'h':
                    queueArray.showFront();
                    break;
                default :
                    break;
            }
        }
    }
}
