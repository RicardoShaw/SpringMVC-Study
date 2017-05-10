/**   
  * @Title: MultiFileUploadController.java 
  * @Package com.ricardo.springmvc.lesson5.handlers 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月10日 下午3:55:53 
  * @version V1.0   
*/
package com.ricardo.springmvc.lesson5.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson5.bean.FileModel;
import com.ricardo.springmvc.lesson5.bean.MultiFileModel;
import com.ricardo.springmvc.lesson5.validator.MultiFileValidator;

/** 
 * @ClassName: MultiFileUploadController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月10日 下午3:55:53 
 *  
 */

@Controller
public class MultiFileUploadController {
	
		@Autowired
		ServletContext context;
	
		@Autowired
		MultiFileValidator multiFileValidator;
		
		/*
		 * @InitBinder(objectName) 在jsp文件中出现的需要处理的对象文件数据
		 * 通过与Binder绑定Validator然后对objectName所代表的对象进行数据验证
		 */
		@InitBinder("multifileModel")
		protected void initBinderMultiFileModel(WebDataBinder binder){
			binder.setValidator(multiFileValidator);
		}
		
		
		@RequestMapping(value="multifileUpload",method=RequestMethod.GET)
		public ModelAndView multifileUploadPage(){	
			//"/file/multifileUpload是路径地址.ModelAndView 或者 是String  都是返回资源路径
			return new ModelAndView("/file/multifileUpload","multifileModel",new MultiFileModel());
		}
		
		@RequestMapping(value="multifileUpload",method=RequestMethod.POST)
		public String multifileUploadView(@ModelAttribute("multifileModel") @Valid MultiFileModel multifileModel,BindingResult result,Model model) throws FileNotFoundException, IOException{
			
			if (result.hasErrors()) {
				System.out.println("validation errors in multi upload");
				return "/file/multifileUpload";
			} else {
				System.out.println("Fetching files");
				List<String> fileNames = new ArrayList<String>();
				// Now do something with file...
				String uploadPath = context.getRealPath("")+File.separator+"WEB-INF"+ File.separator + "temp" + File.separator;
				for (FileModel bucket : multifileModel.getFiles()) {
					File file=new File(uploadPath + bucket.getFile().getOriginalFilename());
					FileCopyUtils.copy(bucket.getFile().getBytes(), file);
					fileNames.add(file.getAbsolutePath());
				
				}

				model.addAttribute("fileNames", fileNames);
				return "/file/multiresult";
			}

			
		}
		
}
