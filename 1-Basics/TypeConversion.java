public class TypeConversion {

    public static void main(String args[]){
        // int a = 25;
        // long b = a;
        // System.out.println(b);

        //type casting (forcefully change the type)
        float c = 25.99f;
        int d = (int)c; // lossy conversion
        System.out.println(d);
    }
}

// coversion  can done in :- byte -> short -> int -> float -> long -> double