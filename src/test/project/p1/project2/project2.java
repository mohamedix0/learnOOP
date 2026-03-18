package test.project.p1.project2;

public class project2 {

    public static void main(String [] args) {
        Test o1 = new Test();
        Test o2 = new Test();
        o1.a = 5; o2.a = 5;
        o1.b = 2; o1.b = 2;
        if (o1.equals(o2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        System.out.println("Test");
    }

}
