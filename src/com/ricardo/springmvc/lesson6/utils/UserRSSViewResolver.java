/**   
  * @Title: UserRSSViewResolver.java 
  * @Package com.ricardo.springmvc.lesson6.utils 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月10日 下午10:06:12 
  * @version V1.0   
*/
package com.ricardo.springmvc.lesson6.utils;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

/** 
 * @ClassName: UserRSSViewResolver 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月10日 下午10:06:12 
 *  
 */
public class UserRSSViewResolver implements ViewResolver {

	/* (非 Javadoc) 
	 * <p>Title: resolveViewName</p> 
	 * <p>Description: </p> 
	 * @param viewName
	 * @param locale
	 * @return
	 * @throws Exception 
	 * @see org.springframework.web.servlet.ViewResolver#resolveViewName(java.lang.String, java.util.Locale) 
	*/
	@Override
	public View resolveViewName(String viewName, Locale locale)
			throws Exception {
		UserRSSView view = new UserRSSView();	
		return view;
	}



}
