/**
 * Checks if the input string containing brackets is valid.
 * 
 * Time Complexity: O(n) - We traverse the string once, where n is the length of the string.
 * Space Complexity: O(n) - In the worst case, all characters are opening brackets and are stored in the stack.
 */
public static boolean isValid(String s) {
    // Use a stack to keep track of opening brackets.
    Stack<Character> stack = new Stack<>();
    
    // Iterate through each character in the input string.
    for (char c : s.toCharArray()) {
        // Push opening brackets onto the stack.
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } 
        // For closing brackets, check for matching opening brackets.
        else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        }
    }
    
    // If the stack is empty, all brackets are matched; otherwise, return false.
    return stack.isEmpty();
}