package homework.classHomework;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        trīsstūris task1 = new trīsstūris();
        System.out.print("Length of first side: ");
        task1.side1 = scan.nextInt();
        System.out.print("Length of second side: ");
        task1.side2 = scan.nextInt();
        System.out.print("Length of third side: ");
        task1.side3 = scan.nextInt();

        trīsstūris task2 = new trīsstūris(task1.side1, task1.side2, task1.side3);

        System.out.println("Area is " + task2.area);

        if(task1.allSidesEqual()){
            System.out.println("Visas malas vienādas!");
        }
        else {
            System.out.println("Malas nav vienādas.");
        }
        if(task1.twoSidesEqual()){
            System.out.println("Divas malas vienādas!");
        }
        else{
            System.out.println("Nav vienādu malu!");
        }
        System.out.println("Laukums ir: ");




        System.out.print("Length of first side: ");
    int side21 = scan.nextInt();
        System.out.print("Length of second side: ");
    int side22 = scan.nextInt();
        System.out.print("Length of third side: ");
    int side23 = scan.nextInt();
    trīsstūris task3 = new trīsstūris(side21, side22, side23);

        trīsstūris task4 = new trīsstūris(task3.side1, task3.side2, task3.side3);

        System.out.println("Area is " + task4.area);

        if(task2.allSidesEqual()){
            System.out.println("Visas malas vienādas!");
        }
        else {
            System.out.println("Malas nav vienādas.");
        }
        if(task2.twoSidesEqual()){
            System.out.println("Divas malas vienādas!");
        }
        else{
            System.out.println("Nav vienādu malu!");
        }
        System.out.println("Laukums ir: " +  task1.area);

}}
