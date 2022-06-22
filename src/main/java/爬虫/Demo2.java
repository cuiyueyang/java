package 爬虫;

import org.apache.http.client.config.RequestConfig;
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
 * <p>Date: 2021/6/30 10:49 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */

/**
 * 爬取笔趣阁小说
 */
public class Demo2 {
    /**
     * 此案例是保存到本地的，如果保存到数据库，需要，首页，作者信息，简介，评论，点赞，收藏，阅读数量
     * 爬小说也是很慢的，所以更新小说的时候尽量只更新最新章节，这样可以提升效率
     * 那么历史小说的数据就是很有意义的
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        //需求: 爬取笔趣阁中某一部小说的全部内容
        //1. 确定首页URL: 三寸人间 （这里可以把最新章节地址存到数据库中，以追加的形式只读取最新章节）
        String indexUrl = "https://www.xbiquge.la/10/10489/4534454.html";
        //创建一个输出流,将爬到的小说以txt形式保存在硬盘   true表示追加
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\cuiyueyang\\Desktop\\linkcld\\b.txt", true)));
        while (true) {
            try {
            //2. 发送请求, 获取数据
            //2.1 创建httpClient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //2.2 设置请求方式
            HttpGet httpGet = new HttpGet(indexUrl);
            //2.3 设置请求参数 和请求头
            httpGet.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari/537.36");
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(5000).setConnectionRequestTimeout(1000)
                    .setSocketTimeout(5000).build();
            httpGet.setConfig(requestConfig);
            //2.4 发送请求, 获取响应
            CloseableHttpResponse response = null;
            response = httpClient.execute(httpGet);
            //2.5 获取数据
            String html = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(html);
            //3. 解析数据:
            Document document = Jsoup.parse(html);
            System.out.println(document);
            //获得本章的章节名称 并输出到文本中
            Elements chapterName = document.select("[class=bookname] h1");
            System.out.println(chapterName.text());
            bw.write(chapterName.text());
            bw.newLine();
            bw.flush();
            //获得本章的小说内容 并输出到文本中
            Elements pEl = document.select("[id=content]");
            for (Element p : pEl) {
                bw.write(p.text());
                System.out.println(p.text());
                bw.newLine();
                bw.flush();
            }
            Object nextUrl = null;
            //下一章内容:
            Elements aEl = document.select("[class=bottem2] a");
            if (aEl == null || aEl.size() == 0) {
                break;
            } else {
                for (int i = 0; i < aEl.size(); i++) {
                    if (i == 3) {
                        nextUrl = aEl.get(i).attr("href");
                        break;
                    }
                }
            }
            indexUrl = "https://www.xbiquge.la" + nextUrl;
            System.out.println(indexUrl);
            //4. 关闭httpClient对象
            httpClient.close();
            //访问过快，可能导致流量被限，控制访问频率 2s访问一次
            Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + e.getMessage());
                continue;
            }
        }
    }
}
