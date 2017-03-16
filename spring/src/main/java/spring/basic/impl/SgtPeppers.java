package spring.basic.impl;

import org.springframework.stereotype.Component;

import spring.basic.CompactDisc;

/**
 * 一句话功能简述.
 * 
 * @author ZhangGe
 * @version v1.0 2016年11月1日  下午4:43:12
 */
@Component
public class SgtPeppers implements CompactDisc {
    
//    private String title = "小苹果";
//    private String artist = "筷子兄弟";
    
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
        System.out.println("由" + artist +"演唱《" + title + "》");
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
