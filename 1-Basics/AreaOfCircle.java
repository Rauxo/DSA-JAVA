import java.util.*;

public class AreaOfCircle {

    public static void main(String args[]){
        // area of a circle is  = pi * r * r
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        float area = pi * radius * radius;

        System.out.println(area);
    }
}