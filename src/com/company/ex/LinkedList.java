package com.company.ex;


public class LinkedList {
    private Data headOfList;
    private Long size;

    public LinkedList(){
        this.size = 0L;
    }

    public void add(Integer value){
        if(headOfList == null){
            headOfList = new Data(value);
        }
        else{
            Data aux = headOfList;
            while(aux.getNextData() != null){
                aux = aux.getNextData();
            }
            aux.setNextData(new Data(value));
            size++;
        }
    }

    public void add(int index, Integer value){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            Data aux = headOfList;
            headOfList = new Data(value);
            headOfList.setNextData(aux);
        }
        else if(size >= index){
            Data aux = headOfList;
            Data newValue = new Data(value);
            for(int i = 0; i<index-1; i++){
                aux = aux.getNextData();
            }
            newValue.setNextData(aux.getNextData());
            aux.setNextData(newValue);
        }
            else{
                add(value);
            }
        size++;
    }

    public Boolean contains(Integer value){
        Data aux = headOfList;
        while(aux.getNextData() != null){
            if(aux.getData().equals(value)){
                break;
            }
            aux = aux.getNextData();
        }
        return aux.getData().equals(value);
    }

    public void printList(){
        if(headOfList != null){
            Data aux = headOfList;
            while (aux != null){
                System.out.println(aux.getData());
                aux = aux.getNextData();
            }
        }
    }
}
