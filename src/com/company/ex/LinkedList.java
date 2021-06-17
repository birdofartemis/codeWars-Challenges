package com.company.ex;


public class LinkedList {
    private Data head;
    private Long size;

    public LinkedList(){
        this.size = 0L;
    }

    public void add(Integer value) {
        if( head == null ) {
            head = new Data(value);
        }
        else{
            Data aux = head;
            while( aux.getNextData() != null ){
                aux = aux.getNextData();
            }
            aux.setNextData( new Data(value) );
            size++;
        }
    }

    public void add(int index, Integer value){
        if(index> size){ throw new IndexOutOfBoundsException(); }
         if ( size >= index && index>0 ) {
             Data aux = head;
             Data newValue = new Data( value );
             for (int i = 0; i < index - 1; i++) {
                 aux = aux.getNextData();
             }
             newValue.setNextData(aux.getNextData());
             aux.setNextData(newValue);
         }
         else if ( index == 0 ) {
             if ( head != null) {
                 Data aux = head;
                 head = new Data(value);
                 head.setNextData(aux);
             }
             else{ head = new Data(value); }
        }
         else{ throw new IndexOutOfBoundsException(); }
         size++;
    }

    public Boolean contains(Integer value){
        if ( head == null ) { return false; }

            Data aux = head;
            while (aux.getNextData() != null) {
                if (aux.getData().equals(value)) { break; }
                aux = aux.getNextData();
            }
            return aux.getData().equals(value);
    }

    public Integer get(int index){
        if ( size >= index && index >= 0 && head != null ) {
            Data aux = head;
            for (int i = 0; i < index; i++) {
                aux = aux.getNextData();
            }
            return aux.getData();
        }
        else{ throw new IndexOutOfBoundsException(); }
    }

    public Integer indexOf(Integer value){
        if ( head == null ) { throw new IndexOutOfBoundsException(); }
            Data aux = head;
            for (int i = 0; i <= size; i++) {
                if ( aux.getData().equals(value) ){return i;}
                aux = aux.getNextData();
            }
            return -1;
    }

    public void printList(){
        if ( head != null ) {
            Data aux = head;
            while ( aux != null ) {
                System.out.println( aux.getData() );
                aux = aux.getNextData();
            }
        }
    }
}

class Data {
    private Integer data;
    private Data nextData;

    public Data(Integer data){
        this.data = data;
        this.nextData = null;
    }

    public Integer getData() {
        return data;
    }

    public Data getNextData() {
        return nextData;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNextData(Data nextData) {
        this.nextData = nextData;
    }
}
