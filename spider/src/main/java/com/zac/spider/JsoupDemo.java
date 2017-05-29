package com.zac.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月21日  下午11:37:20
 */
public class JsoupDemo {
    
    private static final String URL = "http://www.itcast.cn/";
    
    public static void baseInfo() {
        try {
            Document docs = Jsoup.connect(URL).get();
            Elements elements = docs.select(".nav_txt a");
            Elements texts = elements.select("span");
            for (Element element : elements) {
                System.out.println(element.attr("href"));
            }
            for (Element text : texts) {
                System.out.println(text.text());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        baseInfo();
    }

}
