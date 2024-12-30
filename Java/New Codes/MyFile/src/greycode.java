import java.util.*;
public class greycode {
    public static ArrayList<String> solution(ArrayList<String> ares,int n) {
        if(n==1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        
        
        ArrayList<String> pres = solution(ares, n-1);
       
        
        for(int i = 0; i<ares.size(); i++){
            String str = pres.get(i);
            ares.add("0" + str);
        }

        for(int i = ares.size()-1; i>=0; i--){
            String str = pres.get(i);
            ares.add("1" + str);
        }
        return ares;
    }
    public static void main(String[] args) {
        ArrayList<String> ares = new ArrayList<>();
        solution(ares, 3);
        System.out.println(ares);
    }
}
