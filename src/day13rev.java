public class day13rev {
    public static void printnum(int num) {
        if(num==6){
            return;
        }
        System.out.println(num);
        printnum(num+1);
    }
    public static void main(String[] args) {
        printnum(1);
    }
}