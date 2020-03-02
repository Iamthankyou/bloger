// duynotes blog
public abstract class PastaDish {
  final void makeRecipe() {
    boilWater();
    addPasta();
    cookPasta();
    drainAndPlate();
    addSauce();
    addProtein();
    addGarnish();
  }
  abstract void addPasta();
  abstract void addSauce();
  abstract void addProtein();
  abstract void addGarnish();
  private void boilWater() {
    System.out.println("Boiling water");
  }
  //…
}
