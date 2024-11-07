//this program is reverse a string
public class Reverse_string {
    public static void main(String[] args) {
        String str="java";
        reverse(str);
    }

    private static void reverse(String str) {
        String ch[]=str.split("");
        String res[]=new String[ch.length];
        for(int i=ch.length-1,j=0;i>=0;i--){
        res[j]=ch[i];
        System.out.print(res[j]);
        }
        
        
    }

    
}
