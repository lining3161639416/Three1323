public abstract class A {
    private static B b;
    public void show1(){
        System.out.println("1111111111");
    }
    abstract  public void show();
    public void show3(){
        System.out.println("33333333333");
    }
    public void t(){
        show();
        show1();
        show3();
    }
}
