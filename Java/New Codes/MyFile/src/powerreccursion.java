public class powerreccursion {

    public static int calpow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int power_n_1 = calpow(x, n - 1);
        int power = x * power_n_1;
        return power;
        /*
         * if n is even
         * if(n %2 == 0){
         * return calpow(x, n/2) * calpow(x, n/2);
         * }
         * 
         * if n is odd
         * else {
         * return calpow(x, n/2) * calpow(x, n/2) * x ;
         * }
         */
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        int ans = calpow(x, n);

        System.out.println(ans);

    }
}
