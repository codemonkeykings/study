package spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CD������Spring Java Config�Զ�װ��������.
 * 
 * @author ZhangGe
 * @version v1.0 2016��11��1��  ����4:48:06
 */
@Configuration
//�����ָ��basePackages(Ϊȱʡֵ)����Ĭ��ɨ��Config�����ڵİ�
//@ComponentScan(basePackages = {"spring.bean.impl"})
@ComponentScan("spring.bean.impl")
public class CDPlayerAutoWiringConfig {

}
