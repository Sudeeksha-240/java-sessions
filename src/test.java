public class test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        student std1 = new student();
        System.out.println(std1.name);
        std1.name="Sudeeksha";
        std1.id=40;
        std1.classNo = "g2";
        std1.dept="cse";
        System.out.println(std1.name); 
        System.out.println(std1.classNo);
        System.out.println(std1.dept);
        System.out.println(std1.id);
    }
}
