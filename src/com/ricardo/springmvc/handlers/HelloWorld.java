package com.ricardo.springmvc.handlers;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* Controller ��ʾ��spring�Ŀ�����*/
@Controller
public class HelloWorld {
	private static Logger logger = Logger.getLogger(HelloWorld.class);
	/**
	 * 1.ʹ��RequestMappingע����ӳ�������URL
	 * 2.����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ
	 * ͨ��prefix+returnValue+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ,Ȼ���ת������
	 * "/WEB-INF/views/success.jsp
	 */
	@RequestMapping("hello")
	public String hello(){
		System.out.println("###############helloworld#######################");
        // ��¼debug�������Ϣ  
        logger.debug("This is debug message.");  
        // ��¼info�������Ϣ  
        logger.info("This is info message.");  
        // ��¼error�������Ϣ  
        logger.error("This is error message."); 
		return "success";
	}
	
//	@RequestMapping("/image/helloworld")
//	public String Ihello(){
//		System.out.println("xixi");
//        // ��¼debug�������Ϣ  
//        logger.debug("This is debug message.");  
//        // ��¼info�������Ϣ  
//        logger.info("This is info message.");  
//        // ��¼error�������Ϣ  
//        logger.error("This is error message."); 
//		return "success";
//	}

}
