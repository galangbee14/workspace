package class_basic.man;

public class ManTest_610 {
    public static void main(String[] args) {
        Man_610 m1 = new Man_610("java",36,"ulsan");

        m1.setName("gaja");
        m1.setAge(31);
        m1.setAddr("busan");

        m1.setAge(39);

        System.out.println(m1.getName());

        System.out.println();
        m1.printMan();
    }
}
