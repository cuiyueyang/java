package str;

/**
 * <p>Description: </p>
 * <p>Date: 2023/11/15 17:16</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class AttachEnd {

    public static void main(String[] args) {
        String url = "http://a.a.b.cs.jpg";
        String result = url.substring(url.lastIndexOf(".")+1);
        System.out.println(result);
    }

}
