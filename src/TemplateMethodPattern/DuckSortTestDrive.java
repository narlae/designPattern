package TemplateMethodPattern;

import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
        };

        System.out.println("정렬 전:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\n정렬 후:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
