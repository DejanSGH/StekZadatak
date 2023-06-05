package machine;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        Program program = new Program(stack);
        Operation[] operation = { new Insertion(5), new Insertion(4), new Insertion(2),
                new Addition(), new Subtraction(1), new Insertion(4), new Maximum() };
        for(Operation operations : operation) {
            program.add(operations);
        }
        program.execute();
        System.out.println(stack);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Stack stack = new Stack(3);
//        stack.push(10);
//        System.out.println("Uklonjena vrednost je: " + stack.pop());
//        Operation[] operation = { new Insertion(5), new Insertion(-7), new Addition() };
//        for(Operation operations : operation) {
//            operations.execute(stack);
//            System.out.println(stack);
//        }
//    }
//}

