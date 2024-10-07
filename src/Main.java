public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int score = 24;
        int [] tabScore = new int [7];
        tabScore[0] = 1;
        tabScore[1] = 2;
        tabScore[2] = 3;
        tabScore[3] = 4;
        tabScore[4] = 5;
        tabScore[5] = 6;
        tabScore[6] = 7;

        for (int i = 0; i < tabScore.length; i++) {
            System.out.println(tabScore[i]);
        }
        int moyenne = 0;
        moyenne = (tabScore[0] + tabScore[1] + tabScore[2] + tabScore[3] + tabScore[4] + tabScore[5] + tabScore[6]) / tabScore.length;
        System.out.println("moyenne = " + moyenne);

    }
}