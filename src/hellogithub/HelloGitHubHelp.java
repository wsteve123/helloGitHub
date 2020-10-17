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
	private String localString = "";
	private int localInt = 0;

	public String getLstring() {
		return localString;
	}

	public void setLstring(String lstring) {
		this.localString = lstring;
	}
	public void prLstring(){
		System.out.println("lString is: " + localString);
	}
	public void prValuein(){
		System.out.println("valuin is: " + localInt);
	}
	public int getValuein() {
		return localInt;
	}

	public void setValuein(int valuein) {
		this.localInt = valuein;
	}
	public HelloGitHubHelp(String in) {
		localString = in;
		System.out.println("string in : " + in);
	}
	
}
