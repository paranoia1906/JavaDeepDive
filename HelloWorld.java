public class HelloWorld {
    public static void main(String args[]) {

        System.out.println("Hello World!");
    }
}

public class PrintFavoriteNumber {
    public static void main(String args[]) {

        double favoriteNumber = 28.8;
        System.out.println("My favorite number is " + favoriteNumber);
    }
}

public class BooleanExampleClass {
    public static void main(String args[]) {

        boolean amIMale = true;
        boolean amISleepy = true;
        String finalString = "";
        if (amIMale == true && amISleepy == true) {
            finalString = "I am one sleepy man!";
        } else {
            finalString = "I am a man... But I am not sleepy!";
        }
        System.out.println(finalString);
    }
}

public class WorkingWithStrings {
    public static void main(String args[]) {

        String myString = "asdawdawdaw2123123";
        System.out.println(myString.length());
    }
}

public class CombineMyAgeCharacterLength {
    public static void main(String args[]) {

        String first = "Anthony";
        String last = "Ledesma";

        int val = first.length() + last.length();

        System.out.println("Your name is " + first + " " + last + ".");
        System.out.println("Your first name is " + first.length() + " characters long.");
        System.out.println("Your last name is " + last.length() + " characters long.");

        System.out.println("That means that your total name length would be " + val + " characters long.");

    }
}

import java.util.*;

public class ListClass {
    public static void main(String args[]) {

        List list = new ArrayList();
        list.add("United States");
        list.add("Great Britain");
        list.add("Canada");
        System.out.println(list.toString());

        list.remove(1);
        list.add("Germany");

        System.out.println(list.toString());

    }
}

import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {

      HashMap map = new HashMap();
      
      map.put("Father", "Anthony");
      map.put("Mother", "Kristina");
      System.out.println(map.get("Father"));
      System.out.println(map.toString());
      
      map.remove("Father");
      
      System.out.println(map.toString());
    }
}

// this function will generate random numbers between 1-100 and uses if logic to
// display a string explaining the comparison.
// edited to use int[] array instead of an arrayList;
import java.util.*;

public class IfStatementsExamaple {
    public static void main(String args[]) {

        // List<Integer> list = new ArrayList();
        Random rando = new Random();

        // list.add(rando.nextInt(100) + 1);
        // list.add(rando.nextInt(100) + 1);

        // if (list.get(0) > list.get(1)) {
        // System.out.println("Array element 0 is higher : " + list.get(0) + " > " +
        // list.get(1));
        // } else if (list.get(0) == list.get(1)) {
        // System.out.println("The numbers are the same : " + list.get(0) + " == " +
        // list.get(1));
        // } else {
        // System.out.println("Array element 1 is higher : " + list.get(1) + " > " +
        // list.get(0));
        // }

        if (list.get(0) > list.get(1)) {
            System.out.println("Array element 0 is higher : " + list.get(0) + " > " + list.get(1));
        } else if (list.get(0) == list.get(1)) {
            System.out.println("The numbers are the same : " + list.get(0) + " == " + list.get(1));
        } else {
            System.out.println("Array element 1 is higher : " + list.get(1) + " > " + list.get(0));
        }
    }
}


public class loopsExamples {
    public static void main(String args[]) {
        
       System.out.println("Y is : " + 0);
        for (int y = 0; y <=100; y++){
            if (isTriangular(y)) {
                System.out.println("Y is : " + y);
            }
            
        }
        
     
        
    }
    
            // Returns true if 'num' is  
            // triangular, else false 
    static boolean isTriangular(int num) 
    { 
        // Base case 
        if (num < 0) 
            return false; 
      
        // A Triangular number must be 
        // sum of first n natural numbers 
        int sum = 0; 
          
        for (int n = 1; sum <= num; n++) 
        { 
            sum = sum + n; 
            if (sum == num) 
                return true; 
        } 
      
        return false; 
    }
}



