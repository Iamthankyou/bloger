// duynotes blog
public class KnifeStore {
  private KnifeFactory factory;
  // require a KnifeFactory object to be passed
  // to this constructor:
  Public KnifeStore(KnifeFactory factory) {
    this.factory = factory;
  }
  Public Knife orderKnife(String knifeType) {
    Knife knife;
    //use the create method in the factory
    knife = factory.createKnife(knifeType);
    //prepare the Knife
    knife.sharpen();
    knife.polish();
    knife.package();
    return knife;
  }
}
