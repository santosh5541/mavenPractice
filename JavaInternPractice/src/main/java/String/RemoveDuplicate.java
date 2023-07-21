package String;

public class RemoveDuplicate {
    public static String duplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();

        // Iterate through each character in the string
        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;

            // Check if the character is a duplicate
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i]==arr[j]) {
                    repeated = true;
                    break;
                }
            }

            // Append the character if it is not a duplicate or if it is the last occurrence
            if (!repeated || i == str.lastIndexOf(arr[i])) {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String inputStr = "hi this is sample test";
        System.out.println(inputStr);
        String outputStr = duplicates(inputStr);
        System.out.println(outputStr);
    }
}

