public class day13 {
    // public static void display(){
    //     System.out.println("hello");
    //     display();
    // }
    // public static void main(String[] args) {
    //     dispaly();
    // }
    public static void printnum(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        printnum(num-1);
    }
    public static void main(String[] args) {
        printnum(5);
    }
}
