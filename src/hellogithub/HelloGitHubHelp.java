/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogithub;

/**
 *
 * @author earlie87
 */
public class HelloGitHubHelp {
	private String lstring = "";
	private int valuein = 0;

	public String getLstring() {
		return lstring;
	}

	public void setLstring(String lstring) {
		this.lstring = lstring;
	}
	public void prLstring(){
		System.out.println("lString is: " + lstring);
	}
	public void prValuein(){
		System.out.println("valuin is: " + valuein);
	}
	public int getValuein() {
		return valuein;
	}

	public void setValuein(int valuein) {
		this.valuein = valuein;
	}
	public HelloGitHubHelp(String in) {
		lstring = in;
		System.out.println("string in : " + in);
	}
	
}
