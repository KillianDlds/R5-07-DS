public class Q6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Afficher un triangle inversé avec des "x"
        for (int i = n; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("x");  // Remplacer "*" par x"
            }
            System.out.println();
        }
    }
}