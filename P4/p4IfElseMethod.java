public class p4IfElseMethod {
    
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        // If age is less than 18, print "Access denied"
        if(age < 18) {
            System.out.println("Access denied - You are not old enough!");
            
        // If age is greater than 18, print "Access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    
    public static void main(String[] args) {
            checkAge(21); // Call the checkAge method and pass along an age of 20
    }
}

//Output "Access granted - You are old enough!"
