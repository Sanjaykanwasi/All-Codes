import java.util.*;

public class _50_new_patterns {
    
    public static void pattern1(){
        for(int i=0; i<5; i++){
            System.out.println("*****");
        }
    }
    
    public static void pattern2(){
        for(int i=0; i<5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    public static void pattern3(){
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
    public static void pattern4(){
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
   
    public static void pattern5(){
        for(int i=0; i<5; i++){
            for(int j = i; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    public static void pattern6(){
        for(int i = 5; i >0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
    public static void pattern7(){
        for(int i =  0; i<5; i++){
            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }

            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }    
    }
    
    public static void pattern8(){
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<(2*5 -(2*i+1)); j++){
                System.out.print("*");  
            }

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }    
    }
    
    public static void pattern9(){
        for(int i =  0; i<5; i++){
            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }

            for(int j = 0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }    
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<(2*5 -(2*i+1)); j++){
                System.out.print("*");  
            }

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        } 
    }
    
    public static void pattern10(){
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j = i; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern11(int n){
        int start = 1;
        
        for(int i=0; i<n; i++){
            if(i%2==0) start =1;
            else start = 0;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }
    
    public static void pattern12(){
        
    }
    
    public static void pattern13(){
        
    }
    
    public static void pattern14(){
        
    }
    
    public static void pattern15(){
        
    }
    
    public static void pattern16(){
        
    }
    
    public static void pattern17(){
        
    }
    
    public static void pattern18(){
        
    }
    
    public static void pattern19(){
        
    }
    
    public static void pattern20(){
        
    }
    
    public static void pattern21(){
        
    }
    
    public static void pattern22(){
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        //  pattern1();
    //   pattern2();
   //    pattern3();
  //     pattern4();
    //   pattern5();
     //  pattern6();
     //  pattern7();
     //  pattern8();
    //   pattern9();
   //    pattern10();
       pattern11(n);
     //  pattern12(n);
     //  pattern13(n);
     //  pattern14(n);
     //  pattern15(n);
    //    pattern16(n);
    //    pattern17(n);
    //    pattern18(n);
    //    pattern19(n);
    //    pattern20(n);
    //    pattern21(n);
    //    pattern22(n);
    }
}