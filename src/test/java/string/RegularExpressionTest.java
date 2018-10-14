package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    @Test
    // a 电话号码，例如（609）555-1234
    public void getString() {
        RegularExpression regularExpression = new RegularExpression();
        regularExpression.getString("(800) 857-5307 ojbk (989) 278-6267 hk7878","\\([\\d]{3}\\) [\\d]{3}\\-[\\d]{4}");
    }

    @Test
    //日期，ip地址
    public void getString1() {
        RegularExpression regularExpression = new RegularExpression();
        regularExpression.getString("192.26.155.241 ojbk 1999.82.2820.11 ojbk 199.199.199.199","([\\d]{1,3}\\.){3}[\\d]{1,3}");
    }
}