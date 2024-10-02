import java.util.*;

public class task1 {
    
    static void processStringBeforePermutation(String input) {
        ArrayList<String> sList = new ArrayList<>();

        // Populate sList with individual characters of the input string
        for (int i = 0; i < input.length(); i++) {
            sList.add(String.valueOf(input.charAt(i)));
        }

        // Sort the list of characters
        Collections.sort(sList);

        ArrayList<String> ans = new ArrayList<>();
        permutation("", sList, ans);

        // Print all unique permutations
        for (String ss : ans) {
            System.out.println(ss);
        }
    }

    static void permutation(String s, ArrayList<String> remainderStringList, ArrayList<String> ans) {
        // Base case: If the list of remaining characters is empty, add the formed permutation to the result
        if (remainderStringList.isEmpty()) {
            if (!ans.contains(s)) {
                ans.add(s);
            }
            return;
        }

        // Iterate over each character in the remainder list to generate permutations
        for (String ss : remainderStringList) {
            s += ss;
            ArrayList<String> cloneList = new ArrayList<>(remainderStringList);
            cloneList.remove(ss);
            permutation(s, cloneList, ans);
            s = s.substring(0, s.length() - 1);  // Backtrack to explore other permutations
        }
    }

    /**
     * Time Complexity: O(n * n!)
     * - There are n! permutations for a string of length n.
     * - Each time a new permutation is formed, the code spends O(n) time to append the string and manage the remainder list.
     * - Thus, the overall time complexity is O(n * n!).

     * Space Complexity: O(n * n!)
     * - The result list `ans` stores all n! permutations, each of length n.
     * - The recursion stack can go as deep as n levels (one for each character in the string).
     * - Hence, the overall space complexity is O(n * n!).
     */
}
