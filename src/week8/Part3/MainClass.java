package week8.Part3;

public class MainClass {
    public static void main(String[] args) {
//        SimpleArrayList myArray = new SimpleArrayList();
//        myArray.add(12);
//        myArray.add(99);
//        System.out.println("List size: " + myArray.size());
//        System.out.println("Element with first index: " + myArray.get(1));

        SimpleLinkedList myList = new SimpleLinkedList();
        myList.addAtHead(12);
        myList.addAtHead(50);
        myList.addAtTail(99);

        System.out.println(myList.get(1));
    }
}
