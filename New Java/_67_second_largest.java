import java.util.*;

public class _67_second_largest {
    
    public static int print2largest(List<Integer> sol){
       
        Collections.sort(sol, Collections.reverseOrder());
        int largest = sol.get(0);
        int answer = -1;

          for(int i=1; i<sol.size(); i++){
                if(sol.get(i) != largest){
                    answer = sol.get(i);
                    break;
                }
         }

         return answer; 
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        List<Integer> sol = new ArrayList<>();
        System.out.print("Enter the number of elements in list: ");
        int n = sc.nextInt();

        System.out.print("Enter the values: ");
        for(int i=0; i<n; i++){
            sol.add(sc.nextInt());
        }

        System.out.println(print2largest(sol));
    }
}
