import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String[] options = { "Pierre", "Feuille", "Ciseaux" };
        Random random = new Random();
        String computerChoice;
        String userChoice;
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;

        while (isPlaying) {
            int randomNum = random.nextInt(0, 3);
            computerChoice = options[randomNum];

            System.out.println("1. Pierre, 2. Feuille, 3. Ciseaux");
            int num = scanner.nextInt();

            if (num < 1 || num > 3) {
                System.out.println("Choix invalide");
                break;
            }

            userChoice = options[num - 1];

            game(computerChoice, userChoice);

            System.out.println();
            System.out.print("Voulez-vous rejouer ? (Y/N)");
            String response = scanner.next();

            if(response.equals("N")) {
                isPlaying = false;
            }
        }

        scanner.close();

    }

    static void game(String computerChoice, String userChoice) {

        if (computerChoice.equals(userChoice)) {
            System.out.println("Choix de l'ordinateur : " + computerChoice + " = Egalité !");

        } else if ((userChoice.equals("Feuille") && computerChoice.equals("Pierre")) || 
        (userChoice.equals("Pierre") && computerChoice.equals("Ciseaux")) || 
        (userChoice.equals("Ciseaux") && computerChoice.equals("Feuille"))) {

            System.out.println("Choix de l'ordinateur : " + computerChoice + " = Gagné !");
        } else {
            System.out.println("Choix de l'ordinateur : " + computerChoice + " = Perdu !");
        }

    }
}