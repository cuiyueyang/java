package test.linkTest;


import sun.misc.BASE64Encoder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * <p>Description: </p>
 * <p>@date 2022/8/22 10:30</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test7 {
    public static void main(String[] args) throws IOException {

        Double a = Double.valueOf(8)/30;
        System.out.println(a);

        System.out.println(new BigDecimal(a).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

//        Double a = 783.00;
//        System.out.println(a.intValue());

//        String imgUrl = "https://zjjt.zhuji.gov.cn:9443/kkgcptoss/aila/jpg/bige5ab4f8d0c4a4fc8b67fbcc3d79854fc.jpg?Expires=1979569800&OSSAccessKeyId=stGWaQ5RYrc4Wkba&Signature=3vdRPG%2BaML%2F0Acirfbh1ROz%2FaVw%3D";
//        String base64 = ImageUtil.getImage(imgUrl);
//        String base65 = ImageUtil.getImageBase64Str(imgUrl);
//        String base66 = NetImageToBase64(imgUrl);
//        System.out.println(base64);

    }


    private static String NetImageToBase64(String netImagePath) {
        String strNetImageToBase64 = null;
        final ByteArrayOutputStream data = new ByteArrayOutputStream();
        try {
            // 创建URL
            URL url = new URL(netImagePath);
            final byte[] by = new byte[1024];
            // 创建链接
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            try {
                InputStream is = conn.getInputStream();
                // 将内容读取内存中
                int len = -1;
                while ((len = is.read(by)) != -1) {
                    data.write(by, 0, len);
                }
                // 对字节数组Base64编码
                BASE64Encoder encoder = new BASE64Encoder();
                strNetImageToBase64 = encoder.encode(data.toByteArray());
                System.out.println("网络图片转换Base64:" + strNetImageToBase64);
                // 关闭流
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strNetImageToBase64;
    }

}
