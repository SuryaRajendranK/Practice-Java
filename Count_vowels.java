public class Count_vowels {
    public static void main(String[] args) {
        String str = "aieou";
        vowels(str);
    }

    private static void vowels(String str) {
        int vowel_count = 0;
        int consonent_count = 0;
         str=str.toLowerCase();
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                    {
                vowel_count++;
            } else if(Character.isLetter(ch[i])){
                consonent_count++;

            }
        }
        System.out.println("vowel count is" + vowel_count);
        System.out.println("consonent count is" + consonent_count);

    }

}
