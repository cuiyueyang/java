package asiainfo;

/**
 * Created by cuiyueyang on 2020/3/12.
 */
public class 循环测试 {
    public static void main(String[] args) {
        long beginId = 8001;
        long endId = 8011;
        for (int curSegment = 80; curSegment <= 89; curSegment++) {
            //是否在80-89范围内
            if (curSegment < Short.parseShort(String.valueOf(beginId).substring(0, 2)) || curSegment > Short.parseShort(String.valueOf(endId).substring(0, 2)))
                continue;
            for(int i = (int)beginId;i<=endId;i++){
                String a = String.valueOf(i);
                int start3 = Integer.parseInt(a.substring(0,3));
                if(start3 == 400 || start3 == 800){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
