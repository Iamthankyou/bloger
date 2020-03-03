// duynotes blog
public class HasOneDollarState implements State {
  public void insertDollar( VendingMachine vendingMachine ) {
    System.out.println( "already have one dollar" );
  }
  public void ejectMoney( VendingMachine vendingMachine ) {
    System.out.println( "returning money" );
    vendingMachine.doReturnMoney();
    vendingMachine.setState(vendingMachine.getIdleState());
  }
  public void dispense( VendingMachine vendingMachine ) {
    System.out.println( "releasing product" );
    if (vendingMachine.getCount() > 1) {
      vendingMachine.doReleaseProduct();
      vendingMachine.setState(vendingMachine.getIdleState());
    } else {
      vendingMachine.doReleaseProduct();
      vendingMachine.setState(vendingMachine.getOutOfStockState());
    }
  }
}
