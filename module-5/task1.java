//Total Time Complexity O(n)
//Total Space Complexiry O(n)
public static String shuffleString(String s, int[] indices){
    //creating a new character array
    //Space Complexity O(n)
    //Time Complexity O(1)
    char[] shuffledString = new char[indices.length];
    

    //Looping through the indices
    //Time Complexity O(n)
    for(int i = 0; i< indices.length; i++){
        //Given s = "abc" and indices = [1, 0, 2]
        //when i = 0, the value of indices[0] is 1
        //so the new position of 0th character of String s which is 'a' will be 1
        //that means shuffledString[1] = 'a'
        shuffledString[indices[i]] = s.charAt(i);
    }

    //Converting char[] to String
    //Time complexity O(n)
    //Space Complexity O(n)
    return String.valueOf(shuffledString);

}