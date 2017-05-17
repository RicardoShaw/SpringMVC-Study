package com.ricardo.springmvc.lesson8.utils;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.ricardo.springmvc.lesson7.bean.User;

public class UserExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		String fileName = "用户列表excel.xls";  
//        response.setCharacterEncoding("UTF-8");  
//        response.setContentType("application/ms-excel");  
//        response.setHeader("Content-Disposition", "inline; filename="+new String(fileName.getBytes(),"iso8859-1"));  
//        OutputStream outputStream = response.getOutputStream();
        
        List<User> userList = (List<User>) model.get("users");
        // 产生Excel表头
        HSSFSheet sheet = (HSSFSheet) workbook.createSheet("基本信息");
        HSSFRow header = sheet.createRow(0);
        // 产生标题列
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("名字");
        HSSFCellStyle cellStyle = (HSSFCellStyle) workbook.createCellStyle();
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("mm/dd/yyyy"));
        int rowNumber = 1;
        for (User user : userList) {
            HSSFRow row = sheet.createRow(rowNumber++);
            // 产生标题列
            row.createCell(0).setCellValue(user.getId());
            row.createCell(1).setCellValue(user.getName());
        }
//        workbook.write(outputStream);
//        outputStream.flush();
//        outputStream.close();
	}

	

}
