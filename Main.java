import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of discs: ");
        int disc = console.nextInt();
        towerOfHanoi(disc, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int discNumber, char start, char aux, char end) {
        if (discNumber == 1)
            System.out.println(String.format("Move disc %d from %c with %c as aux going to %c", discNumber, start, aux, end));
        else {
            towerOfHanoi(discNumber - 1, start, end, aux);
            System.out.println(String.format("Move disc %d from %c with %c as aux going to %c", discNumber, start, aux, end));
            towerOfHanoi(discNumber - 1, aux, start, end);
        }
    }
}
