package com.sat.inte;

import java.io.IOException;

import javax.jws.*;

@WebService
public interface IReadFile {
	@WebMethod
	public String retCont(String nfile) throws IOException;
}
