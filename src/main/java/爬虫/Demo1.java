package 爬虫;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/30 10:22 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */

/**
 * 爬取起点小说
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        //需求: 爬取起点中文网中某一部小说的全部(免费的章节)内容
        //1. 确定首页URL: 重生柯南当侦探小说的第一章的URL
        String indexUrl = "https://read.qidian.com/chapter/nKVO7k6YUptmzDX0o03xsg2/6Ko8rgNY4EBp4rPq4Fd4KQ2";
        //创建一个输出流,将爬到的小说以txt形式保存在硬盘
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\cuiyueyang\\Desktop\\linkcld\\a.txt")));

        while (true) {
            //2. 发送请求, 获取数据
            //2.1 创建httpClient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //2.2 设置请求方式
            HttpGet httpGet = new HttpGet(indexUrl);
            //2.3 设置请求参数 和请求头
            httpGet.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari/537.36");
            //2.4 发送请求, 获取响应
            CloseableHttpResponse response = httpClient.execute(httpGet);
            //2.5 获取数据
            String html = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(html);
            //3. 解析数据:
            Document document = Jsoup.parse(html);
            System.out.println(document);
            //获得本章的章节名称 并输出到文本中
            Elements chapterName = document.select(".j_chapterName");
            System.out.println(chapterName.text());
            bw.write(chapterName.text());
            bw.newLine();
            bw.flush();
            //获得本章的小说内容 并输出到文本中
            Elements pEl = document.select("[class=read-content j_readContent] p");
            for (Element p : pEl) {
                bw.write(p.text());
                System.out.println(p.text());
                bw.newLine();
                bw.flush();
            }
            //下一章内容:
            Elements aEl = document.select("#j_chapterNext[href*=chapter]");
            if (aEl == null || aEl.size() == 0) {
                break;
            }
            Object nextUrl = aEl.attr("href");
            indexUrl = "http:" + nextUrl;
            System.out.println(indexUrl);
            //4. 关闭httpClient对象
            httpClient.close();
            break;
        }
    }
}
