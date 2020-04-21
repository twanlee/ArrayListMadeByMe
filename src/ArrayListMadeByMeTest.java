public class ArrayListMadeByMeTest {
    public static void main(String[] args) {
       ArrayListMadeByMe<String> myList = new ArrayListMadeByMe<>();
       myList.add("I");
       myList.add("Love");
       myList.add("You");
       myList.add(2,"Too");

       System.out.println(myList.get(0));
       System.out.println(myList.get(1));
       System.out.println(myList.get(2));
       System.out.println(myList.get(3));
       System.out.println("=========");
        System.out.println(myList.size());
        System.out.println(myList.contains("Love"));
    }
}
