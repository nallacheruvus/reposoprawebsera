package com.sat.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.jws.*;

import com.sat.inte.IReadFile;

@WebService(endpointInterface = "com.sat.inte.IReadFile")
public class IReadFileImpl implements IReadFile {
	
private static final String paths="C:\\DelhiOfficeFiles\\SopraSteria\\"; 

	public String retCont(String nfile) throws IOException {
		return retContents(paths+nfile);
	}
	
	private static String retContents(String a) throws IOException {
		File f=new File(a);
		String conts="";
		FileInputStream fis =new FileInputStream(f);
		int i=0;
		while(( i=fis.read())!=-1) {
			conts+=(char)i;
		}
		fis.close();
		return conts;
	}
}
