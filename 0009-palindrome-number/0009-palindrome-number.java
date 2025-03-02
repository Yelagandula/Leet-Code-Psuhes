class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int lastDigit = 0;
        int temp = x;
        while(temp>0){
            lastDigit = temp%10;
            reverse = (reverse*10) + lastDigit;
            temp = temp/10;
        }
        if(x==reverse){
            return true;
        }else{
            return false;
        }

    }
}