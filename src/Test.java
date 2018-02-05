import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void  dome(){

        System.out.println("holle world");
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("你好");
        list.add("明天");
        list.add("后天 " +
                "大后天");
        Test.dome();

        System.out.println(list);
    }
}
