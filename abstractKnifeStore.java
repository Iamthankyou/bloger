// duynotes blog
public abstract class KnifeStore {
  public Knife orderKnife(String knifeType) {
    Knife knife;
    // now creating a knife is a method in the
    knife = createKnife(knifeType);
    knife.sharpen();  
    knife.polish();
    knife.package();
  return knife;
}
  abstract Knife createKnife(String type);
}
