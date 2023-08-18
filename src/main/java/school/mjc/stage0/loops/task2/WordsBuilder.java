package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i=0;
        String text="";
        while (i<chars.length){
            text+=chars[i];
            i++;
        }
        System.out.print(text);
    }
}
