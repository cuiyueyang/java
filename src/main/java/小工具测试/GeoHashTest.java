package 小工具测试;

import common.utils.GeoHash;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/17 10:09</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class GeoHashTest {
    public static void main(String[] args) {
        GeoHash geoHash = new GeoHash(6, 1, 1);
        String geoHash1 = geoHash.encode(117.07335300000000000000, 36.67035800000000000000);
        System.out.println(geoHash1);
        String geoHash2 = geoHash.encode(117.08335300000000000000, 36.87035800000000000000);
        System.out.println(geoHash2);
    }
}
