package tracker;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker t = new Tracker();
        Item i = new Item("item1");
        t.add(i);
        Item result = t.findById(i.getId());
        assertThat(result.getName(), is(i.getName()));
    }
    @Test
    public void whenFindNameThenItem() {
        Tracker t = new Tracker();
        Item item1 = t.add(new Item ("item1"));
        Item item2 = t.add(new Item ("item0"));
        Item item3 = t.add(new Item ("item1"));
        Item item4 = t.add(new Item ("item3"));
        Item item5 = t.add(new Item ("item4"));
        Item[] result = t.findByName("item1");
        Item[] expect = {item1,item1};
        assertThat(Arrays.toString(result), is(Arrays.toString(expect)));
    }
    @Test
    public void whenFindAllThenItems() {
        Tracker t = new Tracker();
        Item item1 = t.add(new Item("item1"));
        Item item2 = t.add(new Item("item5"));
        Item item3 = t.add(new Item ("item1"));
        Item item4 = t.add(new Item ("item3"));
        Item item5 = t.add(new Item ("item4"));
        Item[] result = t.findAll();
        Item[] expect = {item1,item5,item1,item3,item4};
        assertThat(Arrays.toString(result), is(Arrays.toString(expect)));
    }
    @Test
    public void whenFindIdThenItem() {
        Tracker t = new Tracker();
        Item item1 = t.add(new Item("item1"));
        item1.setId("10");
        Item item2 = t.add(new Item("item5"));
        item2.setId("11");
        Item item3 = t.add(new Item ("item1"));
        item3.setId("12");
        Item item4 = t.add(new Item ("item3"));
        item4.setId("13");
        Item item5 = t.add(new Item ("item4"));
        item5.setId("14");
        Item result = t.findById("13");
        Item expect = item3;
        assertThat(Arrays.asList(result), is(Arrays.asList(expect)));
    }
}
