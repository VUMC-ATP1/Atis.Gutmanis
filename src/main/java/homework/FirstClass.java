package homework;

public class FirstClass {
    public static void main(String[] args) {

        String Country = "Djibouti";
        int Population = 921804;
        float Area = 37.2f;
        String Capital = "Djibouti";
        String OfficialLanguage = "Arabic";
        boolean isMember = false;
        String result = "";
        if (isMember == false) {
            result = " NOT";
        }

        String Currency = "Fdj";
        char Demand = '\u1200';

        System.out.println("The topic of the conversation is going to be " + Country +". It has a population of " + Population + " that are all squeezed in " + Area + " square kilometers. The capital is " + Capital + " and people there speak " + OfficialLanguage + ". The symbol for their currency is " + Currency + " but this test wants me to write a char, not a string, so I will just add a random symbol. I don't even know what it will be. Here we go - " + Demand + ". There. Best Symbol in the world. And the country is"  + result + " a member of European Union." );

        int g = 100;
        int o = 11;
        int d = 6;
        System.out.println((g + o) * d);
    }
}
