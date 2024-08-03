import java.util.*;

class Anjana {
    public static void main(String[] args){
        // String name = "anjana";
        Scanner sc = new Scanner(System.in); 
        // String name = sc.nextLine();
        // System.out.println("name is " + name );

// if num =1 print "Kushi" else print "anjana"

// int num = sc.nextInt();
// if (num == 1){
//     System.out.println("kushi");
// }
// else {
//     System.out.println("anjana");
// }


// if num > 10 print good 
// if num = 10 print ok
// if num < 10 print bad
        int num = sc.nextInt();
        if (num > 10){
            System.out.println ("good");
        }
        else if (num == 10){
            System.out.println("ok"); 
        }
        else if (num < 10){
            System.out.println("bad");
        }
        
    }
}

