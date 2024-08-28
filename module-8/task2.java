/**
 * Removes adjacent duplicates in the string until no more duplicates exist.
 *
 * Time Complexity: O(n), where n is the length of the string. Each character is pushed and popped from the stack at most once.
 * Space Complexity: O(n), for storing characters in the stack.
 */
public static String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();

    // Iterate through each character in the input string.
    for (char c : s.toCharArray()) {
        // If the stack is not empty and the top of the stack is equal to the current character,
        // it means we found a pair of duplicates, so we remove the top element.
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop();
        } else {
            // Otherwise, push the current character onto the stack.
            stack.push(c);
        }
    }

    // Construct the result string from the stack.
    StringBuilder result = new StringBuilder();
    for (char c : stack) {
        result.append(c);
    }

    return result.toString();
}