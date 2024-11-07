public class Palindrome {
    public static void main(String[] args) {
        String str="madad";
        int a=122;
        ispalindrome(str);
        ispalindromee(a);
    }

    private static void ispalindromee(int a) {
      int b=a;
      int reverse=0;
      while(a>0){
        int last=a%10;
        reverse=reverse*10+last;
        a=a/10;
      }
      if(b==reverse){
        System.out.println("palindrome");
      }
      System.out.println("not");
 
    }

    private static void ispalindrome(String str) {
        int left=0;
        int right=str.length()-1;
        while(right>left){
            if(str.charAt(right)!=str.charAt(left)){
                System.out.println("not palindrome");
            }
            left++;
            right--;
        }
            System.out.println("palindrome");
        
    }
    
}
