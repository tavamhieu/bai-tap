package baithuchanh1104;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
  public float r;
  public hinhtron(){
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

    
}
