package com.ricardo.springmvc.lesson6.handlers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson6.bean.RSSModel;


@Controller
public class RSSController {
	
	@RequestMapping(value="/rssfeed",method=RequestMethod.GET)
	public ModelAndView getFeedInRss(){
		 List<RSSModel> items = new ArrayList<RSSModel>();

		 RSSModel content  = new RSSModel();
	      content.setTitle("Spring教程");
	      content.setUrl("http://www.yiibai/spring");
	      content.setSummary("Spring tutorial summary...");
	      content.setCreateDate(new Date());
	      items.add(content);

	      RSSModel content2  = new RSSModel();
	      content2.setTitle("Spring MVC教程");
	      content2.setUrl("http://www.yiibai/spring_mvc");
	      content2.setSummary("Spring MVC tutorial summary...");
	      content2.setCreateDate(new Date());
	      items.add(content2);

	      ModelAndView mav = new ModelAndView();
	      mav.setViewName("rssViewer");
	      mav.addObject("feedContent", items);
	      
	      return mav;
	}
	
	
}
