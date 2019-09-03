package snackbar;

class Customer
{
  private int id;
  private String name;
  private double cash;

  public Customer(int id, String name, double cash)
  {
    this.id = id;
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

