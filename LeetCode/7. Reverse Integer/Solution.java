class Solution {
    public int reverse(int x) {
       double r=0;
        while(x!=0){
            int a=0;
            try {
                a = x % 10;
                x = x / 10;
            } catch (NumberFormatException e) {
                a = 0;
            } 
            finally{
                r = (r * 10) + a;
            }
            if(r > 2147483647 || r<-2147483647){
                r = 0;
                return 0;
            }
            //System.out.println("x: " + x+" a: "+a+" r: "+r);
        }
        return (int)r; 
    }
}
