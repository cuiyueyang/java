package asiainfo;

import org.junit.Test;

/**
 * Created by cuiyueyang on 2020/1/2.
 */
public class 传参类型 {
    @Test
    public void test1(){
        test2(22L);
    }
    public void test2(Long a){
        System.out.println(a);
    }
}
