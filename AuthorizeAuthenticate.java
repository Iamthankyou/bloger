// duynotes blog
public class AuthorizedWebPage extends WebPageDecorator{  
  public AuthorizedWebPage(WebPage decoratedPage){ 
    super(decoratedPage); \
  }
  public void authorizedUser() {
    System.out.println("Authorizing user");
  }
  public display() {
    super.display();
    this.authorizedUser();
  }
}
public class AuthenticatedWebPage extends WebPageDecorator {
 public AuthenticatedWebPage(WebPage decoratedPage){ 
  super(decoratedPage); }
  public void authenticateUser() {
  System.out.println("Authenticating user");
 }
 public display() {
  super.display();
  this.authenticateUser();
  }
}
