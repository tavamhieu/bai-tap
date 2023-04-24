package baithuchanh1804;

public class hinhhoc {

    
    public final float PI= 3.14f;
    private String ten;
    private float chuvi;

    private float dientich;
    private float thetich;
    
    public hinhhoc(){
        ten="hinh hoc";
      }
    
    public void inchuvi(){
        System.out.println("chuvi la:"+chuvi);
    }
    public void inthetich(){
        System.out.println("the tich la:"+thetich);

    }
    public void inddientich(){
        System.out.println("dien tich la:"+dientich);
    }
    public String getten(){
        return this.ten;
    }
    public void setten(String name){
        this.ten=name;
    }
    public float getchuvi(){
        return this .chuvi;
    }
    public void setchuvi(float i){
        this.chuvi= i;
    }
    // tuong tu

  
}