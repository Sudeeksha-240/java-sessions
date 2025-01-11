public class codingbat6 {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk==true) {
          if(a<=b && b<=c) {
            return true;
          } else {
            return false;
          }
        } else {
          if(a<b && b<c){
            return true;
          }
        }
        return false;
      }
}
