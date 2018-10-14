package string;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpression {

    public void getString(String str,String REGEX) {
        try {
            Matcher m = Pattern.compile(REGEX).matcher(str);
            //find()方法遍历
            while(m.find()) {
                System.out.println(m.group(0)+" : "+m.start()+" , "+m.end());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("正则表达式格式有误");
        }
    }

}
