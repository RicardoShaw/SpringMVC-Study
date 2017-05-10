package com.ricardo.springmvc.lesson6.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.ricardo.springmvc.lesson6.bean.RSSModel;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;

public class UserRSSView extends AbstractRssFeedView {


	   @Override
	   protected void buildFeedMetadata(Map<String, Object> model, Channel feed,
	      HttpServletRequest request) {

	      feed.setTitle("YiibaiPoint Dot Com");
	      feed.setDescription("Java Yiibai and Examples");
	      feed.setLink("http://www.yiibai.com");

	      super.buildFeedMetadata(model, feed, request);
	   }

	   @Override
	   protected List<Item> buildFeedItems(Map<String, Object> model,
	      HttpServletRequest request, HttpServletResponse response) throws Exception {

	      List<RSSModel> listContent = (List<RSSModel>) model.get("feedContent");
	      List<Item> items = new ArrayList<Item>(listContent.size());

	      for(RSSModel tempContent : listContent ){

	         Item item = new Item();

	         Content content = new Content();
	         content.setValue(tempContent.getSummary());
	         item.setContent(content);

	         item.setTitle(tempContent.getTitle());
	         item.setLink(tempContent.getUrl());
	         item.setPubDate(tempContent.getCreateDate());

	         items.add(item);
	      }

	      return items;        
	   }

}
