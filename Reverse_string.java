import java.util.*;


//this program is reverse a string
public class Reverse_string {
    public static void main(String[] args) {
        String str="programming";
        reverse(str);
        int num= -1234;
        reversenumber(num);
        //find the first non repitated word in the second
        repetativeWord(str);
        //find the first non repitative word with index
       int res= repetativeWordWithIndex(str);
        System.out.println("index of non repetative word is "+res);
        removeDuplicate(str);
    }

    private static void removeDuplicate(String str) {
        char [] ch=str.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char res:ch){
            set.add(res);
        }
        System.out.println("final string after removing deplicate "+ set);
    }

    private static int repetativeWordWithIndex(String str) {
        LinkedHashMap<Character,Integer> input=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            input.put(ch, input.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(input.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    private static void repetativeWord(String str) {
        LinkedHashMap <Character,Integer> temp =new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            temp.put(ch,temp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> map:temp.entrySet()){
            if(map.getValue() == 1){
                System.out.println("First non repitative value is "+map.getKey());
                break;
            }
        }
        System.out.println("there is no unique char in the given string");
    }

    private static void reverse(String str) {
        String ch[]=str.split("");
        String res[]=new String[ch.length];
        for(int i=ch.length-1,j=0;i>=0;i--){
        res[j]=ch[i];
        System.out.print(res[j]);
        }
    }

    private static void reverseWithTwoPointer(String str) {
        char[] ch =str.toCharArray();
        int left=0;
        int right =ch.length-1;
        while (left<right){
            char temp =ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println("reverse with two pointer "+new String(ch));
    }



    private static void reversenumber(int num){
        int rev = 0;
       while (num > 0){
           int digit = num % 10;
           rev=rev*10 +digit;
           num = num / 10;

       }
        System.out.println(rev);
    }



    
}
