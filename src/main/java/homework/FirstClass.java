package homework;

public class FirstClass {
    public static void main(String[] args) {

        String country = "Djibouti";
        int population = 921804;
        float area = 37.2f;
        String capital = "Djibouti";
        String officialLanguage = "Arabic";
        boolean isMember = false;
        String result = "";
        if (isMember == false) {
            result = " NOT";
        }

        String currency = "Fdj";
        char demand = '\u1200';

        System.out.println("The topic of the conversation is going to be " + country +". It has a population of " + population + " that are all squeezed in " + area + " square kilometers. The capital is " + capital + " and people there speak " + officialLanguage + ". The symbol for their currency is " + currency + " but this test wants me to write a char, not a string, so I will just add a random symbol. I don't even know what it will be. Here we go - " + demand + ". There. Best Symbol in the world. And the country is"  + result + " a member of European Union." );

        int g = 100;
        int o = 11;

        System.out.println();
        System.out.println("This is GO!");
        System.out.println("g + o = " + (g + o));
        System.out.println("g - o = " + (g - o));
        System.out.println("g / o = " + (g / o));
        System.out.println("g * o = " + (g * o));
        System.out.println("g % o = " + (g % o));
        System.out.println("sqoare root of g = " + Math.sqrt(g));


        float s = 1.1f;
        float n = 4.4f;
        float a = 12.12f;
        float k = 13.13f;
        float e = 33.33f;
        System.out.println();
        System.out.println("No thread on snek.");
        System.out.println("s + n = " + (s + n));
        System.out.println("a - k = " + (a - k));
        System.out.println("e / s = " + (e / s));
        System.out.println("k * a = " + (k * a));
        System.out.println("e % n = " + (e % n));

        byte j = 1;
        byte i = -128;
        byte m = 127;
        System.out.println();
        System.out.println("Hello my name is Jim.");
        System.out.println("j + i + m = " + (j + i + m));
        System.out.println("j * i / m = " + (j * i / m));
        System.out.println("j - i * m = " + (j - i * m));
    }
}
