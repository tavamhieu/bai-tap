package baitapcuoichuong4;

public class student5 {
    private int msv;
    private String name;
    private String lop;
    void student(){

    }


    void student5(int msv, String name,String lop){
        this.msv=msv;
        this.name=name;
        this.lop=lop;


    }



    public int getMsv(){
        return msv;
    }
    public void setMsv(int msv){
      this.msv=msv;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
        
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop){
        this.lop=lop;
        
    }
    @Override
    public String toString() {
        return "Student{" +
                "msv=" + msv +
                "name="+name+
                ", lop='" + lop + '\'' +
                '}';
    }

    

    
}

