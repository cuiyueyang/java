package 验证.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/16 16:28</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test11{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Test11 ex = new Test11();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}
