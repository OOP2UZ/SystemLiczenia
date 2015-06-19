package Servlet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Test implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String name = "Test.class";

	public String getName() {
		return name;
	}

	
}
