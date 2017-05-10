package com.ricardo.springmvc.lesson5.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ricardo.springmvc.lesson5.bean.FileModel;


public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return FileModel.class.isAssignableFrom(clazz);
	}//end supports()

	@Override
	public void validate(Object obj, Errors errors) {
		FileModel file =  (FileModel) obj;
		
		if(file.getFile()!=null){
			if (file.getFile().getSize() == 0) {
				errors.rejectValue("file", "missing.file");
			}//end if
		}//end if
	}//end validate()

}
