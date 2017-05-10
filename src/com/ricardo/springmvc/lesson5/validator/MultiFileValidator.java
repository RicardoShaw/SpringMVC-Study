/**   
  * @Title: MultiFileValidator.java 
  * @Package com.ricardo.springmvc.lesson5.validator 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月10日 下午3:44:19 
  * @version V1.0   
*/
package com.ricardo.springmvc.lesson5.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ricardo.springmvc.lesson5.bean.FileModel;
import com.ricardo.springmvc.lesson5.bean.MultiFileModel;

/** 
 * @ClassName: MultiFileValidator 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月10日 下午3:44:19 
 *  
 */
public class MultiFileValidator implements Validator {

	/* (非 Javadoc) 
	 * <p>Title: supports</p> 
	 * <p>Description: </p> 
	 * @param clzz
	 * @return 
	 * @see org.springframework.validation.Validator#supports(java.lang.Class) 
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return MultiFileModel.class.isAssignableFrom(clazz);
	}

	/* (非 Javadoc) 
	 * <p>Title: validate</p> 
	 * <p>Description: </p> 
	 * @param obj
	 * @param errors 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors) 
	 */
	@Override
	public void validate(Object obj, Errors errors) {
		MultiFileModel multiFiles = (MultiFileModel) obj;
		
		int index=0;
		
		for(FileModel file : multiFiles.getFiles()){
			if(file.getFile()!=null){
				if (file.getFile().getSize() == 0) {
					errors.rejectValue("files["+index+"].file", "missing.file");
				}
			}
			index++;
		}
	}

}
