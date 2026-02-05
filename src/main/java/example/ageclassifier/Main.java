package example.ageclassifier;

public class Main {
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public static String classifyAge(int age)
    {
        if (age <= 18) return "Ребенок";
        else if (age >= 60) return "Пенсионер";
        else return "Взрослый";
    }
    public static void main(String[] args) {
        int userAge = Integer.parseInt(args.length > 0 ? args[0] : "70");
        System.out.println(classifyAge(userAge));
    }
}