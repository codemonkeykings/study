package com.zac.spider;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

/**
 * HttpClient & Jsoup Demo.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月21日  下午8:53:38
 */
@SuppressWarnings("deprecation")
public class HttpClientDemo {

    private static final String URL = "http://www.itcast.cn/";
    
    @SuppressWarnings("resource")
    public static void basicInfo() {
        //创建httpclient对象
        HttpClient client = new DefaultHttpClient();
        //设置响应时间和代理服务器
        client.getParams()
            .setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 5000)
            .setParameter(CoreConnectionPNames.SO_TIMEOUT, 5000)
            .setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("221.204.246.116", 3128));

        HttpGet get = new HttpGet(URL);
        try {
            //相应请求
            HttpResponse response = client.execute(get);
            //将获取的entity转成字符串
            String htmlContext = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(htmlContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        basicInfo();
    }
}
