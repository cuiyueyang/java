package asiainfo;

import org.junit.Test;

/**
 * Created by cuiyueyang on 2019/12/22.
 */
public class equalsTest {
    @Test
    public void test1(){
        if("2".equals(2)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        Long a = 22222222222222L;
        if("22222222222222".equals(a)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if("22222222222222".equals(String.valueOf(a))){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
    public static void equ(String name){
        if( 2 ==name.length()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        equ("张三");
    }
}
