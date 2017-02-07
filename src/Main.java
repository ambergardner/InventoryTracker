import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amber on 2/6/17.
 */
public class Main {
    /* Create a program to track items in an inventory. Allows you to add an item,
    remove an item, and change the quantity they have in stock.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();


        int i = 1;
        for (InventoryItem item : inventory) {
            System.out.println(i + ". " + item.text + " qty= " + item.quantity);
            i++;
        }
        System.out.println("1. Add item");
        System.out.println("2. Remove item");
        System.out.println("3. Change quantity");

        String option = scanner.nextLine();

        // add a new item into the inventory
        if (option.equals("1")) {
            inventory.add(obtainItem());

        } else if (option.equals("2")) {
            System.out.println("Enter the number of the item you would like to delete");
            int itemNum = Integer.parseInt(scanner.nextLine());
            inventory.remove(itemNum - 1);


        } else if (option.equals("3")) {
            System.out.println("Select the item number you want to change");
            int itemNum = Integer.parseInt(scanner.nextLine());
            inventory.remove(itemNum - 1);

            System.out.println("Enter new item");
            String text = scanner.nextLine();

            System.out.println("Enter quantity");
            int userQty = Integer.parseInt(scanner.nextLine());
            InventoryItem item = new InventoryItem(text, userQty);
            return item inventory.set();
        }
    }}
