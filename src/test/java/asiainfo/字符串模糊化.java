package asiainfo;


/**
 * Created by cuiyueyang on 2019/12/22.
 */
public class 字符串模糊化 {

    public static String memberNameFuzzification(String memberName){
        String memberName1 = memberName.substring(0);
        String memberName2 = memberName.substring(0,2);
        System.out.println(memberName.length());
        if(2 == memberName.length()){
            System.out.println(222);
            memberName = memberName1+"*";
        }
        if(3 == memberName.length()){
            System.out.println(333);
            memberName = memberName1+"**";
        }
        if(memberName.length()>3){
            StringBuffer str = new StringBuffer();
            for(int i=0;i<memberName.length()-2;i++){
                str = str.append("*");
            }
            memberName = memberName2+str;
        }
        return memberName;
    }
    public static void main(String[] args){

        String memberName1 = "张三";
        String memberName2 = "张三金";
        String memberName3 = "张三里斯";
        String memberName4 = "张三李四王五";
        memberName1 = memberName1.replace(" ","");
        memberName2 = memberName2.replace(" ","");
        memberName3 = memberName3.replace(" ","");
        memberName4 = memberName4.replace(" ","");

        memberName1 = memberNameFuzzification(memberName1);
        memberName2 = memberNameFuzzification(memberName2);
        memberName3 = memberNameFuzzification(memberName3);
        memberName4 = memberNameFuzzification(memberName4);
        System.out.println(memberName1);
        System.out.println(memberName2);
        System.out.println(memberName3);
        System.out.println(memberName4);
    }
}
