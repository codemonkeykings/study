package spring.basic.impl;

import spring.basic.CompactDisc;

/**
 * һ�仰���ܼ���.
 * 
 * @author ZhangGe
 * @version v1.0 2016��11��3��  ����3:12:16
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
