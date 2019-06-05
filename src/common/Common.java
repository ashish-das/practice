package common;

public class Common {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2  = fix(b1);

        System.out.println(b1+" "+b2);

        int[] a= {3,5,8};
        a[1]=7;
        int[] b=a;
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        System.out.println(b[0]+" "+b[1]+" "+b[2]);

        try{
            //System.exit(0);
        }finally{
            System.out.println("Hi i am in finally block");
        }

        BollenTest bollenTest = new BollenTest();
        bollenTest.test();
    }

    private static boolean fix(boolean b1) {
        b1 = false;
        return b1;
    }
}

class BollenTest{
    public void test(){
        boolean b1=true;
        boolean b2=fix(b1);
        System.out.println(b1+" "+b2);
    }

    public boolean fix(boolean b1) {
        // TODO Auto-generated method stub
        b1=false;
        return b1;
    }
}
