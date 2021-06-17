package com.company.ex;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i<4; i++) {
            list.add(i);
        }
        System.out.println("Get: " + list.get(2));
        System.out.println("IndexOf: 4: " + list.indexOf(4));
        list.printList();
        System.out.println(list.contains(3));
    }
}
