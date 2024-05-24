public class Main {
    public static void main(String[] args)throws Exception {

        String cityName = "stauceni";
        System.out.println(cityName);
        System.out.println(cityName.toUpperCase());
        System.out.println(capitalize(cityName));
        System.out.println(scream("a", 5));

    }

    public static String capitalize (String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    public static String scream (String letter, int length) {
        StringBuilder word = new StringBuilder(); //builder design pattern
        word.append(letter.toUpperCase());
        for (int i = 1; i < length; i++) {
            word.append("-").append(letter);
        }
        return word.append("!").toString();
    }
}