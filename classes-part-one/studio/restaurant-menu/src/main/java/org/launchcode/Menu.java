package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> appetizer;
    private ArrayList<MenuItem> entree;
    private ArrayList<MenuItem> dessert;

    public Menu(Date d, ArrayList<MenuItem> appetizer,ArrayList<MenuItem> entree,ArrayList<MenuItem> dessert) {
        this.lastUpdated = d;
        this.appetizer = appetizer;
        this.entree=entree;
        this.dessert=dessert;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setAppetizer(ArrayList<MenuItem> appetizer) {
        this.appetizer = appetizer;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getAppetizer() {
        return appetizer;
    }
    public ArrayList<MenuItem> getEntree() {
        return entree;
    }

    public void setEntree(ArrayList<MenuItem> entree) {
        this.entree = entree;
    }

    public ArrayList<MenuItem> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<MenuItem> dessert) {
        this.dessert = dessert;
    }
public void addMenu(String menu,String category,double price,ArrayList<Object> completeMenu){
    if(category.equals("DESSERT")){
        MenuItem dessert = new MenuItem(price,menu, MenuItemCategory.DESSERT, true);
        this.getDessert().add(dessert);
        completeMenu.add(this);
        System.out.println("Menu added as dessert");
        for(int i=0;i<completeMenu.size();i++) {
            Menu entries= (Menu) completeMenu.get(i);
            System.out.println(entries.getDessert());
        }
    }
    if(category.equals("APPETIZER")){
        MenuItem appetizer = new MenuItem(price,menu, MenuItemCategory.APPETIZER, true);
        this.getAppetizer().add(appetizer);
        completeMenu.add(this);
        System.out.println("Menu added as dessert");
        for(int i=0;i<completeMenu.size();i++) {
            Menu entries= (Menu) completeMenu.get(i);
            System.out.println(entries.getAppetizer());
        }
    }
    if(category.equals("MAIN_COURSE")){
        MenuItem entree = new MenuItem(price,menu, MenuItemCategory.MAIN_COURSE, true);
        this.getEntree().add(entree);
        completeMenu.add(this);
        System.out.println("Menu added as dessert");
        for(int i=0;i<completeMenu.size();i++) {
            Menu entries= (Menu) completeMenu.get(i);
            System.out.println(entries.getEntree());
        }
    }
}
public void deleteMenu(String menu,ArrayList<Object> completeMenu){
    for(int i=0;i<completeMenu.size();i++){
        Menu entries= (Menu) completeMenu.get(i);
        int j;
        for(j=0;j<entries.getAppetizer().size();j++){
            String listedMenu=entries.getAppetizer().get(j).getDescription();
            if(menu.equals(listedMenu)){
                entries.getAppetizer().remove(j);
                System.out.println("Entry deleted");
                System.out.println(entries.getAppetizer());

            }
        }
        for(j=0;j<entries.getEntree().size();j++){
            String listedMenu=entries.getEntree().get(j).getDescription();
            if(menu.equals(listedMenu)){
                entries.getEntree().remove(j);
                System.out.println("Entry deleted");
                System.out.println(entries.getEntree());
            }
        }
        for(j=0;j<entries.getDessert().size();j++){
            String listedMenu=entries.getDessert().get(j).getDescription();
            if(menu.equals(listedMenu)){
                entries.getDessert().remove(j);
                System.out.println("Entry deleted");
                System.out.println(entries.getDessert());
            }
        }
    }
}
public void printMenu(String menu,ArrayList<Object> completeMenu){
    for(int i=0;i<completeMenu.size();i++){
        Menu entries= (Menu) completeMenu.get(i);
        int j;
        for(j=0;j<entries.getAppetizer().size();j++){
            String listedMenu=entries.getAppetizer().get(j).getDescription();
            if(menu.equals(listedMenu)){
                System.out.println("Printing Menu Details");
                System.out.println(entries.getAppetizer().get(j));

            }
        }
        for(j=0;j<entries.getEntree().size();j++){
            String listedMenu=entries.getEntree().get(j).getDescription();
            if(menu.equals(listedMenu)){
                System.out.println("Printing Menu Details");
                System.out.println(entries.getEntree().get(j));
            }
        }
        for(j=0;j<entries.getDessert().size();j++){
            String listedMenu=entries.getDessert().get(j).getDescription();
            if(menu.equals(listedMenu)){
                System.out.println("Printing Menu Details");
                System.out.println(entries.getDessert().get(j));
            }
        }
    }
}
public void printEntireMenu(ArrayList<Object> completeMenu){
    for(int i=0;i<completeMenu.size();i++) {
        Menu entries = (Menu) completeMenu.get(i);
        System.out.println(entries.getAppetizer());
        System.out.println(entries.getEntree());
        System.out.println(entries.getDessert());
    }
}
    public void toCheckMenuAlreadyExists(String menu,String category,double price,ArrayList<Object> completeMenu){
        if(category.equals("DESSERT")){
            MenuItem dessert = new MenuItem(price,menu, MenuItemCategory.DESSERT, true);
            for(int i=0;i<completeMenu.size();i++) {
                Menu entries= (Menu) completeMenu.get(i);
                for(int j=0;j<entries.getDessert().size();j++){
                    MenuItem listedMenu=entries.getDessert().get(j);
                    if(listedMenu.equals(dessert)){
                        System.out.println("Menu Already Exists");
                    }
                }
            }
        }
        if(category.equals("APPETIZER")){
            MenuItem appetizer = new MenuItem(price,menu, MenuItemCategory.APPETIZER, true);
            for(int i=0;i<completeMenu.size();i++) {
                Menu entries= (Menu) completeMenu.get(i);
                for(int j=0;j<entries.getDessert().size();j++){
                    MenuItem listedMenu=entries.getAppetizer().get(j);
                    if(listedMenu.equals(appetizer)){
                        System.out.println("Menu Already Exists");
                    }
                }
            }
        }
        if(category.equals("MAIN_COURSE")){
            MenuItem entree = new MenuItem(price,menu, MenuItemCategory.MAIN_COURSE, true);
            for(int i=0;i<completeMenu.size();i++) {
                Menu entries= (Menu) completeMenu.get(i);
                for(int j=0;j<entries.getDessert().size();j++){
                    MenuItem listedMenu=entries.getAppetizer().get(j);
                    if(listedMenu.equals(entree)){
                        System.out.println("Menu Already Exists");
                    }
                }
            }
        }
    }
}