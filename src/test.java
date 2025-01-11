public class test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        student std1 = new student("gopi",40,14,"CSE"); //constructor  is called..
        //System.out.println(std1.name); 
       /*std1.name="Sudeeksha";
        std1.id=40;
        std1.classNo = "g2";
        std1.dept="cse";
        System.out.println(std1.name); 
        System.out.println(std1.classNo);
        System.out.println(std1.dept);
        System.out.println(std1.id);*/

        System.out.println(std1.toString());
        student s2 = new student("deeksha",1001,18,"CSE");
       // s2.name="john";
        //s2.id=1001;
        //s2.dept="cse";

        //System.out.println(std1 ==s2);

       // student s3 =  std1;
       // s3.name = "Deeksha";
        System.out.println(std1.name);
        System.out.println(s2.toString());
        //System.out.println(s3.name);





    }
}
