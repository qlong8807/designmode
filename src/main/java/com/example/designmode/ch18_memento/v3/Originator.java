package com.example.designmode.ch18_memento.v3;

public class Originator implements Cloneable {
    //备忘录状态
    private  Originator backup;
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public void createMemento() {
        this.backup = this.clone();
    }

    //恢复一个备忘录
    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    //克隆当前对象
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
