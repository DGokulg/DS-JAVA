public class SumOfDigits {
    public static void main(String[] args) {
        int n = sumof(1234567847);
        System.out.println(n);
    }

    public static int sumof(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n%10 + sumof(n/10);
        }       
    }
}
