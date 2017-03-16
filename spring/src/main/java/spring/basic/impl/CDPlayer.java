package spring.basic.impl;

import spring.basic.CompactDisc;

/**
 * 一句话功能简述.
 * 
 * @author ZhangGe
 * @version v1.0 2016年11月3日  下午3:12:16
 */
public class CDPlayer {

    private CompactDisc cd;
    
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
    
    public void play() {
        cd.play();
    }
}
