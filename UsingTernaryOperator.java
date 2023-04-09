public class UsingTernaryOperator {
    public static void main(String[] args) {
        double num = 500_000;
        String message = (num <= 0) ? "Small"
                       : (num >= 1_000_000) ? "Large"
                       : "Medium";
        System.out.println("Numarul " + num + " este " + message + ".");
    }
}