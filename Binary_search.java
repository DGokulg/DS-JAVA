import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println(search(sc.nextInt() , arr));
    }

    public static int search(int val , int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high - low)/2;

            if(arr[mid] == val) return mid;

            else if(arr[mid] < val) low = mid+1;
            
            else high = mid -1;
        }
        return -1;
    }
}
