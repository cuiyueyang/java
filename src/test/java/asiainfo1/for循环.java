package asiainfo1;

/**
 * Created by cuiyueyang on 2020/4/27.
 */
public class for循环 {
    public static void main(String[] args) {
        System.out.println(test1());
    }
    public static Boolean test1(){
        for (int i = 1;i<6;i++){
            if (i==1){
                System.out.println("1");
                continue;
            }else if(i==5){
                System.out.println("5");
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
