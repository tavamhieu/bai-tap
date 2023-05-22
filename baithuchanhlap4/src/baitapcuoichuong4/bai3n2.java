package baitapcuoichuong4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import javax.swing.text.AbstractDocument.BranchElement;

public class bai3n2 {
    private static ArrayList<Student> arrlist= new ArrayList<>();
    private static ArrayList<Student> dsthilai= new ArrayList<>();
    private static ArrayList<Student> dsdiemcao= new ArrayList<>();
    private static ArrayList<Student> timsvien= new ArrayList<>();
    
    
    public static void indanhsachsv(){
        for (Student a : arrlist) {
            System.out.println(a +" ");
            
        }

        
    }
    public static void danhsachsvthilai(){
        for (Student a : dsthilai) {
            System.out.println(a +" ");
            
        }

        
    }
    public static void diemcaonhat(){
        for (Student a : dsdiemcao) {
            System.out.println(a +" ");
            
        }

        
    }





    public static void timsinhvien(){
        for (Student a : timsvien) {
            System.out.println(a +" ");
            
        }

        
    }
    
    
    public static void themsinhvien(ArrayList<Student>arr){
      
        boolean kiemtraten=true;

        while(kiemtraten){
            Student Newstudent= new Student();
            Scanner sc= new Scanner(System.in);
            System.out.println("nhap ten moi");
            String name= sc.nextLine();
            if(name.isEmpty()){
               break;

            }
            Newstudent.setName(name);
            System.out.println("nhap diem moi");
            int diem=sc.nextInt();
            Newstudent.setDiem(diem);
            arr.add(Newstudent);
            
           
              

        }
    

    }


    public static void sinhvienthilai(){
        for (int  i = 0; i < arrlist.size(); i++) {
            if(arrlist.get(i).getDiem()<=5){
                dsthilai.add(arrlist.get(i));



            }
            
        }
        System.out.println("danh sachs thi lai");
    danhsachsvthilai();


    }
    public static void diemcao(){
     


       
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).getDiem() > 0) {
               int max = arrlist.get(i).getDiem();
                dsdiemcao .add(arrlist.get(i));

            }
        }
        
    
    System.out.println("danh sach diem cao nhat");
    diemcaonhat();
}






    public static void timsv(String name){
        for(int i = 0;i<arrlist.size();i++){
            if(arrlist.get(i).getName().contains(name)){
                timsvien.add(arrlist.get(i));

            }

        }
        System.out.println("ket qua tim kiem");
        timsinhvien();
    }



































    public static void main(String[] args) {
        themsinhvien(arrlist);

        indanhsachsv();
        sinhvienthilai();
        diemcao();
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        timsv(name);
       


     
        



        


    }
   


    
}

