package baseCourseOfJava.lection5strings;

public class ClassWork1 {
    public static void main(String[] args) {
        String str = "Тестовая,.?; строка,!!!!! с несколькими,. ,- запятыми123456";
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 33 && str.charAt(i) <= 47) {
                x++;
            }
            else if (str.charAt(i) >= 58 && str.charAt(i) <= 63) {
                x++;
            }
        }
        System.out.println(x);
    }
}
