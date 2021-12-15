package CustomDeque.DataStructureJavaQueue.src;

public class TestingDeque {
    static CustomDeque<Gad2Chair> deque = new CustomDeque<Gad2Chair>(3);
    public static void main(String[] args) {
        testDeque();
    }

    public static void testDeque(){ 
        Gad2Chair chair1 = new Gad2Chair("John", "Dave");
		Gad2Chair chair2 = new Gad2Chair("Samantha", "Kelly");
		Gad2Chair chair3 = new Gad2Chair("Mary", "Anna");

        deque.addToFront(chair1);
		deque.addToFront(chair2);
		deque.addToFront(chair3);

        System.out.println(deque.toString());

        System.out.println("we remove an element from the tail (Should be John, Dave)");

        var itemRemoved = deque.removeFromTail();

        System.out.println("Items removed: " + itemRemoved.listChairRiders());

        System.out.println("now we remove an element from the head (Should be Mary, Anna)");

        itemRemoved = deque.removeFromFront();

        System.out.println("Items removed: " + itemRemoved.listChairRiders());

        System.out.println("now add an element to the head, should be sam, kelly then dexter and lily");

        Gad2Chair chair4 = new Gad2Chair("Dexter", "Lily");
        deque.addToFront(chair4);

        System.out.println(deque.toString());
    }
}
