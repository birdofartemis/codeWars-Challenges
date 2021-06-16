package com.company.ex;

public class Data {
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
