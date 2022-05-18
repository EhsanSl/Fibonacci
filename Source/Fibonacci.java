import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    //variables declearations
    private ArrayList<Integer> fibList = new ArrayList<Integer>() ; 
    private int fib = 0 ;  
    
    
    //methods 
    public void fibSeqCreator(int i){
        int fib0 = 0 ; 
        int fib1 = 1 ; 
        int nextFib ; 
        
        if ( i < 1){
            System.out.println("#There is no fibonacci sequence with "+ i + " integers in it!");
        }
        else { 
            fibList.add((Integer)fib0) ; // adding the first element of sequence 
        
            for ( int j = 1 ; j < i ; j++ ){
                if( j == 1){
                    fibList.add((Integer)fib1) ; //adding 1  to the sequence if i>=2
                }

                nextFib = fib0 + fib1 ; 
                fib0 = fib1 ; 
                fib1 = nextFib ; 

                fibList.add((Integer)nextFib) ;
            }
        }
        System.out.println("_________________");
        System.out.println("The Fibonacci sequence with "+i+" elements: ");

        for ( int  k = 0 ; k < fibList.size() - 1 ; k++){
            System.out.print(fibList.get(k)+" ") ; 
        }
        System.out.println("");

    }



    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci() ;
        Scanner sc = new Scanner(System.in) ;
        int input ;


        System.out.println("Welcome to Fibonacci sequence generator");
        System.out.println("Enter an integer number: ");

        if ( sc.hasNextInt() ){
            input = sc.nextInt() ; 
            fib.fibSeqCreator(input) ; 
        }
        
        else { 
            System.out.println("Wrong input my friend");
        }

        System.out.println("_________________");
        System.out.println("Enter the index at which you want to know its corresponding fibonacci number");
        if ( sc.hasNextInt() ){
            
            input = sc.nextInt() ; 
            if(input >= 0 && input < fib.fibList.size()){ // this condition makes sure that the input is in the range
                
                System.out.println("Fibonacci number stored at index "+ input + " : "+ fib.fibList.get(input)) ; 

            }
            else { 
                System.out.println("Integer was not in range");//invalid input prompt messege
            }
        
        }
        else { 
            System.out.println("input was not an Integer"); //invalid input prompt messege
        }
        System.out.println("_________________");


        sc.close() ; 
    }


}
