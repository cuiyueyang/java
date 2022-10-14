package common.utils;


import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import sun.misc.BASE64Encoder;

/**
 * <p>Description: </p>
 * <p>@date 2022/9/28 11:21</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class ImageUtil {

    public static String getImage(String imageUrl){
        DataInputStream in = null;
        HttpURLConnection connection = null;
        String base64Str = null;
        try {
            URL url = new URL(imageUrl);
            // 打开链接
            connection = (HttpURLConnection) url.openConnection();
            in = new DataInputStream(connection.getInputStream());
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            // 读取图片
            while ((length = in.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            // 转换为 base64
            BASE64Encoder base64Encoder = new BASE64Encoder();
            base64Str = base64Encoder.encode(output.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                connection.disconnect();
            }
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 拼接前缀，可以交给前台
        return "data:image/jpg;base64," + base64Str;
    }


    //图片转Base64，imgList是要转的图片路径，可以是相对路径也可以是绝对路径
    public static String getImageBase64Str(String imgPath) throws IOException {
        InputStream inputStream = null;
        String base64Str = null;
        HttpURLConnection connection = null;
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            URL url = new URL(imgPath);
            // 打开链接
            connection = (HttpURLConnection) url.openConnection();
            inputStream = new DataInputStream(connection.getInputStream());

            byte[] bytes = read(inputStream);
            base64Str  = encoder.encodeToString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
        return "data:image/jpg;base64," + base64Str;
    }
    //处理图片显示不全问题
    public static byte[] read(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int num = inputStream.read(buffer);
            while (num != -1) {
                baos.write(buffer, 0, num);
                num = inputStream.read(buffer);
            }
            baos.flush();
            return baos.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

}
