package asiainfo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by cuiyueyang on 2020/1/14.
 */
public class map存储 {
    public static Map xmltoMap(String xml) throws DocumentException {
        Map map = new HashMap();
        Document document = DocumentHelper.parseText(xml);
        Element nodeElement = document.getRootElement();
        List node = nodeElement.elements();
        for (Iterator it = node.iterator(); it.hasNext(); ) {
            Element elm = (Element) it.next();
            map.put(elm.attributeValue("label"), elm.getText());
            elm = null;
        }
        node = null;
        nodeElement = null;
        document = null;
        return map;
    }

    public static void main(String[] args) throws DocumentException {
        String filepath = "F:/a.xml";
        Map map = new HashMap();
        map = xmltoMap(filepath);
    }
}
