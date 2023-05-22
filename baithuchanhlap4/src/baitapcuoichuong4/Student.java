package baitapcuoichuong4;

import java.util.Scanner;

public class Student {
    private int diem;
    private String name;
     int max=0;
   
    void Student(){

    }
    void Student(int diem ,String name ){
        this.diem=diem;
        this.name= name;

    }
    public int getDiem(){
        return diem;
    }
    public void setDiem(int diem){
      this.diem=diem;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
        
    }
    @Override
    public String toString() {
        return "Student{" +
                "diem=" + diem +
                ", name='" + name + '\'' +
                '}';
    }
    







}