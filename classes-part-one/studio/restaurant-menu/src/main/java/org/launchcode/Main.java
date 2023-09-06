package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         ArrayList<Object> completeMenu=new ArrayList<>();
	// write your code here
        MenuItem appetizer1 = new MenuItem(12.99,"Chilli Gobi", MenuItemCategory.APPETIZER, true);
        MenuItem appetizer2 = new MenuItem(13.99,"Mushroom 65", MenuItemCategory.APPETIZER, true);
        MenuItem appetizer3 = new MenuItem(14.99,"Lollipop Chicken", MenuItemCategory.APPETIZER, true);
        MenuItem appetizer4 = new MenuItem(14.99,"Masala Fish Fry", MenuItemCategory.APPETIZER, true);
        MenuItem appetizer5 = new MenuItem(15.99,"Shrimp Pepper Fry", MenuItemCategory.APPETIZER, true);

        MenuItem mainCourse1 = new MenuItem(13.99,"Chilli 65 Biriyani", MenuItemCategory.MAIN_COURSE, true);
        MenuItem mainCourse2 = new MenuItem(15.99,"Goat Sukka Biriyani", MenuItemCategory.MAIN_COURSE, true);
        MenuItem mainCourse3 = new MenuItem(14.99,"Shrimp Biriyani", MenuItemCategory.MAIN_COURSE, true);
        MenuItem mainCourse4 = new MenuItem(10.99,"Masala Dosa", MenuItemCategory.MAIN_COURSE, true);
        MenuItem mainCourse5 = new MenuItem(8.99,"Idli Vada", MenuItemCategory.MAIN_COURSE, true);

        MenuItem dessert1 = new MenuItem(5.99,"Gulab Jamun", MenuItemCategory.DESSERT, true);
        MenuItem dessert2 = new MenuItem(5.99,"Rasamali", MenuItemCategory.DESSERT, true);
        MenuItem dessert3 = new MenuItem(5.99,"Ice cream", MenuItemCategory.DESSERT, true);



        //Menu items
        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        currentMenu.getAppetizer().add(appetizer1);
        currentMenu.getAppetizer().add(appetizer2);
        currentMenu.getAppetizer().add(appetizer3);
        currentMenu.getAppetizer().add(appetizer4);
        currentMenu.getAppetizer().add(appetizer5);
        //all items added to menu
        currentMenu.getEntree().add(mainCourse1);
        currentMenu.getEntree().add(mainCourse2);
        currentMenu.getEntree().add(mainCourse3);
        currentMenu.getEntree().add(mainCourse4);
        currentMenu.getEntree().add(mainCourse5);
        //all items added to menu
        currentMenu.getDessert().add(dessert1);
        currentMenu.getDessert().add(dessert2);
        currentMenu.getDessert().add(dessert3);
        /*System.out.println(currentMenu.getLastUpdated());
        System.out.println(currentMenu.getAppetizer());
        System.out.println(currentMenu.getEntree());
        System.out.println(currentMenu.getDessert());*/
        completeMenu.add(currentMenu);
        Menu newMenu = new Menu(new java.util.Date(), new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        System.out.println("Enter the option for the app");
        int option = Integer.parseInt(scn.nextLine());

        if(option==1){
            System.out.println("Enter the menu to be deleted");
            String menu= scn.nextLine();
            newMenu.deleteMenu(menu,completeMenu);
    }
        if(option==2){

            System.out.println("Enter the menu to be added");
            String menu= scn.nextLine();
            System.out.println("Enter category to which menu has to be added(DESSERT/APPETIZER/MAIN_COURSE)");
            String category= scn.nextLine();
            System.out.println("Enter the price of menu");
            double price= Double.parseDouble(scn.nextLine());
            newMenu.addMenu(menu,category,price,completeMenu);
        }
        if(option==3){
            System.out.println("Enter the menu to be printed");
            String menu= scn.nextLine();
            newMenu.printMenu(menu,completeMenu);
        }
        if(option==4){
            System.out.println("Printing Entire Menu");
            newMenu.printEntireMenu(completeMenu);
        }
        if(option==5){
            System.out.println("Check whether the menu already exists");
            System.out.println("Enter the menu to be checked in the list");
            String menu= scn.nextLine();
            System.out.println("Enter category to which menu has to be added(DESSERT/APPETIZER/MAIN_COURSE)");
            String category= scn.nextLine();
            System.out.println("Enter the price of menu");
            double price= Double.parseDouble(scn.nextLine());
            newMenu.toCheckMenuAlreadyExists(menu,category,price,completeMenu);
        }
    }
}
