package info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import tool.Client;

public class Film implements Serializable{
	private String Fid;
	private String Fname;
	private String director;
	private String cover;
	private int Hot;
	private float price;
	private String star;
	private String trailer;
	
	public void buff2img(String path){
		//将字节流转为图片,存放在本地
		new Company().writeimg(path);
	}

	public String getFid() {
		return Fid;
	}

	public void setFid(String fid) {
		Fid = fid;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public int getHot() {
		return Hot;
	}

	public void setHot(int hot) {
		Hot = hot;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	
	
	}

