package com.company.ex;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i<4; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println(list.contains(4));
    }
}
