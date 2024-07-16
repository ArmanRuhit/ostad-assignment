//for string "tenet" at first call value at index 0 and 5 will be compared
//if both are equal then in the next call value at index 1 and index 4 will be compared
//if left is greater than right we can tell that the string is pallindrome and (true) will be returned
//in any call if the values at specified indexes do not match (false) will be returned
public static boolean pallindrom(String p, int left, int right){
    if(left > right){
        return true;
    }

    if(p.charAt(left) == p.charAt(right)){
        return pallindrom(p, left+1, right-1);
    } else {
        return false;
    }
}
//Total time complexity O(n) 
//Total space complexity O(n) 
