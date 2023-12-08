
public class Espacios {

    public static void main(String[] args) {
        String palabra = "Juan Maria Pedro Luis";
        int p = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (String.valueOf(palabra.charAt(i)).equals(" ")) {
                p++;
            }
        }

        System.out.println("Hay " + p + " Espacios");
    }
}
