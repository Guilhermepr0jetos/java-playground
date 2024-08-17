public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;

        if (mediaFinal < 6)
            System.out.println("\nReprovado\n");
        else if (mediaFinal == 6)
            System.out.print("\nProva Minerva\n");
        else
            System.out.print("\nAprovado\n");
    }
}
