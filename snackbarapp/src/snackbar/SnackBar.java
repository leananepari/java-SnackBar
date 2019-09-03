package snackbar;

class SnackBar 
{
  public static void main(String[] args)
  {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine(1, "Food");
    VendingMachine drink = new VendingMachine(2, "Drink");
    VendingMachine office = new VendingMachine(3, "Office");

    Snack chips = new Snack("Chips", 36, 1.75, 1);
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
    Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

    Snack soda = new Snack("Soda", 24, 2.5, 2);
    Snack water = new Snack("Water", 20, 2.75, 2);

    soda.buySnack(3);
    jane.buyItem(soda.totalCost(3));

    System.out.println(jane.cash);
    System.out.println(soda.getQuantity());
  }
}

