import java.util.Arrays;

public static void main(String[] args) {
    String str = "1563";
  //  int arr[] ={2,4,56,87,67,0};
    int[] arr = getNumFromString(str);
    System.out.println(Arrays.toString(arr));
   getSecondLargeValue(arr);
   int a=5;
   fibinocci(a);
}

private static void fibinocci(int a) {
    int first =0;
    int second=1;
    for(int i=1;i<=a;i++){
        System.out.println(first+" ");
        int next =first+second;
        first=second;
        second=next;
    }
}

private static void getSecondLargeValue(int[] arr) {
    int max1 = arr[0];
    int max2 = arr[1];
    if (max1>max2){
        max1 = arr[0];
        max2=arr[1];
    }
    else {
        max1=arr[1];
        max2=arr[0];
    }
    for(int i=2;i<arr.length;i++){
        if(arr[i]>max1){
            max2=max1;
            max1=arr[i];
        } else if (arr[i]>max2) {
            max2=arr[i];

        }
    }
    System.out.println("the second largest number is "+max2);
}

private static int[] getNumFromString(String str) {
    int[] result = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
        result[i] = str.charAt(i) - '0';
    }
    return result;
}
