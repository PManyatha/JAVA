public class ClassCreator {

    // Step 2: Declare an inner class with a method that prints a message
    class MessagePrinter {
        public void printMessage() {
            System.out.println("Hello from the inner class!");
        }
    }

    // Step 3: Main method
    public static void main(String[] args) {
        // Create an instance of the outer class
        ClassCreator creator = new ClassCreator();

        // Create an instance of the inner class
        MessagePrinter printer = creator.new MessagePrinter();

        // Call the method of the inner class
        printer.printMessage();
    }
}

