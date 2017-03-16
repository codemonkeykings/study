package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.basic.CompactDisc;
import spring.basic.impl.CDPlayer;
import spring.basic.impl.SgtPeppers;

/**
 * CD播放器Spring Java Config显式配置类.
 * 
 * @author ZhangGe
 * @version v1.0 2016年11月1日  下午5:35:13
 */
@Configuration
public class CDPlayerExplicitConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    
    @Bean
    public CDPlayer cdPlayer1(CompactDisc compactDisc) {
    	return new CDPlayer(compactDisc);
    }
}
