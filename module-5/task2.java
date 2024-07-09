public static int findNeedleOccurranceIndex(String haystack, String needle){
    
    int needleLength = needle.length();
    
    int haystackLength = haystack.length();
    
    String haystackSubstring;
    

    //Given haystack = "sadbutsad", needle = "but"
    //we will make a substring of length 3(length of "but" = 3) from haystack and compare it with the needle
    //Firt substring from i=0 to i=2 which is "sad"
    //Second substring from i=1 to i=3 which is "adb"
    //and so on
    //when the substring is matched with the neddle, such as from i=3 to i=5 which "but" is matched with the needle, first index of the substring which is i=3 will be returned

    
    for(int i = 0; i+needleLength <= haystackLength; i++){
        //Space complexity O(p) *p=needleLength 
        haystackSubstring = haystack.substring(i, i+needleLength);

        //Time Complexity O(p)
        if(haystackSubstring.equals(needle)){
            return i;
        }
    }//Total Time complexity of the loop O(p*n)
    
    return -1;

    //Total time complexity O(p*n)
    //Total Space complexity O(p)
}
