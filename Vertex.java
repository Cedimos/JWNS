
/**
 * Beschreiben Sie hier die Klasse Vertex.
 * 
 * @author Valentin Burger 
 * @version 0.1
 */
public class Vertex
{
    public double x;
    public double y;
    public Vertex(double xx, double yy) {
        x = xx;
        y = yy;
    }
    
    //@override
    public String toString(){
        return("x = "+x+"y = "+y);
    }
    public static void main(String[] args){
        Vertex v1 = new Vertex(17,4);
        Vertex v2 = new Vertex(42,0);
        Vertex vv = new Vertex(0,0);
        
        System.out.println("v1.x = " + v1.x);
        System.out.println("v2.y = " + v2.y);
        System.out.println("v1.y = " + v1.y);
        
        v1.y = 2 * v1.y;
        System.out.println("v1.y = " + v1.y);
        
        System.out.println(v1);
    }
}