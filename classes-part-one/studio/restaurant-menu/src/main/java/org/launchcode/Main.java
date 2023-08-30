package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem newItem = new MenuItem(15,"Some food", MenuItemCategory.APPETIZER, true);
        //Menu items
        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
        currentMenu.getAppetizer().add(newItem);

        //all items added to menu

        System.out.println(currentMenu.getAppetizer());

    }
}
