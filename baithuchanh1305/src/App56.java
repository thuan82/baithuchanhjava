import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("nike");
        hashSetString.add("lenovo");
        hashSetString.add("lenovo");

        System.out.println("cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("nhap phan tu can them: ");
        name = scanner.nextLine();
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu trong hashSetString sau khi them: ");
            System.out.println(hashSetString);

        } else {
            System.out.println("xoa thanh cong");
        }

    
    }
}