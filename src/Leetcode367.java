public class Leetcode367 {
    public boolean isPerfectSquare(int num) {
        if(Math.pow(num,0.5)==(double)(int)Math.pow(num,0.5))
            return true;
        return false;
    }
}
