package com.ricardo.springmvc.lesson8.utils;

import java.io.FileOutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;










import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;



public class UserPDFView extends AbstractPdfView{



	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			com.lowagie.text.Document document,
			com.lowagie.text.pdf.PdfWriter Pdfwriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		PdfWriter.getInstance(document, new FileOutputStream("e://" + "createSamplePDF.pdf"));  
//
//		document.open();  
//		document.add(new Chunk("China"));  
//		document.add(new Chunk(" "));  
//		Font font = new Font(Font.HELVETICA, 6, Font.BOLD);  
//		Chunk id = new Chunk("chinese", font);  
//		id.setTextRise(6);  
//		document.add(id);  
//		document.add(Chunk.NEWLINE);  
//		  
//		document.add(new Chunk("Japan"));  
//		document.add(new Chunk(" "));  
//		Font font2 = new Font(Font.HELVETICA, 6, Font.BOLD);  
//		Chunk id2 = new Chunk("japanese", font2);   
//		id2.setTextRise(6);  
//		id2.setUnderline(0.2f, -2f);  
//		document.add(id2);  
//		document.add(Chunk.NEWLINE);  
//		  
//		//Phrase对象: a List of Chunks with leading  
//		document.newPage();  
//		document.add(new Phrase("Phrase page"));  
//		  
//		Phrase director = new Phrase();  
//		Chunk name = new Chunk("China");  
//		name.setUnderline(0.2f, -2f);  
//		director.add(name);  
//		director.add(new Chunk(","));  
//		director.add(new Chunk(" "));  
//		director.add(new Chunk("chinese"));  
//		director.setLeading(24);  
//		document.add(director);  
//		  
//		Phrase director2 = new Phrase();  
//		Chunk name2 = new Chunk("Japan");  
//		name2.setUnderline(0.2f, -2f);  
//		director2.add(name2);  
//		director2.add(new Chunk(","));  
//		director2.add(new Chunk(" "));  
//		director2.add(new Chunk("japanese"));  
//		director2.setLeading(24);  
//		document.add(director2);  
//		          
//		//Paragraph对象: a Phrase with extra properties and a newline  
//		document.newPage();  
//		document.add(new Paragraph("Paragraph page"));  
//		  
//		Paragraph info = new Paragraph();  
//		info.add(new Chunk("China "));  
//		info.add(new Chunk("chinese"));  
//		info.add(Chunk.NEWLINE);  
//		info.add(new Phrase("Japan "));  
//		info.add(new Phrase("japanese"));  
//		document.add(info);
	      Map<String,String> userData = (Map<String,String>) model.get("userData");

	      Table table = new Table(2);
	      table.addCell("No.");
	      table.addCell("User Name");

	      for (Map.Entry<String, String> entry : userData.entrySet()) {
	         table.addCell(entry.getKey());
	         table.addCell(entry.getValue());
	      }
	      document.add(table);
	}



}
