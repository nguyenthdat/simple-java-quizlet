package CS1102;
public class Quiz {
    public static void main(String[] args) {
        Question question = new MultipleChoiceQuestion(
                "What is a Class in Java?",
                "a blueprint which describes methods, functions, and constructors",
                "capable of receiving messages, processing information or data, and sending messages to another/a class created at runtime",
                "Java is object-oriented, thus each program is built from objects and classes.",
                "Properly written Java programs execute quickly and use little memory.",
                "Java works on internet and intranet applications alike.",
                "a");
        question.check();
        question = new MultipleChoiceQuestion(
                "What is the size of float variable?",
                "8 bit",
                "16 bit",
                "32 bit",
                "64 bit",
                "128 bit",
                "c"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "What is the default value of float variable",
                "0.0d",
                "0.0f",
                "0",
                "not defined",
                "null",
                "b"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "Which of the following stands true about default modifier of class members?",
                "By default, variables, methods and constructors can be accessed by subclass only.",
                "By default, variables, methods and constructors can be accessed by any class lying in any package.",
                "By default, variables, methods and constructors can be accessed by any class lying in the same package.",
                "None of the above.",
                "All of the above",
                "c"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "What is TreeSet Interface?",
                "It is a Set implemented when we want elements in a tree based order.",
                "It is a Set implemented when we want elements in a sorted order.",
                "It is a Set implemented when we want elements in a binary tree format.",
                "It is a Set implemented when we want elements in a hiearchical order.",
                "None of the above.",
                "b"
        );
        question.check();
        question = new TrueFalseQuestion("Objects are stored on Stack.", "False");
        question.check();
        question = new TrueFalseQuestion("Can we have multiple classes in same java file?", "True");
        question.check();
        question = new TrueFalseQuestion("Does garbage collection guarantee that a program will not run out of memory?", "False");
        question.check();
        question = new TrueFalseQuestion("Can constructor be inherited?", "False");
        question.check();
        question = new TrueFalseQuestion("Can we have multiple classes in same java file?", "True");
        question.check();
        question.showResults();
    }
}
