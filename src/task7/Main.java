package task7;

public class Main {

    public static void main(String[] args) {

        String s1 = new String("I like");
        String s2 = new String("I like to play different sport games");
        String s3 = "The winter  is the best  Season  s  for making fun with friends!";

        int n = ((longestWordfrom(s3))).length();
        String[] s5 = s2.split(" ");
        for (String s : s5) {
            System.out.println(s);
        }

        StringBuilder one = new StringBuilder(secondWordOfString(s3));

        String convertWord = s3.replaceAll("\\s+", " ").trim();



        System.out.println(s2.substring(0, 6).equals(s1));

        System.out.println("Capitalize string looks: "+ upperCaseWords(s3));
        System.out.println("Longest word in sentenses: "+ longestWordfrom(s3));
        System.out.println("Longest word in sentense has "+ n + " character");
        System.out.println("Second word of sentense is: "+ secondWordOfString(s3));
        System.out.println("Second word sentense in reverse order: "+ one.reverse());
        System.out.println("Sentense with converted spases is: " + convertWord);
    }

    public static String upperCaseWords(String sa) {
        String words[] = sa.replaceAll("\\s+", " ").trim().split(" ");
        String newSentence = "";
        for (String word : words) {
            for (int i = 0; i < word.length(); i++)
                newSentence = newSentence + (((i == 0 && word.length() == 1) ? word.substring(i, i + 1).toUpperCase() + " " :
                        ((i == 0) ? word.substring(i, i + 1).toUpperCase() :
                                (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toLowerCase() + " ")));
        }
        return newSentence;
    }

    public static String longestWordfrom(String sa) {
        String words[] = sa.replaceAll("\\s+", " ").trim().split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }

        return longestWord;


    }

    public static String secondWordOfString(String sa){
        String second[] = sa.replaceAll("\\s+", " ").trim().split(" ");
        String secondWord = "";
        for(int i=0;i<second.length;i++){

            secondWord=second[1];

        }

        return secondWord;
    }


}





