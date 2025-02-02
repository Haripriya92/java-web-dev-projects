package org.launchcode;

import java.util.Objects;

public class MenuItem {

    private double price;
    private String description;
    private MenuItemCategory  category;
    private boolean isNew;

    public MenuItem(double price, String description, MenuItemCategory category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MenuItemCategory getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(MenuItemCategory category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return  Objects.equals(description, menuItem.description) && category == menuItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

    @Override
    public String toString() {
        return   description + ": $"+ price;
    }
}
