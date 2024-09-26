package effectjava;

/**
 * <p>Description: </p>
 * <p>@date 2022/7/11 9:43</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/


public class Finalizer {

    public Finalizer() {
        System.out.println("诞生！");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收： 必死");
        throw new Exception("不想死");
    }

    /**
     * 查看内存使用情况： jmap -histo 8700|head -n 10
     * 强制处罚gc： jmap -histo:live 8700|head -n 10
     * @param str
     */
    public static void main(String str[]) {
        Finalizer finalizer = new Finalizer();
        finalizer = null;
        System.gc();
        System.out.println("死亡并不结束");
    }
}

