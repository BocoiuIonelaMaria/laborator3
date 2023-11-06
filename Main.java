
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] a = {"java", "test", "university"};
        String[] b = {"car", "university", "plane"};
        ArrayList<String> commonElements = new ArrayList<>();
        for (String elementA : a) {
            for (String elementB : b) {
                if (elementA.equals(elementB)) {
                    commonElements.add(elementA);
                    break; // Ieșim din bucla internă după găsirea unei potriviri
                }
            }
        }
        // Afișăm elementele comune
        System.out.println("Elementele comune sunt: ");
        for (String element : commonElements) {
            System.out.println(element);

        }

    }

}
