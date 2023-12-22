/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
 	public static void main(String[] args) {
		//user input
       	 	int a = Integer.parseInt(args[0]);
        	int b = Integer.parseInt(args[1]);
        	int c = Integer.parseInt(args[2]);
		//boolean 
       		boolean triangle = true;
        if ((a + b) < c || (a + c) < b || (b + c) < a){
		//will print false
            System.out.println(!triangle);
        }else{
		//will print true
            System.out.println(triangle);
        }

    }
	
}
