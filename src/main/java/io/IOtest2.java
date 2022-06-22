package io;

/**
 * Created by cuiyueyang on 2019/4/20.
 * System类对IO的支持
 */
public class IOtest2 {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"] is <"+args[i]+">");
        }
    }
}
