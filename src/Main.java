import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String sourcePath = console.nextLine();
        System.out.println();
        System.out.println("Результат после замены \\ на /:");
        String resultPath = sourcePath.replaceAll("\\\\", "/");
        System.out.println(resultPath);
    }
}