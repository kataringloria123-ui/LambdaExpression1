import java.util.Random;

class MyClass{
    int i;
    MyClass(){
        i=0;
    }
    public int impureOne(int v){
        Random r = new  Random();
        return r.nextInt(v) * v;
    }
    public int impureTwo(int v){
        i++;
        return v + i;
    }

    public int pure(int v){
        return v + 10;
    }
}

public class PureFunctionDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("impureOne(5): "+ myClass.impureOne(5));
        System.out.println("impureOne(5): " + myClass.impureOne(5));

        System.out.println("impureTwo(5): " + myClass.impureTwo(5));
        System.out.println("impureTwo(5): " + myClass.impureTwo(5));

        System.out.println("pure(5): " + myClass.pure(5));
        System.out.println("pure(5): " + myClass.pure(5));

        System.out.println("pure(myClass.impureTwo(5)): " + myClass.pure(myClass.impureTwo(5)));
        System.out.println("pure(myClass.impureTwo(5)): " + myClass.pure(myClass.impureTwo(5)));

    }
}
