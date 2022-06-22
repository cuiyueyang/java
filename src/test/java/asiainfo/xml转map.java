package asiainfo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class xml转map {
    @Test
    public void main() {
        String filepath = "F:/a.xml";
        Map map = mainMethod(filepath);
        System.out.println(map);
    }

    public Map mainMethod(String filepath) {
        Map<String, Object> map_finall = new LinkedHashMap<String, Object>();
        try {
            File file = new File(filepath);
            // 读取xml文件，封装为doc对象
            SAXReader saxreader = new SAXReader();
            Document doc = saxreader.read(file);
            Element rootElement = doc.getRootElement();
            // 调用递归方法
            map_finall.put(rootElement.getName(), DiGui(rootElement));
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map_finall;
    }

    public Map DiGui(Element rootElement) {
        // 对节点进行判断
        int flag = hasGradeChrid(rootElement);
        // 存储本层的map,采用LinkedHashMap,保证的顺序
        Map<String, Object> map_this = new LinkedHashMap<String, Object>();
        // 存储子节点的map，采用LinkedHashMap,保证的顺序
        Map<String, Object> map_children = new LinkedHashMap<String, Object>();
        // 获取节点迭代器
        Iterator<Element> iterator = rootElement.elementIterator();
        if (flag == 0) {// 说明该节点所有子节点均有子节点,进入递归
            int num = 0;
            while (iterator.hasNext()) {// 依次继续对节点进行操作
                Element childelement = iterator.next();
                map_children = DiGui(childelement);
                map_this.put(childelement.getName() + "_" + num, map_children);
                num++;
            }
        }
        if (flag == 1) {// 说明该节点的所有子节点均无子节点,封装数据
            while (iterator.hasNext()) {
                Element childelement = iterator.next();
                map_this.put(childelement.getName(),
                        (String) childelement.getData());
            }
        }
        if (flag == 2) {// 说明了该节点的子节点有些拥有子节点，有些不拥有
            int nodes = rootElement.elements().size();// 获取子节点个数
            while (nodes >= 1) {
                nodes--;
                int num = 0;//为了让循环重复的节点，避免了key的冲突
                Element element = iterator.next();
                flag = hasGradeChrid(element);//对节点进行判断
                if (flag == 1) {                          //对于子节点，如果只是普通的子节点，那么直接将数进行封装
                    // 封装如map,String,String
                    map_this.put(element.getName(), element.getData());
                }
                else{                                     //非普通子节点，那么进行递归
                    map_children = DiGui(element);
                    map_this.put(element.getName() + "_" + num, map_children);//为了让循环重复的节点，避免了key的冲突
                }
            }
        }
        return map_this;
    }

    /**
     * 用于判断该节点的类型 0：说明该节点所有子节点均有子节点 1：说明该节点的所有子节点均无子节点 2：说明了该节点的子节点有些拥有子节点，有些不拥有
     *
     * @param rootelement
     * @return
     */
    public int hasGradeChrid(Element rootelement) {
        int flag = 1;// 初始为1，用与处理对没有子节点的节点进行判断
        StringBuffer flag_arr = new StringBuffer();
        Iterator<Element> iterator = rootelement.elementIterator();
        while (iterator.hasNext()) {
            Element element = iterator.next();// 获取入参rootelement节点的子节点
            // Iterator<Element> iterator_chirld = element.elementIterator();
            if (element.elements().size() > 0) {// 判断是否有子节点
                flag_arr.append("0");
            } else {
                flag_arr.append("1");
            }
        }
        // 如果只包含0，说明该节点所有子节点均有子节点
        if (flag_arr.toString().contains("0")) {
            flag = 0;
        }
        // 如果只包含1，说明该节点的所有子节点均无子节点
        if (flag_arr.toString().contains("1")) {
            flag = 1;
        }
        // 如果同时包含了,0,1,说明了该节点的子节点有些拥有子节点，有些不拥有
        if (flag_arr.toString().contains("0")
                && flag_arr.toString().contains("1")) {
            flag = 2;
        }
        return flag;
    }
}