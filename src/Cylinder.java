public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height=height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius()*height;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }
    public String toString(){
        return "Information of Cylinder is "
                +getHeight()
                +getColor()
                +getArea()
                +getPerimeter()
                +getVolume();
    }
}
