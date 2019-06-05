package java8;

public interface DefaultMethod {

    default void print(){
        System.out.println("Default Method in DF");
    }

    static void blowHorn(){
        System.out.println("Static Method in ");
    }
}

interface DefaultMethod2{
    default void print(){
        System.out.println("Default method in DF2");
    }
}

class DefaultMethodImpl implements DefaultMethod,DefaultMethod2{
    @Override
    public void print(){
        DefaultMethod.super.print();
    }
}
