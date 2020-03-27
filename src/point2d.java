public class point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    public point2d(){
    }
    public point2d(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {this.getX(),this.getY()};
        return arr;
    }
    @Override
    public String toString(){
        float[] arr = getXY();
        return arr[0] + "," + arr[1];
    }

    public static void main(String[] args) {
        point2d point2d = new point2d();
        System.out.println(point2d);
        point2d = new point2d(1.1f,2.1f);
        System.out.println(point2d);
    }
}
