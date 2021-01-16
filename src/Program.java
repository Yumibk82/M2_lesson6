public class Program {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3,"yellow", 8);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getColor());
//        System.out.println(cylinder.toString());
    }
}
