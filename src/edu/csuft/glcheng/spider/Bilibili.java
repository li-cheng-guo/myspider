package edu.csuft.glcheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Bilibili {

public static void main(String[] args) {
		
//		�������а�
		
		String url = "https://www.bilibili.com/ranking?spm_id_from=333.5.b_62616e6e65725f6c696e6b.1";
		
		try {
//			�����ҳ�е����� ��DOM ����
			Document doc = Jsoup.connect(url).get();
			
			Elements es = doc.select(".rank-list-wrap .rank-item");
			System.out.println(es.size());
			
			// ����һ��ӰƬ���б�
			ArrayList<Anime> list = new ArrayList<>();
			
			for (Element e : es) {
				Anime a = new Anime();
				// ÿһ��ӰƬ
				
				a.id = e.select(".detail span").last().text();
				a.title = e.select(".title").first().text();
				a.ranking = Integer.parseInt(e.select(".num").first().text());
				a.num = e.select(".detail span").first().text();
				a.score = Integer.parseInt(e.select(".pts div").text());
				a.link = e.select(".info a").attr("href");
				//a.poster = e.select("img").first().attr("src");
				
				System.out.println(a);
				list.add(a);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}		
		
}

