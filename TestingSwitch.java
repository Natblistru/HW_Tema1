public class TestingSwitch {
    public static void main(String[] args) {

        char litera = 'E';
        switch(Character.toLowerCase(litera)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("litera "+ litera +" este vocala");
                break;
            default:
                System.out.println("litera "+ litera +" este consoana");
                break;
        }
    }
}