

public class day_5_loops {
    public static void main(String[] args) {
        String c = "Classroom";
        System.out.println(c.length());

        System.out.println(c.charAt(0));

        //substring

        System.out.println(c.substring(5,9));
        System.out.println(c.substring(0));
        System.out.println(c.substring(7,7));

        System.out.println("hello".equals("Hello"));
        System.out.println(c.substring(c.length()-1));


        String str = "mallareddyuniversity";
        System.out.println(str.substring(str.length()-3,str.length()));

        String con = "hello" + 2 + 2;
        System.out.println(con);

        String add = "hii" +(2+2);
        System.out.println(add);

        //for loop

        for(int i = 1; i<=10;i++){
            System.out.println("Sudeeksha");
        }
    }
}
