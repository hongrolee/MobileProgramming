package com.example.myfisrtapplication;

public class Car {

    private String modelName;
    private String color;
    private String mf;
    private String mfDate;

    //private int type; //0~3 0:승용차, 1:버스, 2:SUV, 3:트럭
    //static int makeCnt = 0;

    public Car() {
    }

    public Car(String mn, String c, String mf, int t) {
        this.modelName = mn;
        this.color = c;
        this.mf = mf;
    }

    public void setModelName(String m) {
        modelName = m;
    }

    public int sum(int x, int y) {
        int sum = x+y;
        return sum;
    }

    public float sum(float x, float y) {
        float sum = x+y;
        return sum;
    }

    public void setModelName() {
        modelName = "포르쉐";
    }

    /*
    public void setType(int t) {
        if(t<0 || t>3)
            System.out.println("값이 잘못 입력되었습니다.");
        else
            type = t;
    }*/

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMf() {
        return mf;
    }

    public void setMf(String mf) {
        this.mf = mf;
    }

    /*
    public int getType() {
        return type;
    }

    public void initType() { //무조건 승용차로 만들기
        type = 0;
    }
    */
}
