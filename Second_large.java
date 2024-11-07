public class Second_large {
    public static void main(String[] args) {
        int arr[]={3, 5, 7, 2, 8};
        secondlarge(arr);
            }
        
            private static void secondlarge(int[] arr) {
                int max1=arr[0];
                int max2=arr[1];
                if(max1>max2){
                    max1=arr[0];
                    max2=arr[1];
                }
                else{
                    max1=arr[1];
                    max2=arr[0];
                }
                for(int i=2;i<arr.length;i++){
                    if(arr[i]>max1){
                        max2=max1;
                        max1=arr[i];
                    }
                    else if(arr[i]>max2){
                        max2=arr[i];
                    }
                }
                System.out.println("second largest element id"+max2);
            }
}
