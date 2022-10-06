package corejava;

import java.io.Serializable;


public class point implements Comparable<point>,Serializable{
    
    public static final point ORIGIN = new point(0,0);
    
    public int x;
    public int y;



   public point() {
        super();
    }
    
    
    public point(int x,int y) {
        this.x=x;
        this.y=y;
    }
    
    
    /**
     * return -1 if the object is smaller
     * 0 if it is equal
     * 1 if it is greater
     */
    @Override
    public int compareTo(point o) {
        if(distance() < o.distance()) {
            return -1;
        }
        if(distance() == o.distance()) {
            return 0;
        }
        return +1;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof point) {
            point p=(point) obj;
            return p.x ==x && p.y == y;
        }
        return false;
    }
    
    
    public int hashCode() {
        return ("X="+x +"y="+y).hashCode();
    }
    
    @Override
    public String toString() {
        //return "X ="+x + "y ="+y;
        return new StringBuffer("X=").append(x).append("Y=").append(y).toString();
    }
    
    
    
    
    public double distance() {
        return Math.sqrt(x*x+y*y);
    }
    
    public double distance(int x,int y) {
        int dx=this.x=x;
        int dy=this.y=y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public double distance(point p) {
        return this.distance(p.x,p.y);
    }
    
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }



   
    public static void main(String[] args) {
        point p=new point(2,3);
        System.out.println("x="+p.getX()+"y="+p.getY());
        System.out.println(p.distance());
        System.out.println(p.distance(10,20));
        System.out.println(p.distance(new point(4,5)));
    }





   




    
}
