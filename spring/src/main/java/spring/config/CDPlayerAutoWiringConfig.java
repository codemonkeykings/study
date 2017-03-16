package spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CD播放器Spring Java Config自动装备配置类.
 * 
 * @author ZhangGe
 * @version v1.0 2016年11月1日  下午4:48:06
 */
@Configuration
//如果不指定basePackages(为缺省值)，则默认扫描Config类所在的包
//@ComponentScan(basePackages = {"spring.bean.impl"})
@ComponentScan("spring.bean.impl")
public class CDPlayerAutoWiringConfig {

}
