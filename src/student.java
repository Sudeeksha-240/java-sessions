public class student {
    String name;
    int id;
    String classNo;
    int age;
    String dept;
    int phno;
// role of constructor is to create and initialize an object..


    public student(String name, int id,int age, String dept){
        System.out.println("In class: " +this);
        this.name = name ;
        this.age =age ;
        this.id = id;
        this.dept = dept;
    }

    public void talking(){
        System.out.println("Students are talking");
    }

    public void makingNoise(){
        System.out.println("Students are making noise");
    }

    public void coding(){
        System.out.println("Students are coding");
    }

    public String toString(){
        return this.name + " "+ this.id;
    }
    //class: it is a design or a template which tells how the objects look like.. 
}
