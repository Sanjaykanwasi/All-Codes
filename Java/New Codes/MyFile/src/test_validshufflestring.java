public class test_validshufflestring {
    public static void main(String[] args) {
        String sanjay = "XY";
        String diksha = "12";

        String sol = "X21Y";

        int l1 = sanjay.length();
        int l2 = diksha.length();
        int l3 = sol.length(); 
        boolean flag = true;

        if((l1+l2) == l3){
            int a = 0; 
            int b = 0; 
            int c = 0;
            

            while(c<l3){
                if(sanjay.charAt(a)==sol.charAt(c)){
                    a++;
                }
                else if(diksha.charAt(b) == sol.charAt(c)){
                    b++;
                }
                else {
                    flag =false;
                    break;
                }
                c++;
            }
            
        } else{
            flag = false;
        }

        if(flag == false){
            System.out.println("No");
        }
        else{
            System.out.println("YES");
        }
    }
}
