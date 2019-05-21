package webdrivertest.stackoverflow;

import org.junit.*;
import pages.BaseTest.BaseTest;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStack extends BaseTest {

    @Test
    public void CheckFeatured() {
        assertTrue("Fea_less_than_300",
                mainPageStack.Fea_less_than_300.isDisplayed());
    }

    @Test
    public void CheckMoney() {
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        String account = mainPageStack.money.getText();
        Matcher matcher = pat.matcher(account);
        while (matcher.find()) {
            int t = Integer.parseInt(matcher.group());
            Assert.assertTrue("Цена меньше чем 60 ", t > 60);
        }

    }
}