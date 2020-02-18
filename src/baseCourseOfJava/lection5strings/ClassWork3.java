package baseCourseOfJava.lection5strings;

public class ClassWork3 {
    public static void main(String[] args) {
        String str = "  Зима без, cнега! И мороза and";
        String str1 = str.trim();
        int num = 0;
        String str2 = "";
        for (int i = 1; i < str1.length(); i++) {
            if (i == str1.length() - 1 && str1.charAt(i) >= 65) {
                str2 = str2 + str1.charAt(i);
            }
            else {
                if (str1.charAt(i) >= 65 && str1.charAt(i + 1) < 65){
                    str2 = str2 + str1.charAt(i);
                }
            }

        }
        System.out.println(str2.toLowerCase());
    }
}
