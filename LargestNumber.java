package DSA.Arraya;



class solution{

    public static int FindLargestElement(int []arr ,int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
public class LargestNumber {
    public static void main(String[] args) {
        int []arr1={2,4,3,8,6};
        int n=arr1.length;
        int max=solution.FindLargestElement(arr1,n);
        System.out.println("largestElement  :"+max);


    }

}
