public class day13_leetcode9 {
    public boolean isPalindrome(int x) {
        int rev =0;
        int y = x;
        while(x>0) {
            //find the last digit
            int lad = x%10; 
            // eliminate the last digit
            x =x/10;
            rev = rev *10 + lad;

        }
        if(rev==y){
            return true;
        }
        return false;
    }
}
