package baithuchanh1804;

import java.util.Scanner;



public class hinhtron  {
  private String ten;
  private float chuvi,dientich;
  private final Float PI= 3.14f;
  private  float r;

  public  hinhtron(){
    ten="hinh tron";
   
  }

  public void nhapbankinhvatenhinh(){
    Scanner sc = new Scanner( System.in);
    
    System.out.println("ban kinh la");
    r=sc.nextFloat();
    sc.close();


  }
  public void tinhchuvi(){
    chuvi=2*PI*r;

  }
  public void tinhdientich(){
    dientich= PI*r*r;
  }
  public float getchuvi(){
    return this.chuvi=chuvi;
  }
  public void setchhuvi(float c){
    this.chuvi=c;
  }
  //tuong tu

    
}