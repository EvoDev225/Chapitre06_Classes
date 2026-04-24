import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //on crée un objet scanner de la bibliothèque Scanner pour lire les données saisies par l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int i = 0 ;
        int nombreAleatoire = (int)(Math.random() * 100) + 1  ; // on génère un nombre alétoire entier compris entre 0 et 100
        System.out.println("Saisissez un nombre :");
        int nombre = scanner.nextInt(); // on récupère la valeur saisie par l'utilisateur
        while(nombre != nombreAleatoire){
            if(nombre < nombreAleatoire){
                // si nombre est inférieur au nombre aléatoire on affiche "c'est plus" sinon "c'est moins"
                System.out.println("C'est plus !");
            }else if(nombre > nombreAleatoire){
                System.out.println("C'est moins !");
            }
            i++;
            if(i == 10){
                // si le compteur atteint 10, le joueur est déclaré perdant et la boucle s'arrête
                System.out.println("Vous avez perdu ! !");
                break;
            }
            nombre = scanner.nextInt(); // on effectue une nouvelle entrée si le nombre est différent du nombre alétoire

            if(nombre == nombreAleatoire){
                System.out.println("Vous avez gagné ! Le nombre aléatoire est bien :"+ nombreAleatoire);

            }
        }
        scanner.close(); // Permet d'arrêter la saisie
    }
}
