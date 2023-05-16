package demo;


public class Student {
    public Srting fullname;
    public int old;
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("nhap ten:");
        fullname = sc.nextLine();

        System.out.println(" nhap tuoi");
        old = sc.nextInt();

        }
        public void HienThi(List<Students> stdList) {
            for (int i = 0; i < stdList.size(); i++) {
                System.out.println(stdList.get(i).FullName);
                System.out.println(stdList.get(i).old);
            }
        }
        public void SuaThongTin(List<Students> stdList) {
            System.out.println("Nhap stt muon chinh sua");
            int stt = sc.nextInt();
            Students std = new Students();
            for (int i = 0; i < stdList.size(); i++) {
                if (i + 1 == stt) {
                    std.NhapThongTin();
                    stdList.set(i, std);
                    std.HienThi(stdList);
                }
            }
        }
        public void XoaThongTin(List<Students> stdList) {
            System.out.println("Nhap stt muon chinh xoa");
            int stt = sc.nextInt();
            if()
           
        }




        public void themthongtin(ArrayList<Student> stdlist,){
            For(int i=0 ; i<10; i ++){
            Student std= new Student()
            std.nhapthongtin();
            stdlist.add(std);




   
        

       
    }
}
}
    

