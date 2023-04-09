public class TestingWhile {
    public static void main(String[] args) {
        int n = 10;
        int suma = 0;
        int i = 1;
        while (i <= n) {
            suma += i++;
        }
        System.out.println("Suma primelor " + n + " numere intregi este: " + suma);
    }
}