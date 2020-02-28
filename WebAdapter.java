// duynotes blog
public class WebAdapter implements WebRequester {
  private WebService service;
  public void connect(WebService currentService) {
    this.service = currentService;
    /* Connect to the web service */
  }
  public int request(Object request) {
    Json result = this.toJson(request);
    Json response = service.request(result);
    if (response != null)
      return 200; // OK status code
    return 500; // Server error status code
  }
  private Json toJson(Object input) { … }
}
