public abstract class AbstractTestGender {

    public void whatGender(){
        System.out.println("what is your gender?");
    }
    public abstract void rUMan();
    String man;
    String woman;
    AbstractTestGender ttt = new AbstractTestGender() {
        @Override
        public void rUMan() {
            System.out.println("abstractBody");
        }
    };
}
