package TemplateMethodPattern;

public abstract class CaffeineBeverage {

    //템플릿 메소드
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void addCondiments();

    abstract void brew();


    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    void boilWater() {
        System.out.println("물 끓이는 중");
    }


}
