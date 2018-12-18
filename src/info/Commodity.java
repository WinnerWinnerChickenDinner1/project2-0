package info;

import java.io.File;
import java.io.IOException;

import tool.Client;



public class Commodity {
	private String Cid;
	private String Cname;
	private String content;
	private String cover;
	private int hot;
	private float price;
	public Commodity(String cid,String cname,String content,int hot,float price){
		this.Cid = cid;
		this.Cname = cname;
		this.content = content;
		this.hot = hot;
		this.price = price;
	}
	public Commodity(){}
	public void upImg(File f){
		//将字节流转为图片,存放在本地

     try {
    	 Client c = new Client();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
