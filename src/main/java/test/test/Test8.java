package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/8 15:36</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test8 extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print( "run" );
    }

    public static void main(String[] args){
        Test8 example= new Test8();
        example.run();
        System.out.print( "main" );
    }

}
