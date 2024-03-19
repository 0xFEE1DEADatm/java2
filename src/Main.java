
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        TreeFormula tree = new TreeFormula(str);
        System.out.println(tree.calculate());
    }
}