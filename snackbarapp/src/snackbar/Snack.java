package snackbar;

class Snack 
{
  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendineMachineId;

  public Snack(String name, int quantity, double cost, int vendineMachineId)
  {
    maxId++;

    this.id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendineMachineId = vendineMachineId;
  }

  public void setId(int id) 
  {
    this.id = id;
  }

  public int getId()
  {
    return this.id;
  }

  public void setName(String n) 
  {
    this.name = n;
  }

  public String getName() 
  {
    return this.name;
  }

  public void setCost(double cost) 
  {
    this.cost = cost;
  }

  public double getCost() 
  {
    return this.cost;
  }

  public void setVendineMachineId(int id) 
  {
    this.vendineMachineId = id;
  }

  public int getVendineMachineId()
  {
    return this.vendineMachineId;
  }

  public int getQuantity()
  {
    return this.quantity;
  }

  public void addQuantity(int qty)
  {
    this.quantity += qty;
  }

  public void buySnack(int qty) 
  {
    this.quantity -= qty;
  }

  public double totalCost(int qty)
  {
    return this.cost * qty;
  }
}
