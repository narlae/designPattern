package TemplateMethodPattern;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();

        System.out.println("\n 커피 준비중...");
        coffee.prepareRecipe();
    }
}
