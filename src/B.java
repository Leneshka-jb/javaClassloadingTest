public class B extends A {

    private final BA myBA;

    public B() {
        myBA = new BA();
    }

    public class BA extends AA{

        public BA() {
            super(o -> test());
        }
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b);
    }
}
