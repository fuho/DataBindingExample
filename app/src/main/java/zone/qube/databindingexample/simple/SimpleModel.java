package zone.qube.databindingexample.simple;

public class SimpleModel {
    public static String sPublicStaticString = "Public Static String";
    public static String publicString = "Public String directly";
    private String mPrivateString = "Private String with getter";

    public String getPrivateString() {
        return mPrivateString;
    }
}
