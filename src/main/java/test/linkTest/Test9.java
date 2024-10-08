package test.linkTest;

/**
 * <p>Description: 计算两点之间的距离</p>
 * <p>Date: 2023/07/13 19:29</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test9 {

    /**地球半径 单位千米*/
    private static double EARTH_RADIUS = 6378.137;

    public static void main(String []args){

        String lon = "120.03222197047268";
        String lat = "30.34805970283326";
        String lon2 = "120.03217385545679";
        String lat2 = "30.34797755890758";

        double distance = getDistance(Double.valueOf(lon), Double.valueOf(lat), Double.valueOf(lon2), Double.valueOf(lat2));
        System.out.println(distance);
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
        return s*1000;
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
