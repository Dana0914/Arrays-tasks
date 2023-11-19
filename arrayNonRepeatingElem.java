package arrayexercises;


public class arrayNonRepeatingElem {
    public static void main(String[] args) {
        // Вывести уникальные элементы
        char[] words = new char[]{'a', 'b', 'a', 'c', 'a', 'c', 'z', 'a', 'a'};
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(words[i]);
            }
        }
    }
}
