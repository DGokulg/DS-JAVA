import java.util.LinkedList;
import java.util.List;
public class ConsecutivePrime {
    static List<Integer> primes = new LinkedList<>();
    public static void main(String[] args) {
        // prime();
        // int[] arr = {14,5,7,23,17};
        // List<Integer> l = new LinkedList<>();
        // for(int i : arr){
        //     if(isPrime(i)){
        //         l.add(i);
        //     }
        // }
        
        // System.out.println(l);
        // List<Integer> p =  new LinkedList<>();
        // for(int i : l){
        //     if(isConsecutive(i)){
        //         p.add(i);
        //     }
        // }

        // System.out.println(p);
        String s = "ho0y";
        StringBuilder a = new StringBuilder(s.substring(0,3));
                String m = a.toString();
                String n = a.reverse().toString();
                System.out.println(n + " "+m);
    }

    public static void prime(){
        
        primes.add(2);
        for(int i=3;i<1000;i++){
            int flag = 0;
            for(int j=3;j<1000;j++){
                if(i%j == 0) flag++;
            }
            if(flag == 1 && i!=4){
                primes.add(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 0) return false;
        if(n==1 || n==2) return true;
        for(int i=3;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 

    public static boolean isConsecutive(int n){
        int sum = 0;
        for(int i :primes){
            sum = sum + i;
            if(sum == n){
                return true;
            }
            if(sum>n){
                return false;
            }           
        }
        return false;
    }
}