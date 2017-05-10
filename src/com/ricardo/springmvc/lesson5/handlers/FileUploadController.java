package com.ricardo.springmvc.lesson5.handlers;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson5.bean.FileModel;


@Controller
public class FileUploadController {
	
	@Autowired
	ServletContext context;
	private static Logger logger = Logger.getLogger(FileUploadController.class);
	
	
	@RequestMapping(value="fileUpload",method=RequestMethod.GET)
	public ModelAndView addfileUpload(){
		return new ModelAndView("/file/fileUpload","filecommand",new FileModel());
	}
	
	@RequestMapping(value="fileUpload",method=RequestMethod.POST)
	public String fileUpload(@ModelAttribute("filecommand")@Valid FileModel file,BindingResult result,Model model) throws IOException{
		if(result.hasErrors()){
			logger.error("validatation errors");
			return "/file/fileUpload";
		}
		logger.info("Fetching file");
		MultipartFile multipartfile = file.getFile();
		String uploadPath = context.getRealPath("")+File.separator+"WEB-INF"+ File.separator + "temp" + File.separator;
		logger.info("message:       "+uploadPath);
        FileCopyUtils.copy(file.getFile().getBytes(), new File(uploadPath+file.getFile().getOriginalFilename()));
        
        String fileName = multipartfile.getOriginalFilename();
        model.addAttribute("fileName", fileName);
		
		return "/file/result";
	}
	
}
