public class codingbat5 {
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode == true){
          return n<=1 || n>=10;
        } else {
          return n>=1 && n<=10;
        }
    }
    
}
