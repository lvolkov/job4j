package tracker;

import java.util.Arrays;
import java.util.Random;

/**
 *
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 01.03.2020
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    public Item add(Item item){
        item.setId(this.generateId());
        items[this.position++]=item;
        return item;
    }
    public Item[] findAll() {
       return Arrays.copyOf(items,position);
    }
    public Item[] findByName(String key) {
        int count = 0;
        Item[] findName = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            if (key.equals(this.items[i].getName())) {
                findName[count] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(findName,count);
    }
    public Item findById(String id) {
        //Item findId = null;
       // for (int i = 0; i < this.position; i++) {
        //    if (id.equals(items[i].getId())) {
        //        findId = items[i];
        //        break;
        //    }
        //}
       // return findId;
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
        if (index!= -1) {
            item.setId(id);
            items[index]=item;
            result = true;
        }
        return result;
    }
    public boolean delete(String id) {
        int index = indexOf(id);
        items[index] = null;
        System.arraycopy(items, index+1, items, index, position-index);
        items[position - 1] = null;
        position--;
        return true;
    }
}
