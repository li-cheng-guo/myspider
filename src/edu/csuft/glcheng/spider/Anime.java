package edu.csuft.glcheng.spider;

public class Anime {
	
	/**
	 * 动漫名称
	 */
	String title;
	
	/**
	 * 观看次数
	 */
	String num;
	
	/**
	 *综合 评分
	 */
	int score;
	
	/**
	 * 上传者的id
	 */
	String id;
	
	/**
	 * 排名
	 */
	int ranking;
	
	/**
	 * 观看链接
	 */
	String link;

	@Override
	public String toString() {
		return "Anime [title=" + title + ", num=" + num + ", score=" + score + ", id=" + id + ", ranking=" + ranking
				+ ", link=" + link + "]";
	}
	
	
//	/**
//	 * 海报
//	 */
//	String poster;
//
//	@Override
//	public String toString() {
//		return "Anime [title=" + title + ", num=" + num + ", score=" + score + ", id=" + id + ", ranking=" + ranking
//				+ ", link=" + link + ", poster=" + poster + "]";
//	}
	

}
