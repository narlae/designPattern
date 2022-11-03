package TemplateMethodPattern;

public class MyStringList extends java.util.AbstractList<String> {

    private String[] myList;

    MyStringList(String[] strings) {
        this.myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
