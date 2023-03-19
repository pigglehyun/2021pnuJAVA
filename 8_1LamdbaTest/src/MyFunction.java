interface MyFunction {
    void run();

    static MyFunction getMyFunction(String f3) {
        MyFunction f = () -> System.out.println(f3 +".run()");
        return f;
    }

    default void sayHello(){
        System.out.println("Hello");
    }
}




