class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0){
            return 0;
        }
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        int ans=dividend/divisor;
        return ans;
    }
}