import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (list.size() != 3) {
            System.out.print("Enter string: ");
            String str = scanner.next();
            list.add(str);
        }
        System.out.println(list.toString());
        list.clear();
    }
}
