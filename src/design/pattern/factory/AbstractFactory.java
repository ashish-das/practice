package design.pattern.factory;


import java.util.Scanner;

interface Department {

    public void setName(String name);

    public void display();
}

class Sales implements Department{
    public String name = "";
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Sales");
        System.out.println("Name:"+name);
    }
}

class ProblemSetter implements Department{
    public String name = "";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("ProblemSetter");
        System.out.println("Name:"+name);
    }
}

class Developer implements Department{

    public String name = "";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Developer");
        System.out.println("Name:"+name);
    }
}
public class AbstractFactory {

    public Department getReference(String depName){

        switch (depName){
            case "Sales": return new Sales();
            case "ProblemSetter": return new ProblemSetter();
            case "Developer": return new Developer();
            default : return null;
        }
    }

    public String removeSpecialChar(String inp){
        return inp.replaceAll("[^1-9A-Za-z]","");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            n--;
            String dep = s.next();
            String name = s.next();

            AbstractFactory abstractFactory = new AbstractFactory();
            Department department = abstractFactory.getReference(dep);
            department.setName(name);
            department.display();
        }
    }


}
