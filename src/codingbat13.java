public class codingbat13 {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(bOk==true){
          return b<c;
          
        } else {
          return a<b && b<c;
        }
      }
}
