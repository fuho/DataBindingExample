package zone.qube.databindingexample.alpha;

public class ExampleModel {
    public static String sPublicStaticString = "Public Static String";
    public static String publicString = "Public String directly";
    private String mPrivateString = "Private String with getter";

    public String getPrivateString() {
        return mPrivateString;
    }
}
