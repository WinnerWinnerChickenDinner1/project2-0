package info;

import java.io.Serializable;
import java.util.Date;

public class ManagerHall implements Serializable{
	private String Hname;
	private String Fname;
	private Date starttime ;
	private int playtime;
	private int x;
	private int y;
	private String PlayID;
	public String getHname() {
		return Hname;
	}
	public void setHname(String hname) {
		Hname = hname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public int getPlaytime() {
		return playtime;
	}
	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getPlayID() {
		return PlayID;
	}
	public void setPlayID(String playID) {
		PlayID = playID;
	}
	
	
}
