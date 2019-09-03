package snackbar;

public class SnackBar 
{
  public static void main(String[] args)
  {
    Customer jane = new Customer(1, "Jane", 45.25);
    Customer bob = new Customer(2, "Bob", 33.14);

    VendingMachine food = new VendingMachine(1, "Food");
    VendingMachine drink = new VendingMachine(2, "Drink");
    VendingMachine office = new VendingMachine(3, "Office");

    Snack chips = new Snack(1, "Chips", 36, 1.75, 1);
    Snack chocolateBar = new Snack(2, "Chocolate Bar", 36, 1.00, 1);
    Snack pretzel = new Snack(3, "Pretzel", 30, 2.00, 1);

    Snack soda = new Snack(4, "Soda", 24, 2.5, 2);
    Snack water = new Snack(5, "Water", 20, 2.75, 2);

    soda.buySnack(3);
    jane.buyItem(soda.totalCost(3));

    System.out.println("Hello");
    System.out.println(soda.getQuantity());
  }
}