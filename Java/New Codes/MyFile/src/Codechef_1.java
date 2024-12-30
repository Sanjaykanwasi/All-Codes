/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String knows = sc.nextLine();
		//int i = sc.nextInt();
        String word = sc.nextLine();
		
		//for(int j=0; j<i; j++){
		//     word = sc.nextLine();
      //  }
		    for(int x=0; x<word.length()-1; x++){
		        for(int y =0; y<knows.length()-1; y++){
		        if(knows.charAt(x)==word.charAt(y)){
		        System.out.println("Yes");
                }  else{
                    System.out.println("No");
                    return;
                }
		    } 
           
		    
		}
	
  }
}
