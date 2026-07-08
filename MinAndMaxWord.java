public class MinAndMaxWord {
    public static void main(String[] args) {
        String input = "came from coimbatore";
        findMinAndMaxWord(input);
    }

    private static void findMinAndMaxWord(String input) {
        String[] output = input.split(" ");
        String min = output[0];
        String max = output[0];

        for (int i = 1; i < output.length; i++) {
            if (min.length() > output[i].length()) {
                min = output[i];
            } else if (max.length() < output[i].length()) {
                max = output[i];
            }
        }
        System.out.println("min word is "+min+" and max word is "+max);
    }
}
