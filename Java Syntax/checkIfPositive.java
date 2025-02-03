//this is 2nd program for checking if the number is positive or not.

import java.util.*;

class checkIfPositive{
    public static void main(String[] args){
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            x = sc.nextInt();
            
            if(x>0){
                System.out.println("Positive");
            }
        }
    }
}