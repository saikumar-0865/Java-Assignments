package corejava;


public class point3d extends point {
    
    public static final point3d ORIGIN =new point3d();
    
    private int z;
    
    public point3d () {}
    
    public point3d (int x,int y,int z) {
        super(x,y);
        this.z=z;
        
    }
    
    
    /**
     * return -1 if the object is smaller
     * 0 if it is equal
     * 1 if it is greater
     */
    
    //**@Override
    //public int compareTo(Point3D o) {
        //if(distance() < o.distance()) {
            //return -1;
        //}
        //if(distance() == o.distance()) {
            //return 0;
        //}
        //return +1;
    //}
    //
    
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof point3d) {
            point3d p=(point3d) obj;
            return p.x ==x && p.y == y && p.z == z;
        }
        return false;
        
    }
    @Override
    public String toString() {
        //return "X ="+x + "y ="+y+ "z="+z;
        return new StringBuffer("X=").append(x).append("Y=").append(y).append("Z=").append(z).toString();
    }
    
    @Override
    public int hashCode() {
        return ("X="+x +"y="+y +"z="+z).hashCode();
    }
    
    
    
    public double distance() {
        System.out.println("distance of Point 3D");
        return Math.sqrt(x*x+y*y+z*z);
        
    }
    public double distance(int x,int y,int z) {
        int dx=this.x=x;
        int dy=this.y=y;
        int dz=this.z=z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
        
    }
    
    public double distance(point3d p) {
        return this.distance(p.x,p.y,p.z);
    }
    
    public int getZ() {
        return z;
    }



   public void setZ(int z) {
        this.z = z;
    }



   public static void main(String[] args) {
        System.out.println(new point3d());
        point p=new point3d(10,20,30);
        System.out.println(p.distance());
        point3d p1=(point3d) p;
        System.out.println(p1.getZ());
    }
}