package com.example.recyclerview;

public class ModelClass {
    private int imageview1;
    private String tv;
    private String tv1;
    private String tv2;

   ModelClass(int imageview1, String tv, String tv1, String tv2){
       this.imageview1 = imageview1;
       this.tv=tv;
       this.tv1=tv1;
       this.tv2=tv2;
   }

    public int getImageview1() {
        return imageview1;
    }

    public String getTv() {
        return tv;
    }

    public String getTv1() {
        return tv1;
    }

    public String getTv2() {
        return tv2;
    }

}
