import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 100; // if you make a change to the object via this ref variable it will also change the same object
    }
}
