package backtrack;

public class outermostparenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOut(str));
    }
    public static String removeOut(String s){
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == ')') depth--;  // Closing bracket -> decrease depth first
            if (depth > 0) result.append(c);
            if (c == '(') depth++;  // Opening bracket -> increase depth last
        }

        return result.toString();
    }

}
