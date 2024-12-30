public class test_first_lastoccur {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 5, 5, 5, 67, 123, 125 };
        int num = 5;

        // Aproach 1 - by me
        /*
         * ArrayList<Integer> list = new ArrayList<>();
         * int first =0;
         * int last=0;
         * for(int i=0; i<arr.length; i++){
         * if(arr[i] == num) {
         * list.add(i);
         * }
         * }
         * 
         * if(list.size()==0){
         * first = last = -1;
         * }
         * 
         * else if(list.size()==1){
         * first = last = list.get(0);
         * }
         * else {
         * first = list.get(0);
         * last = list.get(list.size()-1);
         * }
         * System.out.println(first + " " + last);
         */

        // Aproach 2

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }
}
