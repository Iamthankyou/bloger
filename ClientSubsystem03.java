// duynotes blog
public class ClientSubsystem {
  public Sorting enterpriseSorting;
  public ClientSubsystem(Sorting
  concreteSortingClass) {
    this.enterpriseSorting = concreteSortingClass;
  }
  public void sortInput(List customerList) {
    this.enterpriseSorting.sort(customerList);
  }
}
