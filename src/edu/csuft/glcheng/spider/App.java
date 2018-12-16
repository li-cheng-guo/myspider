package edu.csuft.glcheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 程序的入口
 * 
 * @author Y
 *
 */
public class App {
	
	// alt + / : 提示
	
	public static void main(String[] args) {
		
		// 目标 URL
		String url = "https://movie.douban.com/top250";
		
		// 使用 JSOUP 抓取文档
//		try {
//			Document doc = Jsoup.connect(url).get();
//			
//			Elements es = doc.select(".grid_view a+span");
//			System.out.println(es.size());
//			
//			for (Element e : es) {
//				System.out.println(e);
//			}
			
			try {
				Document doc = Jsoup.connect(url).get();
				
				Elements es = doc.select(".grid_view .item");
				System.out.println(es.size());
				
				// 创建一个影片的列表
				ArrayList<Film> list = new ArrayList<>();
				
				for (Element e : es) {
					Film f = new Film();
					// 每一部影片
					String id = e.select("em").text();
					Element t = e.select(".title").first();
					String info = e.select(".bd p").text();
					String rating = e.select(".star .rating_num").text();
					String num = e.select(".star span").last().text();
					String quote = e.select(".inq").text();
					String poster = e.select("img").attr("src");
					System.out.println(id+", "+t.text()+", "+info+", "+rating + ", " + num.subSequence(0, num.length()-3)+", "+quote+", "+poster);
				
//					f.id;
//					f.title;
					list.add(f);
				}
			
//			String title = doc.title();
//			String data = doc.data();
//			
//			System.out.println(title);
//			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
