public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            String output = String.format("%d : %s", i, RomanNumeralsConverter.romanFor(i));
            System.out.println(output);
        }
    }
}
