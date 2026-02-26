import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        int steps=0;
        BigInteger num = new BigInteger(s, 2);
        System.out.println(num);

        while(num.compareTo(BigInteger.ONE)  == 1){
            if(num.mod(BigInteger.valueOf(2)) != BigInteger.valueOf(0)){
                num = num.add(BigInteger.ONE);
                System.out.println(num);
            }else{
                num = num.divide(BigInteger.valueOf(2));
                System.out.println(num);
            }
            steps++;
        }
        return steps;
    }
}