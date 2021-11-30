package InClass.Overloading.src;

public class Person {
    private String fn;
    private String mn;
    private String ln;
    private String dob;
    private int age;

    public Person(String[] fullName, String dob, int age) {
        
        this.dob = dob;
        this.age = age;
    }
    
    public Person(String fn, String mn, String ln, String dob, int age) {
        this.fn = fn;
        this.mn = mn;
        this.ln = ln;
        this.dob = dob;
        this.age = age;
    }

    public Person(String fn, String mn, String ln) {
        this.fn = fn;
        this.mn = mn;
        this.ln = ln;
        new Person(fn, mn, ln, "", -1);
    }

    public Person(String fn, String mn) {
        this.fn = fn;
        this.mn = mn;
        new Person(fn, mn, "");
    }

    
}
