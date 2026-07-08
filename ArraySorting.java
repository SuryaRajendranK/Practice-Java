import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ArraySorting {
    public static void main(String[] args) {
        int[] i={2,8,1,4,5,7,3,5,7};
        int[] j={77,83,1,2,3,90,2,5};
        // combine both array and remove the duplicate and provide the result in sorting order
        combineAndSort(i,j);

        // reverse the string without changing the order(reverse in place)
        String input = "I coming from coimbatore";
        reverseStringWithPlace(input);

        //two sum
        int[] arr = {2,7,5,4};
        int target =9;
        twoSum(arr,target);
        //optimized approach of two sum
        twoSumOptimized(arr,target);
        int[] k={1,2,4,5};
        missingNum(k);
    }

    private static void missingNum(int[] k) {
        int n=k.length+1;
        int expected=n*(n+1)/2;
        int actual =0;
        for(int res:k){
           actual +=res;
        }
        System.out.println(expected-actual);
    }

    private static void twoSumOptimized(int[] arr, int target) {
        int[] result =new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int temp =target-arr[i];
            if(map.containsKey(temp)){
                result[0]=map.get(temp);
                result[1]=i;
                break;
            }
            map.put(arr[i],i );
        }
        System.out.println("target index in optimizes approach "+Arrays.toString(result));
    }

    private static void twoSum(int[] arr, int target) {
        int[] result =new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                    System.out.println("target is "+ Arrays.toString(result));
                    return;
                }
            }
        }
    }

    private static void reverseStringWithPlace(String input) {
        String [] text=input.split(" ");
        String[] result = new String[text.length];
        for(int i=0;i<text.length;i++){
         char[] charText=text[i].toCharArray();
         int left =0;
         int right=charText.length -1;
         while(left<right){
             char temp = charText[left];
             charText[left]=charText[right];
             charText[right]=temp;
            left++;
            right--;
         }
         result[i]=new String(charText);
        }
        System.out.println(String.join(" ",result));

    }

    private static void combineAndSort(int[] i, int[] j) {
        TreeSet<Integer> combinedArray = new TreeSet<>();
        for(Integer arr1:i){
            combinedArray.add(arr1);
        }
        for(Integer arr2:j){
            combinedArray.add(arr2);
        }
        System.out.println(combinedArray);
    }

}
