package loop;

public class frequencyOfWord {
    public static void main(String[] args) {


        String sentence = "jaVa jAva java jAVa";
        String word = "java";
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int count = 0;

/*
        while(sentence.contains(word)){
            count++;
          // sentence = sentence.replaceFirst(word,"");//clean the words that we look for to stop loop
        if (!sentence.contains(word))break;
        }

        System.out.println(count);
         */

        for (; sentence.contains(word); ) {
            count++;
            sentence = sentence.replaceFirst(word, "");//clean the words that we look for to stop loop
            if (!sentence.contains(word)) break;
        }

        System.out.println(count);
    }

}





/*
Write a program that can return the frequency of the word java from a sentence
            Ex:
                sentence = "java JAVA jAvA JAva"
            output:
                4
        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */