import java.util.Scanner;
class AI_ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type something (type 'bye' to end)");
        while (true) {
            System.out.print("You: ");
            String input =sc.nextLine();
            if (input.equalsIgnoreCase( "hi")) {
                System.out.println("Chatbot: Hello!");
            } else if (input.equalsIgnoreCase ( "how are you")) {
                System.out.println("Chatbot: I'm good. Thank you!");
            } else if (input.equalsIgnoreCase ("joke")) {
                System.out.println("Chatbot: Why did the computer get cold? Because it forgot to close its windows!");
            } else if (input.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else {
                System.out.println("Chatbot: I don't understand.");
            }
            sc.close();
        }
    }
}
