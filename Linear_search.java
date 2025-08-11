import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println(search(sc.nextInt() , arr));
    }
    public static boolean search(int val ,int[] arr){
        for(int i : arr){
            if(i == val) return  true;
        }
        return false;
    }
}
