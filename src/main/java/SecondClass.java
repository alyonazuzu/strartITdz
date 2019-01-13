public class SecondClass {

    // psvm = generates main method
    // sout = generates System.out.println();

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.setName("Vasia");
        System.out.println(firstClass.getName());

        FirstClass anotherFirstClass = new FirstClass();
        anotherFirstClass.setName("Mykola");
        System.out.println(anotherFirstClass.getName());

        FirstClass.staticVar = "Static Var";
        System.out.println(FirstClass.staticVar);


    }
}