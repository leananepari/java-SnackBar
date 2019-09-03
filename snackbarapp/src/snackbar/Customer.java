package snackbar;

class Customer
{
  private static int maxId = 0;

  private int id;
  private String name;
  public double cash;

  public Customer(String name, double cash)
  {
    maxId++;

    this.id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public void addCash(double money)
  {
    this.cash += money;
  }

  public void buyItem(double money)
  {
    this.cash -= money;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }
}

