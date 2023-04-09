public class TestingDoWhile {
    public static void main(String[] args) {
        int n = 10;
        int suma = 0;
        int i = 1;
        do {
            suma += i++;
        } while (i <= n);
        System.out.println("Suma primelor " + n + " numere intregi este: " + suma);
    }
}