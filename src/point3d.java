public class point3d extends point2d {
    private float z = 0.0f;
    public point3d(){
    }
    public point3d(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = {this.getX(),this.getY(),this.getZ()};
        return arr;
    }
    @Override
    public String toString(){
        float[] arr = getXYZ();
        return "x = " + arr[0] + "\n"
                + "y = " + arr[1] + "\n"
                + "z = " + arr[2];
    }

    public static void main(String[] args) {
        point3d point3d = new point3d();
        System.out.println(point3d);
        point3d = new point3d(1.1f, 2.1f, 3.1f);
        System.out.println(point3d);
    }
}
