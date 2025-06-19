import java.util.*;

public class mergesort {
public static void conquer(int arr[], int start, int middle, int end){
    int indx1 = start;
    int indx2 = middle +1;
    int x = 0;
    int size = end -start +1; 
    int mergedarr[] = new int[size];

    while(indx1<= middle && indx2 <= end){
        if(arr[indx1] <= arr[indx2]){
            mergedarr[x++] = arr[indx1++];
        }
        else{
            mergedarr[x++] = arr[indx2++];
        }
    }

    while(indx1<=middle){
        mergedarr[x++] = arr[indx1++];
    }

    while(indx2<=end){
        mergedarr[x++] = arr[indx2++];
    }

    for(int i = 0, j = start; i<mergedarr.length; j++, i++){
        arr[j] = mergedarr[i];
    }
}
public static void divide(int arr[], int start, int end){
    
    if(start>=end){
        return;
    }
    
    int middle = (start+end)/2;
    divide(arr, start, middle);
    divide(arr, middle + 1, end);
    conquer(arr, start, middle, end);
}


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :=");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements of Array :=");
        for(int i = 0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

    //    System.out.println("Unsorted Array");
     //   for(int i = 0; i<arr.length; i++){
     //       System.out.print(arr[i] + " ");
     //       System.out.println();
     //  }

     System.out.println("Sorted Array :=");
       divide(arr, 0, arr.length-1);
       for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + " "); 
    }
    }
}
