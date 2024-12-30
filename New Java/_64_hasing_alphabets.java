import java.util.*;

public class _64_hasing_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        // Hashing the Alphabets
        int hash[] = new int[26];
        for(int i=0; i<str.length(); i++){
            hash[str.charAt(i)-'a'] ++;
        }

        // ASCii values very imp
        
        // Queries
        System.out.print("Enter the no. of queries: ");
        int q = sc.nextInt();
        while(q>0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
            q--;
        }

    }
}
