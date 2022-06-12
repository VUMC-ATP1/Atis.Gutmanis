package homework;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Arrays;

public class LoopHomeWork {

    public static void main(String[] args) {

        // 1) Uzrakstiet programmu, kas no lietotāja nolasa veselus skaitļus un
        // pstājas, izvadot uz ekrānu tekstu:  “Gatavs”, kad šo vērtību summa pārsniedz 100.

        /*
        Scanner scan = new Scanner(System.in);
        int skaitlis;
        int a = 0;
        while (a < 100){
            System.out.println("Ievadi skaitli: ");
            skaitlis = scan.nextInt();
            a = a + skaitlis;
        }
        System.out.println("Gatavs!");
        }
*/
/*
        // 2) Tajā pašā klasē un main metodē zemāk uzrakstīt programmu,
        // kas nolasa veselu skaitli un izvada uz ekrāna, vai šis skaitlis ir pirmskaitlis vai nē.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Skaitlis = scan.nextInt();
        if (isPrime(Skaitlis)) {
            System.out.println(Skaitlis + " is a prime number");
        } else {
            System.out.println(Skaitlis + " is not a prime number");
        }
    }

    public static boolean isPrime(int Skaitlis) {
        if (Skaitlis <= 1) {
            return false;
        }
        for (int i = 2; i <= Skaitlis/2; i++) {
            if (Skaitlis % i == 0) {
                return false;
            }
        }
        return true;
    }
}

*/
/*
        // 3) 1) Definēt trīs masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības izmantojot:
        //a.	while;
        //b.	do while;
        //c.	for loop;
        //d.	for each.

        int[] intArray = {1, 2, 4, 8, 16, 32};
        String[] stringArray = {"Lizard", "Wizard", "Gizard", "James"};
        char[] charArray = new char[]{'D', 'E', 'F', 'G', 'H', 'I'};

        //INT Arrays.
        int i = 0;
        System.out.println("While Integral:");
        while (i < intArray.length) {
            int num = intArray[i];
            System.out.println(num);
            i++;
        }
        i = 0;
        System.out.println("Do While Integral:");
        do {
            System.out.println(intArray[i] + " ");
            i++;
        } while (i < intArray.length);

        System.out.println("For Integral:");
        for (int k = 0; k < intArray.length; k++) {
            System.out.println(intArray[k]);

        }
        {
            System.out.println("For each Integral:");
            for (int r : intArray) {
                System.out.print(r + " ");
            }
        }

        System.out.println(" ");

        //STRING arrays
        {
            i = 0;
            System.out.println("While String:");
            while (i < stringArray.length) {
                System.out.print(stringArray[i] + " ");
                i++;
            }
        }
        System.out.println("");
        {
            i = 0;
            System.out.println("Do While String:");
            do {
                System.out.println(stringArray[i]);
                i++;
            }
            while (i < stringArray.length);
        }
        System.out.println("For String");
        for (int k = 0; k < stringArray.length; k++) {
            System.out.println(stringArray[k]);
        }
        {
            System.out.println("For each String:");
            for (String testinger : stringArray) {
                System.out.print(testinger + " ");
            }
        }
        //CHAR Arrays


        System.out.println("");
        {
            i = 0;
            System.out.println("While characters");
            while (i < charArray.length) {
                System.out.print(charArray[i] + " ");
                i++;
            }
            System.out.println("");
            {
                i = 0;
                System.out.println("Do While Characters:");
                do {
                    System.out.println(charArray[i]);
                    i++;
                } while (i < charArray.length);
            }

        }


        {
            System.out.println("For Character");
            for (int k = 0; k < charArray.length; k++) {
                System.out.println(charArray[k]);
            }

        }
        {
            System.out.println("For each Char:");
            for (char g : charArray) {
                System.out.print(g + " ");
            }
        }
    }
}

*/
        /*
        // 4) Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem.
        // Visas vērtības, kas ir iekšā masīva, ir nepieciešams izvest uz ekrāna vienā līnijā.

        {
            int number = 100;
            System.out.print("Even numbers in a 100");
            System.out.println("");
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
*/
        /*
        // 5) 1.	Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību.
        //a.	Tā ir metode, kura kā parametru pieņem veselu skaitli.
        //b.	Piemērs: Faktoriāls 4 = 4 * 3 * 2 * 1 = 24.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        int number = scan.nextInt();
                int result = 1;

                for (int factor = 2; factor <= number; factor++) {
                    result *= factor;
                }

        System.out.println(number + "! = " + result);}}
*/
        /*
        // 6) Izstrāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu.
        // Jāizveido int konstanti, kur tiks saglabāts PIN (public finalint  VARIABLE_NAME). Ja parole ir ievadīta pareizi,
        // jāizvada uz ekrāna: “PIN ir pieņemts, laipni lūdzam atpakaļ”. Ja parole nav pareiza, jāizvada uz ekrāna:  “Nepareizs PIN, mēģiniet vēlreiz.”.
        // Kad mēģinājumi beigušies, uz ekrāna jāizvada:  “Atvainojiet, bet jūs esat bloķēts”.

        final int parole = 1337;
        int passAttempts = 0;
            System.out.print("Enter Your Password: ");
            Scanner input = new Scanner(System.in);

            while (passAttempts < 3) { int inputPass = input.nextInt();
                passAttempts++;
                if (inputPass == parole) {
                    System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                    break;

                } else {
                    if (passAttempts <= 2){
                    System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
                }
                    else {
                        System.out.println(" ");
                    }

           if(passAttempts >= 3){
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
            }

        }}}}

/*
















