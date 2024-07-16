/**
 * task2
 */

//2 * 3 = 2 + 2 + 2
public static int multiply(int a, int b){
    if(a == 0 || b == 0){
        return 0;
    }

    return a + multiply(a, b-1); 
}
//Total time complexity O(b) as the function is needed to be called b times
//Total Space complexity O(b) as the stack will go b times deep.