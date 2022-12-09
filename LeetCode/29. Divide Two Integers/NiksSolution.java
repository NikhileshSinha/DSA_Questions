class NiksSolution {
    public int divide(int D, int d) {
        
        //CODE START
        
        int count = 0;
        boolean sign;
        if(D == -2147483648){
            if(d==1){return D;}
            if(d==-1){return 2147483647; }
            else if(d<0){
                while(D<0){
                    D -= d;
                    count++;
                    if (D > -10) {
                        //System.out.println("D: " + D + " d: " + d + " count: " + count);
                    }
                }
                if (D != 0) {
                    count -= 1;
                } 
                return count;
            }
            else if(d>0){
                while (D < 0) {
                    D += d;
                    count++;
                    /*
                    if(D>-10){
                        System.out.println("D: " + D + " d: " + d + " count: " + count);
                    }*/
                    //System.out.println("D: "+D+" d: "+d+" count: "+count);
                    
                }
                //System.out.println("Main1: " + count);
                if(D==0){
                    count *= (-1);
                }
                else{
                    count -= 1;
                    count *= (-1);
                }
                //count -= 1;
                //System.out.println("Main2: " + count);
                //count *= (-1); 
                //System.out.println("Main: "+count);
                return count;
            }
            
        }
        //System.out.println("It's still going on");
        if (D > 0 && d > 0 || D < 0 && d < 0) {
            sign = true;
        } else {
            sign = false;
        }

        if (d < 0) {
            d *= (-1);
        }
        if (D < 0) {
            D *= (-1);
        }

        if (D < d) {
            count = 0;
        } 
        else if (D == d) {
            count = 1;
        } 
        else if (d == 1) {
            count = D;
        } 
        else if (d == -1) {
            count = D*(-1);
        }
        else {
            while (D > 0) {
                D -= d;
                count++;
                // System.out.println(count);
            }
            if(D!=0){
                count -= 1;
            }            
            
        }

        if (count != 0) {
            if (sign == false) {
                count *= (-1);
            }
        }

        return count;
        
        //CODE ENDS
    }
}
