package asiainfo;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by cuiyueyang on 2019/12/16.
 */
public class kongGeTest {
    public static void main(String[] args) {
        //test1
//        String msg = "     ";
//        if(StringUtils.isNotBlank(msg)){
//            System.out.println("11");
//        }else {
//            System.out.println("22");
//        }
//        if("是".equalsIgnoreCase(msg)){
//            System.out.println("1");
//        }else {
//            System.out.println("2");
//        }
        //test2
        String ext1 = "";
        String ext2 = "600000565424";
        String ext3 = "60000056";
        String preFix = "";
        if(!"600000565424".equals(ext2)){
            if (StringUtils.isNotBlank(ext2)) {
                preFix = ext2.substring(0, 3);
            }
            System.out.println("1");
        }
        System.out.println(preFix);
    }
}
