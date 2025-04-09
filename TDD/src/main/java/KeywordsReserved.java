import java.util.Arrays;
import java.util.List;

public class KeywordsReserved {
    // Java keywords reserved
    private static final List<String> JAVA_KEYWORDS = Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch",
            "char", "class", "const", "continue", "default", "do", "double",
            "else", "enum", "extends", "final", "finally", "float", "for",
            "goto", "if", "implements", "import", "instanceof", "int", "interface",
            "long", "native", "new", "null", "package", "private", "protected",
            "public", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "try", "void",
            "volatile", "while"
    );


    public static boolean reservedWord(String sentence){
        return JAVA_KEYWORDS.contains(sentence);
    }


    public static void main(String[] args) {
        System.out.println(reservedWord("break"));
    }


}
