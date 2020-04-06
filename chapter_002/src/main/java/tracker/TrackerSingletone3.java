package tracker;

import java.util.Arrays;
import java.util.Random;

public class TrackerSingletone3 {
    private static final TrackerSingletone3 INSTANCE = new TrackerSingletone3();
    private Item[] items = new Item[100];
    private int position = 0;
    private TrackerSingletone3() {
    }

    public static TrackerSingletone3 getInstance() {
        return INSTANCE;
    }
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    public Item[] findByName(String key) {
        int count = 0;
        Item[] findName = new Item[position];
        for (int i = 0; i < position; i++) {
            if (key.equals(items[i].getName())) {
                findName[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(findName, count);
    }
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean aDelete = false;
        if (index != -1) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            aDelete = true;
        }
        return aDelete;
    }
}
