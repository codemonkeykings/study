package com.zac.spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟登录OA采集日志
 * 
 * @author LJ
 */
public class OALoginBySelenium {

    private static final Logger logger = LoggerFactory
        .getLogger(OALoginBySelenium.class);



    /**
     * 先导出文件，再模拟登录提交.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args){

            loginOA();
    }

    /**
     * 登录tower并完成相应事件
     * 
     * @throws Exception
     */
    public static void loginOA() {

        // 设置 chrome 的路径
        System.setProperty("webdriver.chrome.driver", "E:\\03_Drivers\\chromedriver.exe");

        // 创建一个 FireFox 的浏览器实例
        WebDriver driver = new ChromeDriver();

        // 处理相关网页
        String url = "http://oa.tsingsoft.com.cn:8088/";
        login(url, "lijian", "tsingsoft2013", driver,
                        By.name("userName"),
                        By.xpath("//input[@name='password']"),
                        By.xpath("//input[@type='image']"));
        try {
            handleEvent(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            // 关闭浏览器
            if(driver!=null){
                driver.close();
            }
        }
    }

    /**
     * 模拟登录
     * 
     * @param loginUrl
     *            请求链接
     * @param username
     *            用户名
     * @param password
     *            密码
     * @param webDriver
     *            模拟浏览器驱动
     * @param byUsername
     * @param bypassword
     * @param bySubmit
     */
    protected static void login(String loginUrl, String username,
                                String password, WebDriver webDriver, By byUsername, By bypassword,
                                By bySubmit) {

        // 重新定位iframe
        webDriver.navigate().to(loginUrl);

        try {
            Thread.sleep(300);
            // 输入用户名
            By b = byUsername;
            if (b == null) {
                return;
            }
            WebElement we = webDriver.findElement(b);
            if (we == null) {
                return;
            }
            we.clear();
            webDriver.findElement(b).sendKeys(username);

            // 输入密码
            webDriver.findElement(bypassword).clear();
            webDriver.findElement(bypassword).sendKeys(password);

            // 点击登录按钮
            webDriver.findElement(bySubmit).click();

            logger.debug("getCurrentUrl " + webDriver.getCurrentUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 处理事件
     * 
     * @param webDriver
     * @param jumpUrl
     * @throws Exception
     */
    public static void handleEvent(WebDriver webDriver) throws Exception {

        // 因为内容在frame页面中，所以要进入frame
        // 想要定位其中的iframe并切进去，可以通过如下代码：
        Thread.sleep(300);
        webDriver.switchTo().defaultContent();
        webDriver.switchTo().frame("mainFrame");
        webDriver.switchTo().frame("desktopFrame");
        
        // 提取日志列表页面内容
        // 通过xpath解析内容：//table[@class='ttTable']
        Thread.sleep(2000);
        WebElement wetfront = webDriver.findElement(By.xpath("//table[@class='ttTable'][2]/tbody"));
        Thread.sleep(2000);
        String a = wetfront.getText();
        System.out.println(a);
    }

}
