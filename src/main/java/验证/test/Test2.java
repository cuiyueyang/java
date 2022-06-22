package 验证.test;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Description: </p>
 * <p>@date 2021/11/3 15:03</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test2 {

    /**地球半径 单位千米*/
    private static double EARTH_RADIUS = 6378.137;

    public static void main(String[] args) {
        String longitude = "120390220";
        String latitude = "29869314";
        longitude = deaLatAndLon(longitude, 3);
        latitude = deaLatAndLon(latitude, 2);
        double distance = getDistance(Double.valueOf(120.39619486913521), Double.valueOf(29.86756054940038), Double.valueOf(longitude), Double.valueOf(latitude));
        if (distance < 1.0) {
            System.out.println(1);
        }
    }


    /**
     * 经纬度处理，
     * 由于传来的经纬度没有点，需自己再处理过
     *
     * @param degree 经度或纬度
     * @param sub    截取长度
     * @return
     */
    private static String deaLatAndLon(String degree, Integer sub) {
        //longitude: "120454715"
        if (StringUtils.isNotBlank(degree)) {
            if (degree.contains(".")) {
                return degree;
            } else {
                try {
                    String s = degree.substring(0, sub) + "." + degree.substring(sub);
                    return s;
                } catch (Exception e) {
                    return "";
                }
            }
        } else {
            return "";
        }
    }

    /**
     * 依据经纬度计算两点之间的距离 GetDistance:(). <br/>
     *
     * @param lat1 1点的纬度
     * @param lng1 1点的经度
     * @param lat2 2点的纬度
     * @param lng2 2点的经度
     * @return 距离 单位 千米
     */
    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = getRadian(lat1);
        double radLat2 = getRadian(lat2);
        double a = radLat1 - radLat2;// 两点纬度差
        double b = getRadian(lng1) - getRadian(lng2);// 两点的经度差
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1)
                * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        return s;
    }

    /**
     * 角度弧度计算公式 rad:(). <br/>
     * <p>
     * 360度=2π π=Math.PI
     * <p>
     * x度 = x*π/360 弧度
     *
     * @param degree
     * @return
     */
    private static double getRadian(double degree) {
        return degree * Math.PI / 180.0;
    }


}
