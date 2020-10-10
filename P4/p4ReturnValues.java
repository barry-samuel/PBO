public class p4ReturnValues { 
    static int myMethod(int x) {
        return 5 + x;
    }
    
    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
    
}

//Output 8 (5 + 3)
