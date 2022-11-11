package CompositePattern;

import IteratorPattern.Menu;
import IteratorPattern.MenuItem;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;


    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
