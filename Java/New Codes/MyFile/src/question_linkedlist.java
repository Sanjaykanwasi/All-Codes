import java.util.LinkedList;
public class question_linkedlist {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(1);
       System.out.println(list);
       int size = list.size();
       int arr[] = new int[size];

       for(int i = 0; i<arr.length; i++){
            arr[i] = list.get(i);
       }

       boolean ans = false;
       
       for(int j = arr.length-1; j >=0 ; j--){
            for(int i = 0; i<arr.length; i++){
                if(arr[j]==arr[i]){
                    ans = true;
                }
                else {
                    ans = false;
                }
            }
       }
       System.out.println(ans);
    }
}
