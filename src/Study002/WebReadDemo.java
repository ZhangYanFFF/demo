package Study002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebReadDemo {
    /*
    读取网页源码
     */
    public void webReadMethod(){
        String urlStr = "https://blog.csdn.net/dkbnull/article/details/49495521"; // 网址
        try {
            //创建一个url对象来指向要采集信息的网址
            URL url = new URL(urlStr);
            //将读取到的字节转化为字符
            InputStreamReader inStrRead = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
            //读取InputStreamReader转化成的字符
            BufferedReader bufRead = new BufferedReader(inStrRead);
            //读到的内容不为空
            while (bufRead.readLine() != null) {
                System.out.println(bufRead.readLine());
            }
            bufRead.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    main函数
     */
    public static void main(String[] args) {
        WebReadDemo webReadDemo = new WebReadDemo();
        webReadDemo.webReadMethod();
    }
}
