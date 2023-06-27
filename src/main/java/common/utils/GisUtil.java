package common.utils;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import lombok.extern.slf4j.Slf4j;

/**
 * 围栏和点工具类
 */
@Slf4j
public class GisUtil {

    public static GeometryFactory fact = new GeometryFactory();
    public static WKTReader wktRdr = new WKTReader(fact);

    public static Point getPoint(double lon, double lat) {
        return fact.createPoint(new Coordinate(lon, lat));
    }

    /**
     * 点是否在范围内
     *
     * @param scope
     * @param lon
     * @param lat
     * @return
     */
    public static boolean inFence( String scope, String lon, String lat) {
        if (scope == null) {
            return false;
        }
        try {
            if (scope.contains("|")){
                String scopeStr = scope.replaceAll("\\|", ")),((");
                scopeStr = "MULTIPOLYGON((("+scopeStr+")))";
                Geometry area = wktRdr.read(scopeStr);
                if (area.contains(getPoint(Double.parseDouble(lon), Double.parseDouble(lat)))) {
                    return true;
                }
            }else {
                Geometry area = wktRdr.read("POLYGON((" + scope + "))");
                if (area.contains(getPoint(Double.parseDouble(lon), Double.parseDouble(lat)))) {
                    return true;
                }
            }
        } catch (ParseException e) {
            log.info("河南围栏有问题！");
            e.printStackTrace();
        }
        return false;
    }

}