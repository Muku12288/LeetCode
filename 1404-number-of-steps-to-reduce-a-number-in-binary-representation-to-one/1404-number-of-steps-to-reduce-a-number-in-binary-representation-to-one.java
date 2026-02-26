import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        int steps=0;
        BigInteger num = new BigInteger(s, 2);
    
        while(num.compareTo(BigInteger.ONE)  == 1){
            if(num.mod(BigInteger.valueOf(2)) != BigInteger.valueOf(0)){
                num = num.add(BigInteger.ONE);  
            }else{
                num = num.divide(BigInteger.valueOf(2));
            }
            steps++;
        }
        return steps;
    }
}