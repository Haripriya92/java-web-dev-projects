package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> appetizer;
    private ArrayList<MenuItem> entree;
    private ArrayList<MenuItem> dessert;

    public Menu(Date d, ArrayList<MenuItem> appetizer) {
        this.lastUpdated = d;
        this.appetizer = appetizer;
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
}