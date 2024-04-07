import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String regex1 = "^(abcdefghijklmnopqrstuv5320736)$";
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input1);

        if (matcher1.matches()) {
            System.out.println("Первая строка соответствует заданной.");
        } else {
            System.out.println("Первая строка не соответствует заданной.");
        }

        String regex2 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((16|17|18|19|20)\\d\\d|9999)$";
        String input2 = in.nextLine();

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(input2);

        if (matcher2.matches()) {
            System.out.println("Формат даты соответствующий.");
        } else {
            System.out.println("Формат даты не соответствующий.");
        }
    }
}
