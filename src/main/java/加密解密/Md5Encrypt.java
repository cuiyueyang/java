package 加密解密;

import common.utils.Md5Util;

import java.util.Base64;

/**
 * <p>Description: md5加密算法</p>
 * <p>@date 2021/11/9 10:34</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Md5Encrypt {

    public static void main(String[] args) {


        //md5 加密
        String str = "e71c2782b134410ca3e8cb0ce66d38a246cf8e4a83384960a740f7faf41716e520230608140000csewogICAgImNvZGUiOiAxMDAzLAogICAgIm1zZyI6ICJhcHBpZOmUmeivryIKfQ==OffSiteCaseUpload1.0.1";
        String a = Md5Util.md5Encrypt32Upper(str);


        //base64 解码
        byte[] bytes = "cs".getBytes();
        String encode = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encode);
    }

}
