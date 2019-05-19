package design.pattern.factory;


enum VechileType{
    TWOWHEELER,
    THREEWHEELER,
    FOURWHEELER
}

interface Vechile{

    void getVechileType();
}

class TwoWheeler implements Vechile{
    @Override
    public void getVechileType() {
        System.out.println("2 Wheeler");
    }
}

class ThreeWheeler implements Vechile{
    @Override
    public void getVechileType() {
        System.out.println("3 Wheeler");
    }
}

class FourWheeler implements Vechile{
    @Override
    public void getVechileType() {
        System.out.println("4 Wheeler");
    }
}


public class Factory {

    public static Vechile getInstance(VechileType vechileType){

        Vechile vechile = null;
        switch (vechileType){
            case TWOWHEELER:
                vechile = new TwoWheeler();
                break;
            case THREEWHEELER:
                vechile = new ThreeWheeler();
                break;
            case FOURWHEELER:
                vechile = new FourWheeler();
                break;
        }

        return vechile;
    }
}

class Consumtion{

    public static void main(String[] args) {
        Vechile vechile = Factory.getInstance(VechileType.TWOWHEELER);
        vechile.getVechileType();
    }
}
