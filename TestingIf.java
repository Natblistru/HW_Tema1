public class TestingIf {
    public static void main(String[] args) {

        char litera = 'E';
        char literaLow = Character.toLowerCase(litera);
        if(literaLow == 'a' || literaLow == 'e' || literaLow == 'i' || literaLow == 'o' || literaLow == 'u') {
            System.out.println("litera "+ litera +" este vocala");
        }
        else {
            System.out.println("litera "+ litera +" este consoana");
        }


    }
}