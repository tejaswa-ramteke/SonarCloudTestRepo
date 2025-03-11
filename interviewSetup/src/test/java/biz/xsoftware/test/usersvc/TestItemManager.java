package biz.xsoftware.test.usersvc;

import com.tray.ItemManager;
import junit.framework.TestCase;

public class TestItemManager extends TestCase {

    private ItemManager itemManager;

    public TestItemManager(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        itemManager = new ItemManager();
        System.out.println("JUnit setup is running before each test");
    }

    @Override
    protected void tearDown() throws Exception {
        itemManager = null;
    }

    public void testAddItem() {
        itemManager.addItem("TestItem");
        assertTrue(itemManager.getItems().contains("TestItem"));
    }

    public void testRemoveItem() {
        itemManager.addItem("TestItem");
        assertTrue(itemManager.removeItem("TestItem"));
        assertFalse(itemManager.getItems().contains("TestItem"));
    }

    public void testAddNullItem() {
        try {
            itemManager.addItem(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    public void testBuggyMethod() {
        String s = null;
        System.out.println(s.length()); // This will throw NullPointerException
    }
}
