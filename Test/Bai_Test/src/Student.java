import java.util.Scanner;

public class Student {
    private String name;
    private  int age;
    private String tenClass;
    public Student(String name,int age,String tenClass){
        this.name = name;
        this.age=age;
        this.tenClass=tenClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String gettenClass() {
        return tenClass;
    }

    public void setTenClass(String tenclass) {
        this.tenClass = tenClass;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = sc.nextLine();
        System.out.println("nhap ten lop");
        String tenClass = sc.nextLine();
        System.out.println("nhap tuoi");
        int age = sc.nextInt();
        Student student = new Student(name, age, tenClass);
        System.out.println("thong tin hoc sinh");
        System.out.println("ten :"+student.getName());
        System.out.println("ten lop:"+student.gettenClass());
        System.out.println("lop :"+student.getAge());

    }

}
