import java.util.Arrays;

/**
 * @author killian
 * @version v69.420
 */

public class Main {

    public static int linearSort(int[] tabScore, int value) {
        for (int i = 0; i < tabScore.length; i++) {
            if (tabScore[i] == value) {
                return i;

            }

        }
    return -1;
    }


    /**
     * Fonction return true si une des valeur du tableau est inférieur à 10
     * @param tabScore Tableau de tout les score
     * @return boolean true si une valeur inférieur à 10 dans le tableau
     */
    public static boolean isValueLow(int[]tabScore){
        boolean isLow = false;
        for (int i = 0; i < tabScore.length; i++) {
            if (tabScore[i] < 10) {
                isLow = true;
                break;
            }
            else{
                isLow = false;
            }
        }
        return isLow;
    }

    /**
     * Fonction return la valeur maximale du tableau
     * @param tabScore Tableau de tout les scores
     * @return int La valeur la plus élevé du tableau
     */
    public static int maxScore(int[]tabScore){

        int maxScore = 0;
        for (int i = 0; i < tabScore.length; i++){
            if (tabScore[i] > maxScore){
                maxScore = tabScore[i];
            }
        }
        return maxScore;
    }

    /**
     * Fonction Print tout les scores du tableau
     * @param tabScore
     */
    public static void printScore(int[]tabScore) {
        for (int i = 0; i < tabScore.length; i++) {
            System.out.println(i + 1 + " : " + tabScore[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int score = 0;
        int [] tabScore = new int [10000000];

        //Attribue une valeur random pour toutes les valeurs du tableau
        for (int i = 0; i < tabScore.length; i++) {
            tabScore[i] = (int) Math.ceil(Math.random() * 100000000);
        }
        Arrays.sort(tabScore);

        printScore(tabScore);

        //Calcul de la moyenne
        int somme = 0;
        for (int i =0; i < tabScore.length; i++) {
            somme += tabScore[i];
        }
        int moyenne = 0;
        moyenne = somme / tabScore.length;
        System.out.println("moyenne = " + moyenne);


        System.out.println("le plus grand score est : " + maxScore(tabScore));
        System.out.println("Valeur en dessou de 10 : " + isValueLow(tabScore));

        int valueSearch = 666;
        int valueSearchPlacement = 0;
        valueSearchPlacement = linearSort(tabScore, valueSearch) + 1;

        System.out.println("valeur recherché : " + valueSearch);

        if (linearSort(tabScore, valueSearch) == -1) {
            System.out.println("Erreur : la valeur recherché n'existe pas");
        }
        else {
            System.out.println("placement de la valeur recherché : " + valueSearchPlacement);
        }
    }
}