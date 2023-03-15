public class Main {
    public static void main(String[] args) {
        MovablePoint kiemtra = new MovablePoint();
        kiemtra=new MovablePoint(1,2,3,4);
        System.out.println(kiemtra);
        //chấm move xét thêm cả phương thức move trả về
        System.out.println(kiemtra.move());
    }
}