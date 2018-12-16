package edu.csuft.glcheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * ��������
 * 
 * @author Y
 *
 */
public class App {
	
	// alt + / : ��ʾ
	
	public static void main(String[] args) {
		
		// Ŀ�� URL
		String url = "https://movie.douban.com/top250";
		
		// ʹ�� JSOUP ץȡ�ĵ�
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
				
				// ����һ��ӰƬ���б�
				ArrayList<Film> list = new ArrayList<>();
				
				for (Element e : es) {
					Film f = new Film();
					// ÿһ��ӰƬ
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
