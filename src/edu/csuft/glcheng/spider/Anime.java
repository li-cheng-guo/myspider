package edu.csuft.glcheng.spider;

public class Anime {
	
	/**
	 * ��������
	 */
	String title;
	
	/**
	 * �ۿ�����
	 */
	String num;
	
	/**
	 *�ۺ� ����
	 */
	int score;
	
	/**
	 * �ϴ��ߵ�id
	 */
	String id;
	
	/**
	 * ����
	 */
	int ranking;
	
	/**
	 * �ۿ�����
	 */
	String link;

	@Override
	public String toString() {
		return "Anime [title=" + title + ", num=" + num + ", score=" + score + ", id=" + id + ", ranking=" + ranking
				+ ", link=" + link + "]";
	}
	
	
//	/**
//	 * ����
//	 */
//	String poster;
//
//	@Override
//	public String toString() {
//		return "Anime [title=" + title + ", num=" + num + ", score=" + score + ", id=" + id + ", ranking=" + ranking
//				+ ", link=" + link + ", poster=" + poster + "]";
//	}
	

}
