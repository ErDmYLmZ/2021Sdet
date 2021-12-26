public class Runner extends AbstractTestGender implements Test2Interface,TestInterface,Test3Interface{
    public static void main(String[] args) {
        Runner rnr = new Runner();
        rnr.whatGender();
        rnr.rUMan();
        rnr.color();
        Test3Interface.weight();
        rnr.height();
        System.out.println(TestInterface.RED);

    }

    @Override
    public void rUMan() {
        System.out.println("Are You a Man?");

    }

    @Override
    public void color() {
        System.out.println("The color is Red");

    }
}
