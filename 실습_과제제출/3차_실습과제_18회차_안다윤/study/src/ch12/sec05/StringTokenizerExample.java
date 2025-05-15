package ch12.sec05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // split 메소드 사용하여 이름 문자열만 추출 및 출력
        String data1 = "홍길동&이수홍,박연수";
        String[] splitMedthod = data1.split("&|,");
        for (String eachName: splitMedthod) {
            System.out.print(eachName + " ");
        }

        System.out.println();


        // String Tokenizer 사용하여 이름 문자열만 추출 및 출력
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer strTokenizer = new StringTokenizer(data2, "/");
        while (strTokenizer.hasMoreTokens()) {
            String token = strTokenizer.nextToken();
            System.out.print(token + " ");
        }
    }
}
