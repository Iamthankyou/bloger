// duynotes blog
public class Program {
  public static void main(String args[]) {
    WebPage myPage = new BasicWebPage();
    myPage = new AuthorizedWebPage(myPage);
    myPage = new AuthenticatedWebPage(myPage);
    myPage.display(); 
  }
}
