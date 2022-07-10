package asiainfo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuiyueyang on 2020/3/31.
 */
public class sql拼接 {
    public static void main(String[] args) {
        List records = new ArrayList();
        records.add(0);
        records.add(1);
        records.add(2);
        records.add(3);
        records.add(4);
        records.add(5);
        records.add(6);
        records.add(7);
        records.add(8);
        records.add(9);
        records.add(10);
        records.add(11);


        StringBuffer condition = new StringBuffer(" 1=1 AND RECORD_ID IN( ");
        //进行几次拼接
        for (int i = 0; i<records.size()/10+1 ;i++){
            //
            //第一次先把余数给放进去，如果再循环的话就都是1000个
            if (i==0){
                for (int a=0;a<records.size()%10;a++){
                    //如果是最后一个特殊处理
                    if (a==records.size()%10-1){
                        condition.append(records.get(a)+" )");
                    }else {
                        condition.append(records.get(a)+",");
                    }
                }
            }else {
                //or in 拼接
                condition.append(" OR RECORD_ID IN ( ");
                for (int b=0; b<10;b++){
                    //最后一个特殊处理
                    if (b == 9){
                        int bb = records.size()%10+i*10-10+b;
                        condition.append(records.get(bb)+" )");
                    }else {
                        int bb = records.size()%10+i*10-10+b;
                        condition.append(records.get(bb)+",");
                    }
                }
            }
        }
        System.out.println(condition);
        System.out.println(condition);
    }
}
