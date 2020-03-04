// duynotes blog
import java.util.*;
public class StoreOrder extends Observable {
  private ArrayList<String> itemList;
  private ArrayList<BigDecimal> priceList;
  public StoreOrder() {
    itemList = new ArrayList<String>();
    priceList = new ArrayList<BigDecimal>();
  }
  public String getItem( int itemNum ) {
    return itemList.get(itemNum);
  }
  public String getPrice( int itemNum ) {
    return priceList.get(itemNum);
  }
  public ListIterator<String> getItemList() {
    ListIterator<String> itemItr = itemList.listIterator();
    return itemItr;
  }
  public ListIterator<BigDecimal> getPriceList() {
    ListIterator<String> priceItr = priceList.listIterator();
    return priceItr;
  }
  public void deleteItem( int itemNum ) {
    itemList.remove(itemNum);
    priceList.remove(itemNum);
    setChanged();
    notifyObservers();
  }
  public void addItem( int barcode ) {
    // code to add item (probably used with a scanner)
    // prices are looked up from a database
    //...
    setChanged();
    notifyObservers();
  }
  public void changePrice( int itemNum, BigDecimal newPrice ) {
    priceList.set(itemNum,newPrice);
    setChanged();
    notifyObservers();
  }
}
