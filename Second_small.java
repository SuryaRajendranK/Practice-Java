public class Second_small {
    public static void main(String[] args) {
        int arr[]={300,56,43,79,7};
        secondsmall(arr);
        small(arr);
        large(arr);
        secondlarge(arr);
        //to find middle element 
        System.out.println("middile element is :"+arr[arr.length/2]);
    }
// method to find second smallest element in array
     static void secondsmall(int[] arr) {
        int min1=0;
        int min2=0;
        if(arr[0]< arr[1]){
            min1=arr[0];
            min2=arr[1];
        }
        else{
            min1=arr[1];
            min2=arr[2];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        System.out.println("second small element is:"+min2);
       
       
    }
    //method to find smallest element in array
    static void small(int arr[]){
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]<small){
             small=arr[i];
          }
        }
        System.out.println("small element is:"+small);
    }

    //method tp find largest element in array

    static void large(int arr[]){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("largest element in array is:"+large);

    }

    //method to find second largest element in array
    
    static void secondlarge(int arr[]){
      int max1=0;
      int max2=0;
      if(arr[0]>arr[1]){
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
      System.out.println("second largest element is:"+max2);
      
    }
}

