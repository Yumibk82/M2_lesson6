import java.security.PublicKey;

public class Point {
    public float x;
    public float y;


    public Point(){}
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getX(){
        return this.x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getY(){
        return this.y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr=new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
