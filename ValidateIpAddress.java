import java.util.regex.Pattern;
class Solution {
    public String validIPAddress(String IP) {
        String ip4 = "\\b(?:(?:25[0-5]|2[0-4][0-9]|[0-9]|[1][0-9]?[0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[0-9]|[1][0-9]?[0-9]?)\\b";
        String ip6 = "\\b(?:(?:[0-9a-fA-F]{1,4}):){7}(?:[0-9a-fA-F]{1,4})\\b";
        return Pattern.matches(ip4,IP)?"IPv4":Pattern.matches(ip6,IP)?"IPv6":"Neither";
    }
}
