package Lc25_08.Lc25_08_5;

// [25.8.1] Ip地址无效化
public class IpLose_1108 {
    public static void main(String[] args) {
        //输入样例
        String address1 = "1.1.1.1";
        System.out.println(defangIPaddr(address1)); //输出 "1[.]1[.]1[.]1"
        String address2 = "255.100.50.0";
        System.out.println(defangIPaddr(address2)); //输出 "255[.]100[.]50[.]0"
    }

    //0ms   100%
    //3.todo 字符串直接替换，这里用到了 replace方法
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }


    //0ms   100%
    //2.todo 利用stringBuilder，这里用到了 append方法，可以stringBuilder和stringBuffer拼接用的
    /*public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }*/


    //7ms   0.55%
    //1.这种写法最好想出来，但很慢
    /*public static String defangIPaddr(String address) {
        String str = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str = str + "[.]";
                continue;
            }
            str += address.charAt(i);
        }
        return str;
    }*/

}
