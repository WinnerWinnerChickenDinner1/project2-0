package tool;

import info.Company;
import info.Employee;
import info.Film;
import info.ManagerHall;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import tool.Datahandle;
import info.Employee;



public class Server implements Runnable{
	final int ELOGIN =1;
	final int CLOGIN =2;
	final int BUFF2IMG = 3;
	final int TRANSACTION = 4;
	final int NOTE = 5;
	final int ADDMON = 6;
	final int SHOWVIP = 7;
	final int DOWNVIP = 8;
	final int GETTICKET = 9;
	final int GETCOMMODITY = 10;
	final int ADDCARD = 11;
	final int SHOWFILM = 12;
	final int MANAGEHALL = 13;
	final int SHOWCOMMODITY = 14;
	final int DELETECOMMODITY = 15;
	final int GETVIP = 16;
	final int ADDCOMMODITY = 17;
	final int GETSELECTEDSEAT = 18;
	final int AMENDCOMMODITY = 19;
	final int SHOWHALL = 20;
	final int DELETEHALL = 21;
	final int ADDHALL = 22;
	final int FINDHALL = 23;
	final int AMENDHALL = 24;
	final int ADDFILM = 25;
	final int DELETEFLIM = 26;
	final int UPDFILM = 27;
	final int GETCOMMCOVER = 28;
	final int GETFILMCOVER = 29;
	final int COMSUME = 30;
	final int SHOWOPERATION = 31;
	final int GETTRAILER = 32;
	final int REASON = 33;
	final int SHOWREASON = 34;
	
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
	public Server() throws IOException, ClassNotFoundException, SQLException {
		
		 ServerSocket ss = new ServerSocket(51512);
		 System.out.println(ss);
		 while(true){
		 s = ss.accept();
		 System.out.println(s);
		 new Thread(this).start();
		 }
		}
public void  ELogin() throws IOException, SQLException, ClassNotFoundException{//员工登录
	String ID = ois.readUTF();
	String pw = ois.readUTF();
	String sql = "select * from employee where ID ='"+ID+"' and pw ='"+pw+"'";
	ResultSet rs = Datahandle.getStatement().executeQuery(sql);
	String name =null;
	if(rs.next()){
		name= rs.getString(3);
		oos.writeUTF(name);
} 
	oos.writeUTF("");
		 oos.flush();
		 }
public void CLogin() throws IOException, SQLException, ClassNotFoundException{//公司登录
	String ID = ois.readUTF();
	String pw =ois.readUTF();
	String sql = "select * from company where ID ='"+ID+"' and pw ='"+pw+"'";
	ResultSet rs = Datahandle.getStatement().executeQuery(sql);
	Company cm=null;
	if(rs.next()){
		cm =new Company(rs.getString(1),rs.getString(2));
		
} 
	oos.writeObject(cm);
		 oos.flush();
}

public void addmoney(){//充值
	try {
		String id = ois.readUTF();
		float addmon = ois.readFloat();
		String sql1="select money from vip where ID ='"+id+"'";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql1);
		if(rs.next()){
			addmon = addmon + rs.getFloat("money");
			String sql2="update vip set money='"+addmon+"'where ID ='"+id+"'";
			Datahandle.getStatement().executeUpdate(sql2);
		}else{
			addmon = -1;
		}
		oos.writeFloat(addmon);
		oos.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void TRANSACTION(){//办理vip
	try {
		String id = ois.readUTF();
		String name = ois.readUTF();
		String remarks = ois.readUTF();
		String sql = "insert into vip values('"+id+"','"+name+"','"+remarks+"',0)";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
		s.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void MakeOpreationNote() throws IOException, SQLException, ClassNotFoundException{//操作记录
	String id = ois.readUTF();
	String name = ois.readUTF();
	Timestamp time = new Timestamp(System.currentTimeMillis());
	System.out.println(time);
	String operation = ois.readUTF();
	String sql = "insert into operation values('"+id+"','"+name+"','"+time+"','"+operation+"')";
	Datahandle.getStatement().executeUpdate(sql);
	oos.writeUTF("okay");
	oos.flush();
	s.close();
}


public void showvip(){//展示所有vip
	try {
		String sql = "select * from vip";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		List viplist = new ArrayList();
		while(rs.next()){
			String id = rs.getString(1);
			String name = rs.getString(2);
			String remarks = rs.getString(3);
			float money = rs.getFloat(4);
			Object[] vip = {id,name,remarks,money};
			viplist.add(vip);
		}
		oos.writeObject(viplist);
		oos.flush();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	

	public void downvip(){//删除vip
		try {
			String id = ois.readUTF();
			String sql ="delete from vip where id='"+id+"'";
			Datahandle.getStatement().executeUpdate(sql);
			oos.writeUTF("OK");
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getTicket(){//员工为顾客买票
		try {
			String pid = ois.readUTF();
			String hid = ois.readUTF();
			String Fname = ois.readUTF();
			int hot=ois.readInt();
			int x = ois.readInt();
			int y = ois.readInt();
			String sql1 = "select * from Seat where PlayID='"+pid+"'";
			try {
				ResultSet rs = Datahandle.getStatement().executeQuery(sql1);
				while(rs.next()) {
					if((x==rs.getInt("x")) && (y==rs.getInt("y"))) {
						hot = -1;
						oos.writeInt(hot);
						oos.flush();
						break;
					}
				}
				if(hot != -1) {
					String sql2 = "insert into Seat values('"+hid+"','"+pid+"',"+x+","+y+")";
					String sql3 = "update film set Hot='"+(hot+1)+"'where Fname ='"+Fname+"'";
					Datahandle.getStatement().executeUpdate(sql2);
					Datahandle.getStatement().executeUpdate(sql3);
					oos.writeInt(hot+1);
					oos.flush();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void getVip() throws IOException, SQLException, ClassNotFoundException{//查找vip
		String id = ois.readUTF();
		String sql = "select money from vip where id='"+id+"'";
		ResultSet rs =Datahandle.getStatement().executeQuery(sql);
		if(rs.next()){
			oos.writeFloat(rs.getFloat("money"));
			oos.flush();
		}else{
			oos.writeFloat(-1);
			oos.flush();
		}
	}
	
	public void managerHall(){
		try {
			//获取影厅安排数据
			String sql = "select * from hallmanage";
			ResultSet rs =Datahandle.getStatement().executeQuery(sql);
			List managerhall = new ArrayList();
			while(rs.next()){
				ManagerHall m = new ManagerHall();
				m.setFname(rs.getString(2));
				m.setHname(rs.getString(1));
				m.setStarttime(rs.getDate(3));
				m.setPlaytime(rs.getInt(4));
				m.setX(rs.getInt(5));
				m.setY(rs.getInt(6));
				m.setPlayID(rs.getString(7));
				managerhall.add(m);
			}
			oos.writeObject(managerhall);
			oos.flush();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getCommodity()throws IOException {//购买商品
		// TODO Auto-generated method stub
		String Cid = ois.readUTF();
		float Price = ois.readFloat();
		int num = ois.readInt();
		int hot = -1;
		String sql = "select hot from commodity where Cid='"+Cid+"'";		
		try {
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			rs.next();
			hot = rs.getInt("hot");
			String sql1 =  "update commodity set hot='"+(hot+num)+"' where Cid='"+Cid+"'";
			Datahandle.getStatement().executeUpdate(sql1);
			oos.writeUTF("ok");
			oos.flush();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void showFilm(){
		try {
			String sql = "select * from film";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			List flist = new ArrayList<Film>();
			while(rs.next()){
				Film f = new Film();
				f.setFid(rs.getString(1));
				f.setFname(rs.getString(2));
				f.setDirector(rs.getString(3));
				f.setCover(rs.getString(5));
				f.setHot(rs.getInt(6));
				f.setPrice(rs.getFloat(7));
				f.setStar(rs.getString(4));
				flist.add(f);
			}
			oos.writeObject(flist);
			oos.flush();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showCommodity() throws SQLException, ClassNotFoundException, IOException{
		String sql = "select * from commodity";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		List Comlist = new ArrayList();
		while(rs.next()){
			String Cid = rs.getString(1);
			String Cname = rs.getString(2);
			String content = rs.getString(4);
			float price = rs.getFloat(5);
			String hot = rs.getString(6);
			Object[] commodity = {Cid,Cname,content,price,hot};
			Comlist.add(commodity);
		}
		
		oos.writeObject(Comlist);
		oos.flush();
	}
	public void Addcommodity() throws IOException, SQLException, ClassNotFoundException{//添加商品
		String Cid = ois.readUTF();
		String Cname = ois.readUTF();
		float price = ois.readFloat();
		String content = ois.readUTF();
		byte[] img = (byte[]) ois.readObject();
		String path = "E:/commodityimg/"+Cname+".jpg";
		try {
			buff2Image(img,path );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql="insert into commodity values('"+Cid+"','"+Cname+"','"+path+"','"+content+"',"+price+",0)";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	public void Deletecommodity() throws IOException, SQLException, ClassNotFoundException{
		String Cid = ois.readUTF();
		String sql = "delete from commodity where Cid='"+Cid+"'";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	
	private void getSelectedSeat() {
		try {
			String pid = ois.readUTF();
			String sql = "select * from Seat where PlayID='"+pid+"'";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			List l = new ArrayList();
			while(rs.next()) {
				int[] i = new int[2];
				i[0] = rs.getInt(3);
				i[1] = rs.getInt(4);
				l.add(i);
			}
			int[][] ii = new int[l.size()][2];
			for(int i=0;i<ii.length;i++) {
				int[] now = (int[])l.get(i);
				ii[i][0] = now[0];
				ii[i][1] = now[1];
			}
			oos.writeObject(ii);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Amendcommodity() throws IOException, ClassNotFoundException, SQLException {//修改商品
		String Cname = ois.readUTF();
		float price = ois.readFloat();
		String content = ois.readUTF();
		byte[] img = (byte[]) ois.readObject();
		String path = "E:/commodityimg/"+Cname+".jpg";
		if(img != null) {
			try {
				buff2Image(img, path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String sql = "update commodity set Price = "+price+", content ='"+content+"' where Cname = '"+Cname+"'" ;
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	public void showhall() throws SQLException, ClassNotFoundException, IOException{
		String sql = "select * from hallmanage";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		List halllist = new ArrayList();
		while(rs.next()){
			String Hname= rs.getString(1);
			String Fname = rs.getString(2);
			Timestamp time = rs.getTimestamp(3);
			SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String starttime = simpledate.format(time);
			int x = rs.getInt(5);
			int y = rs.getInt(6);
			int a =(x)*(y); 
			Object[] hallmanage = {Hname,Fname,starttime,a};
			halllist.add(hallmanage);
		}
		
		oos.writeObject(halllist);
		oos.flush();
	}
	public void deletehall() throws IOException, SQLException, ClassNotFoundException{
		String Hname = ois.readUTF();
		String sql = "delete from hallmanage where Hname='"+Hname+"'";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	public void addhall() throws IOException, SQLException, ClassNotFoundException{//增加影厅
		Object[] Hall = (Object[]) ois.readObject();
		String Fname = ois.readUTF();
		Date starttime = (Date) ois.readObject();
		int playtime = ois.readInt();
		Timestamp time = new Timestamp(starttime.getTime());
		SimpleDateFormat setdate = new SimpleDateFormat(Hall[0]+"yyyyMMddHHmm");
		String sql = "insert into hallmanage values('"+Hall[0]+"','"+Fname+"','"+time+"','"+playtime+"',"+Hall[1]+","+Hall[2]+",'"+setdate.format(starttime)+"')";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	private void findhall() {
		try {
			String sql = "select * from hall";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			List halllist = new ArrayList();
			while(rs.next()){
				String Hid= rs.getString(1);
				int x = rs.getInt(2);
				int y = rs.getInt(3);
				Object[] hall = {Hid,x,y};
				halllist.add(hall);
			}
			
			oos.writeObject(halllist);
			oos.flush();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Amendhall() throws ClassNotFoundException, IOException, SQLException {//修改影厅
		String Hname  = ois.readUTF();
		String Fname = ois.readUTF();
		Date starttime = (Date)ois.readObject();
		int playtime = ois.readInt();
		Timestamp time = new Timestamp(starttime.getTime());
		String sql = "update hallmanage set Fname = '"+Fname+"', starttime = '"+time+"' where Hname='"+Hname+"'  " ;
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
		
	}
	private void addFilm() {
		try {
			String fid = ois.readUTF();
			String fname = ois.readUTF();
			String dirctor = ois.readUTF();
			String star = ois.readUTF();
			byte[] b = (byte[]) ois.readObject();
			String path = "E:/filmimg/"+fname+".jpg";
			buff2Image(b, path);
			float price = ois.readFloat();
			String sql = "insert into film values('"+fid+"','"+fname+"','"+dirctor+"','"+star+"','"+path+"',0,"+price+")";
			Datahandle.getStatement().executeUpdate(sql);
			oos.writeUTF("ok");
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void updFilm() {
		try {
			String fname = ois.readUTF();
			String dirctor = ois.readUTF();
			String star = ois.readUTF();
			String path = "E:/filmimg/"+fname+".jpg";
			byte[] b = (byte[]) ois.readObject();
			if(b != null) {
				buff2Image(b, path);
			}
			float price = ois.readFloat();
			String sql = "update film set director = '"+dirctor+"', star = '"+star+"', price = '"+price+"' where fname='"+fname+"'  ";
			Datahandle.getStatement().executeUpdate(sql);
			oos.writeUTF("ok");
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Deleteflim() throws IOException, ClassNotFoundException, SQLException {
		String Fname = ois.readUTF();
		String sql = "delete from film  where Fname='"+Fname+"'";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
		
	}
	
	public void getCommcover() {
		try {
			String cid = ois.readUTF();
			String sql = "select cover from commodity where Cid='"+cid+"'";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			rs.next();
			String path = rs.getString("cover");
			byte[] img = writeimg(path);
			oos.writeObject(img);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getFilmcover() {
		try {
			String fname = ois.readUTF();
			String sql = "select cover from film where Fname='"+fname+"'";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			rs.next();
			String path = rs.getString("cover");
			byte[] img = writeimg(path);
			oos.writeObject(img);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void comsume() {
		try {
			float free = ois.readFloat();
			String vip = ois.readUTF();
			float money = ois.readFloat();
			try {
				System.out.println(vip);
				String sql = "select money from vip where ID='"+vip+"'";
				ResultSet rs= Datahandle.getStatement().executeQuery(sql);
				if(rs.next()) {
				money = rs.getFloat("money");
				money = money-free;
				}
				String sql1 = "update vip set money = '"+money+"'where ID='"+vip+"'";
				 Datahandle.getStatement().executeUpdate(sql1);
				 oos.writeFloat(money);
				 oos.flush();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showoperation() throws SQLException, ClassNotFoundException, IOException{
		String sql = "select * from operation";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		List operationlist = new ArrayList();
		while(rs.next()){
			String ID= rs.getString(1);
			String name = rs.getString(2);
			Timestamp time = rs.getTimestamp(3);
			SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String operation = rs.getString(4);
			Object[] operation1 = {ID,name,time,operation};
			operationlist.add(operation1);
		}
		
		oos.writeObject(operationlist);
		oos.flush();
	}
	public void getTrailer() throws IOException, ClassNotFoundException, SQLException {
		String fname = ois.readUTF();
		String sql = "select * from trailer where TNAME = '"+fname+"'";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		if(rs.next()) {
			String path = rs.getString("Path");
			byte[] video = writeimg(path);
			oos.writeObject(video);
			oos.flush();
		}
		
	}
	public void reason() throws IOException, ClassNotFoundException, SQLException {
		String reason = ois.readUTF();
		String happened = ois.readUTF();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		String sql = "insert into reason values('"+reason+"','"+time+"','"+happened+"')";
		Datahandle.getStatement().executeUpdate(sql);
		oos.writeUTF("ok");
		oos.flush();
	}
	
	public void showReason() throws SQLException, ClassNotFoundException, IOException{
		String sql = "select * from reason";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		List reasonlist = new ArrayList();
		while(rs.next()){
			String reason= rs.getString(1);
			String happened = rs.getString(3);
			Timestamp time = rs.getTimestamp(2);
			Object[] operation1 = {reason,happened,time};
			reasonlist.add(operation1);
		}
		
		oos.writeObject(reasonlist);
		oos.flush();
	}
	public void run() {
		// TODO Auto-generated method stub
		 try {
			ois = new ObjectInputStream(s.getInputStream()); 
			 oos = new ObjectOutputStream(s.getOutputStream());
			 int i ;
			 i = ois.readInt();
			 if(i==ELOGIN){
				 ELogin();		
			 }
			 if(i==CLOGIN){
				 CLogin();
			 }
			if (i==TRANSACTION){
				TRANSACTION();
			}
			if(i==NOTE){
				MakeOpreationNote();
			}
			if(i==ADDMON){
				addmoney();
			}
			if(i==SHOWVIP){
				showvip();
			}
			if(i==DOWNVIP){
				downvip();
			}
			if(i==GETVIP){
				getVip();
			}
			if(i==GETCOMMODITY){
				getCommodity();
			}
			if(i==MANAGEHALL){
				managerHall();
			}
			if(i==SHOWFILM){
				showFilm();
			}
			if(i==SHOWCOMMODITY){
				showCommodity();
			}
			if(i==ADDCOMMODITY){
				Addcommodity();
			}
			if(i==DELETECOMMODITY){
				Deletecommodity();
			}
			if(i==GETSELECTEDSEAT) {
				getSelectedSeat();
			}
			if(i==GETTICKET) {
				getTicket();
			}
			if(i==AMENDCOMMODITY){
				Amendcommodity();
			}
			if(i==SHOWHALL){
				showhall();
			}
			if(i==DELETEHALL){
				deletehall();
			}
			if(i==ADDHALL){
				addhall();
			}
			if(i==FINDHALL){
				findhall();
			}
			if(i==AMENDHALL) {
				Amendhall();
			}
			if(i==ADDFILM) {
				addFilm();
			}
			if(i==DELETEFLIM) {
				Deleteflim();
			}
			if(i==UPDFILM) {
				updFilm();
			}
			if(i==GETCOMMCOVER) {
				getCommcover();
			}
			if(i==GETFILMCOVER) {
				getFilmcover();
			}
			if(i==COMSUME) {
				comsume();
			}
			if(i==SHOWOPERATION) {
				showoperation();
			}
			if(i==GETTRAILER) {
				getTrailer();
			}
			if(i==REASON) {
				reason();
			}
			if(i==SHOWREASON) {
				showReason();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 	
	}
	
	

	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void buff2Image(byte[] b,String tagSrc) throws Exception
    {
        FileOutputStream fout = new FileOutputStream(tagSrc);
        //将字节写入文件
        fout.write(b);
        fout.close();
    }
	 
	 private byte[] writeimg(String path) {
			//可能溢出,简单起见就不考虑太多,如果太大就要另外想办法，比如一次传入固定长度byte[]
			byte[] bytes = null;
			try {
				System.out.println(path);
				FileInputStream fin = new FileInputStream(new File(path));
				bytes = new byte[fin.available()];
				//将文件内容写入字节数组，提供测试的case
				fin.read(bytes);
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return bytes;
		}
	}
