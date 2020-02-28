// duynotes blog
public class WebClient {
  private WebRequester webRequester;
  public WebClient(WebRequester webRequester) {
    this.webRequester = webRequester;
  }
  private Object makeObject() { … } // Make an Object
  public void doWork() {
    Object object = makeObject();
    int status = webRequester.request(object);
    if (status == 200) {
      System.out.println("OK");
    } else {
      System.out.println("Not OK");
    }
    return;
  }
}
