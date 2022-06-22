package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by cuiyueyang on 2019/4/20.
 * File的操作
 */
public class IOtest1 {
    public static void main(String[] args) {
        //在D盘定义一个新文件test.txtE
        File file = new File("E:"+File.separator+"test.txt");
        //如果文件存在就删除,不存在就创建新的
        if(file.exists()){
            file.delete();
        }else{
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
