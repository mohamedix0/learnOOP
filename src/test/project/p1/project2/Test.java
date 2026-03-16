package test.project.p1.project2;

public class Test {
    int a;
    int b;

    Test add(Test o2) {
        Test o3 = new Test();
        o3.a = this.a + o2.a;
        o3.b = this.b + o2.b;
        return o3;
    }
}
