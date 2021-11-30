package InClass.Overloading.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        doSomething("hi");

        var result = doSomething("hi", 10, 20, 30);
        System.out.println(result);

        var person1 = new Person("Jane", "Fonda");
        var person2 = new Person("Jane", "M" ,"Fonda");
        var person3 = new Person("Jane", "Fonda", "M", "09/09/2020", 20);
        person1.getClass();

        String[] strings = new String[3];
        strings = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    }

    public static String doSomething(String message) {
        return message;
    }

    public static String doSomething(String message, int... ints) {
        for (int i = 0; i < ints.length; i++) {
            message = message + ints[i];
        }
        
        return message;
    }

}
