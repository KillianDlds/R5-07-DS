public class Q3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Mettez un nombre en parametre");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
