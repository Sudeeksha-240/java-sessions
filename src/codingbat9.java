public class codingbat9 {
    public int maxMod5(int a, int b) {
        if(a!=b){
          if(a%5==b%5){
            if(a<b){
              return a;
            } else {
              return b;
            }
          }
          if(a>b){
            return a;
          } else {
            return b;
          }
        }
        return 0;
      } 
}
