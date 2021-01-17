public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){}
    public MovablePoint(float x,float y){
        super(x,y);
    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr=new float[2];
        arr[0]=this.xSpeed;
        arr[1]=this.ySpeed;
        return arr;
    }
    public String toString(){
        return "("+this.xSpeed+","+this.ySpeed+")";
    }
    public MovablePoint move(){
        x +=xSpeed;
        y +=ySpeed;
        return this;
    }
}
