import java.util.Date;

public class Visit {
  public final Customer customer;
  private Date date;
  private double serviceExpense;
  private double productExpense;

  public Visit(String name, Date date) {
    this.customer = new Customer(name);
    this.date = date;
  }

  public String getName() {
    return customer.getName();
  }

  public double getServiceExpense() {
    return serviceExpense;
  }

  public void setServiceExpense(double ex) {
    this.serviceExpense = ex;
  }

  public double getProductExpense() {
    return productExpense;
  }

  public void setProductExpense(double ex) {
    this.productExpense = ex;
  }

  public double getTotalExpense() {
    double serviceDiscount = 0.0;
    double productDiscount = 0.0;

    if (customer.isMember()) {
      serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
      productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());
    }

    double discountedServiceExpense = serviceExpense * (1 - serviceDiscount);
    double discountedProductExpense = productExpense * (1 - productDiscount);

    return discountedServiceExpense + discountedProductExpense;
  }

  @Override
  public String toString() {
    return "Visit[customer=" + customer.toString() + ", date=" + date +
        ", serviceExpense=" + serviceExpense + ", productExpense=" +
        productExpense + "]";
  }
}
