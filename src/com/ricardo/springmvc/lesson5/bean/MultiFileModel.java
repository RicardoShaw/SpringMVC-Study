package com.ricardo.springmvc.lesson5.bean;

import java.util.ArrayList;
import java.util.List;

public class MultiFileModel {
	List<FileModel> files = new ArrayList<FileModel>();
	
	public MultiFileModel(){
		files.add(new FileModel());
		files.add(new FileModel());
		files.add(new FileModel());
	}

	public List<FileModel> getFiles() {
		return files;
	}

	public void setFiles(List<FileModel> files) {
		this.files = files;
	}
	
}
