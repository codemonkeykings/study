package spring.basic.impl;

import org.springframework.stereotype.Component;

import spring.basic.CompactDisc;

/**
 * һ�仰���ܼ���.
 * 
 * @author ZhangGe
 * @version v1.0 2016��11��1��  ����4:43:12
 */
@Component
public class SgtPeppers implements CompactDisc {
    
//    private String title = "Сƻ��";
//    private String artist = "�����ֵ�";
    
    private String title;
    private String artist;
    
    public SgtPeppers() {
	}
    
    public SgtPeppers(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

    @Override
    public void play() {
        System.out.println("��" + artist +"�ݳ���" + title + "��");
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
