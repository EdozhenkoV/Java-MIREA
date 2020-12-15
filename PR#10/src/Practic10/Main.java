package Practic10;

public class Main {

    public static void main(String[] args) {
        ConcreteFactory fabrica1 = new ConcreteFactory();
        Complex cba = fabrica1.createComplex(1,2);

        System.out.println(cba);
        ComplexAbstractFactory fabrica3 = new ConcreteFactory();

        Complex aaa = fabrica3.createComplex();
        System.out.println(aaa);

        Complex abc = fabrica3.createComplex(2,4);
        System.out.println(abc);
    }
}
