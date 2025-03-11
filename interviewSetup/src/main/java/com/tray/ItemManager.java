package com.tray;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private final List<String> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Item cannot be null or empty");
        }
        items.add(item);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }
}
