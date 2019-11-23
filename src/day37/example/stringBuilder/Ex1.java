package day37.example.stringBuilder;

//        "prepend"+"initial point" + "append"
public class Ex1 {
    // Given string reverse that string
    // ex: Max => xaM
    public String reverseString(String str) {
//        String abc = "a" + "b" + "c";
//        String s1 = "a";
//        String s2 = "ab";
//        String s3 = "abc";

        StringBuilder sb = new StringBuilder();
//        ""
        sb.append(str);
//        "" + str

        StringBuilder reverse = sb.reverse();
        String result = reverse.toString();
        return result;
    }


}
