package com.example.designmode.ch18_memento.v4;

import java.util.HashMap;

public class Memento {
    //接受HashMap作为状态
    private HashMap<String,Object> stateMap;
    //接受一个对象， 建立一个备份
    public Memento(java.util.HashMap<String,Object> map){
        this.stateMap = map;
    }
    public HashMap<String,Object> getStateMap() {
        return stateMap;
    }
    public void setStateMap(HashMap<String,Object> stateMap) {
        this.stateMap = stateMap;
    }
}
