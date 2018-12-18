package tool;

import info.Company;
import info.Employee;
import player.PlayerMain;

import java.awt.JobAttributes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;



	public class Client extends Thread{
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
		
		static ObjectOutputStream oos;
		static ObjectInputStream ois;
		Socket s;
		public Client() throws UnknownHostException, IOException{
			s = new Socket("localhost",51512);
			 oos = new ObjectOutputStream(s.getOutputStream());
		     ois = new ObjectInputStream(s.getInputStream());
		}
		
		public String Elogin(String ID,String pw) throws IOException, ClassNotFoundException{//员工登录
			oos.writeInt(ELOGIN);
			oos.flush();
			oos.writeUTF(ID);
			oos.flush();
			oos.writeUTF(pw);
			oos.flush();
			return ois.readUTF();	
		}
		public Company Clogin(String ID,String pw) throws IOException, ClassNotFoundException{//公司登录
			oos.writeInt(CLOGIN);
			oos.flush();
			oos.writeUTF(ID);
			oos.flush();
			oos.writeUTF(pw);
			oos.flush();
			return (Company)ois.readObject();
		}
		
		public String Transaction(String ID,String name,String remarks) throws IOException, ClassNotFoundException{//VIP办理
			oos.writeInt(TRANSACTION);
			oos.flush();
			oos.writeUTF(ID);
			oos.flush();
			oos.writeUTF(name);
			oos.flush();
			oos.writeUTF(remarks);
			oos.flush();
			return ois.readUTF();
			
		}
			public String MakeOperationNote(String ID, String name, 
				String operation) throws IOException {//操作记录
			// TODO Auto-generated method stub
			oos.writeInt(NOTE);
			oos.flush();
			oos.writeUTF(ID);
			oos.flush();
			oos.writeUTF(name);
			oos.flush();
			oos.writeUTF(operation);
			oos.flush();
			return ois.readUTF();
		}
			
			public float addMoney(String id,float addmoney) throws IOException{//充值
				oos.writeInt(ADDMON);
				oos.flush();
				oos.writeUTF(id);
				oos.flush();
				oos.writeFloat(addmoney);
				oos.flush();
				return ois.readFloat();
				
			}
			
			public Object[][] showVip(){//展示所有vip用户
				Object[][] vips = null;
				try {
					oos.writeInt(SHOWVIP);
					oos.flush();
					List viplist = (List) ois.readObject();
					vips = new Object[viplist.size()][4];
					for(int i = 0;i<viplist.size();i++){
						Object[] strs = (Object[]) viplist.get(i);
						vips[i][0] = strs[0];
						vips[i][1] = strs[1];
						vips[i][2] = strs[2];
						vips[i][3] = strs[3];
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return vips;
			}
			
			public void downVip(String id){//删除VIP
				try {
					oos.writeInt(DOWNVIP);
					oos.flush();
					oos.writeUTF(id);
					oos.flush();
					String mind = ois.readUTF();
					if(mind.equals("OK")){
						JOptionPane.showMessageDialog(null, "删除成功");
					}else{
						JOptionPane.showMessageDialog(null, "删除失败");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public int getTicket(String pid,String hid,String fname,int hot,int x,int y){//员工为顾客购票
				try {
					oos.writeInt(GETTICKET);
					oos.flush();
					oos.writeUTF(pid);
					oos.flush();
					oos.writeUTF(hid);
					oos.flush();
					oos.writeUTF(fname);
					oos.flush();
					oos.writeInt(hot);
					oos.flush();
					oos.writeInt(x);
					oos.flush();
					oos.writeInt(y);
					oos.flush();
					return ois.readInt();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return -1;
				
			}
			public float getVip(String ID)throws IOException{//查找会员
				oos.writeInt(GETVIP);
				oos.writeUTF(ID);
				oos.flush();
				return ois.readFloat();
			}
			public void getCommodity(String Cid,float Price,int num) throws IOException{//购买商品
				oos.writeInt(GETCOMMODITY);
				oos.flush();
				oos.writeUTF(Cid);
				oos.flush();
				oos.writeFloat(Price);
				oos.flush();
				oos.writeInt(num);
				oos.flush();
				if(ois.readUTF().equals("ok")) {
					JOptionPane.showMessageDialog(null,"购买商品:"+Cid+"成功");
				}
			    
			}
			
			public String getCommcover(String cid) {
				String path = "commimg.jpg";
				try {
					oos.writeInt(GETCOMMCOVER);
					oos.flush();
					oos.writeUTF(cid);
					oos.flush();
					byte[] img = (byte[]) ois.readObject();
					buff2Image(img, path);
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
				return path;
			}
			
			public String getFilmcover(String fname) {
				String path = "filmimg.jpg";
				try {
					oos.writeInt(GETFILMCOVER);
					oos.flush();
					oos.writeUTF(fname);
					oos.flush();
					byte[] img = (byte[]) ois.readObject();
					buff2Image(img, path);
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
				return path;
			}
			
			public String getTop4cover(String fname,int index) {
				String path = "ftop"+index+".jpg";
				try {
					oos.writeInt(GETFILMCOVER);
					oos.flush();
					oos.writeUTF(fname);
					oos.flush();
					byte[] img = (byte[]) ois.readObject();
					buff2Image(img, path);
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
				return path;
			}
			
			
			public List managerHall(){
				try {
					oos.writeInt(MANAGEHALL);
					oos.flush();
					return (List)ois.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
			
			public List showFilm(){//展示所有电影
				try {
					oos.writeInt(SHOWFILM);
					oos.flush();
					return (List)ois.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
			public Object[][] showCommodity(){//展示所有商品
				Object[][] Commodity = null;
				try {
					oos.writeInt(SHOWCOMMODITY);
					oos.flush();
					List Comlist = (List) ois.readObject();
					Commodity = new Object[Comlist.size()][5];
					for(int i = 0;i<Comlist.size();i++){
						Object[] strs = (Object[]) Comlist.get(i);
						Commodity[i][0] = strs[0];
						Commodity[i][1] = strs[1];
						Commodity[i][2] = strs[2];
						Commodity[i][3] = strs[3];
						Commodity[i][4] = strs[4];
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Commodity;
			}	
			public String Addcommodity(String Cid,String Cname,float price,String content,String path) throws IOException{//添加商品
				oos.writeInt(ADDCOMMODITY);
				oos.flush();
				oos.writeUTF(Cid);
				oos.flush();
				oos.writeUTF(Cname);
				oos.flush();
				oos.writeFloat(price);
				oos.writeUTF(content);
				oos.flush();
				oos.writeObject(writeimg(path));
				oos.flush();
				return ois.readUTF();
				
			}
			public void Deletecommodity(String Cid) throws IOException{//删除商品
				oos.writeInt(DELETECOMMODITY);
				oos.flush();
				oos.writeUTF(Cid);
				oos.flush();
				String i= ois.readUTF();
				if(i=="ok"){
					JOptionPane.showMessageDialog(null, "删除失败");
				}
				else{
					JOptionPane.showMessageDialog(null, "删除成功");
				}
			}
			public void Amendcommodity(String Cname,float price,String content,String path ) throws IOException{//修改商品
				oos.writeInt(AMENDCOMMODITY);
				oos.flush();
				oos.writeUTF(Cname);
				oos.flush();
				oos.writeFloat(price);
				oos.flush();
				oos.writeUTF(content);
				oos.flush();
				oos.writeObject(writeimg(path));
				oos.flush();
				String i;
				i=ois.readUTF();
				if(i!="ok") {
					JOptionPane.showMessageDialog(null, "修改成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
			
			public void Amendcommodity2(String Cname,float price,String content) throws IOException{//修改商品
				oos.writeInt(AMENDCOMMODITY);
				oos.flush();
				oos.writeUTF(Cname);
				oos.flush();
				oos.writeFloat(price);
				oos.flush();
				oos.writeUTF(content);
				oos.flush();
				oos.writeObject(null);
				oos.flush();
				String i;
				i=ois.readUTF();
				if(i!="ok") {
					JOptionPane.showMessageDialog(null, "修改成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
			
			public int[][] getSelectedSeat(String pid) {
				try {
					oos.writeInt(GETSELECTEDSEAT);
					oos.flush();
					oos.writeUTF(pid);
					oos.flush();
					return (int[][])ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
			public Object[][] showhall() {//显示所有影厅
				Object[][] hall = null;
				try {
					oos.writeInt(SHOWHALL);
					oos.flush();
					List halllist = (List) ois.readObject();
					hall = new Object[halllist.size()][4];
					for(int i = 0;i<halllist.size();i++){
						Object[] strs = (Object[]) halllist.get(i);
						hall[i][0] = strs[0];
						hall[i][1] = strs[1];
						hall[i][2] = strs[2];
						hall[i][3] = strs[3];
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return hall;
			}	
			public void deletehall(String Hname) throws IOException{//删除影厅
				oos.writeInt(DELETEHALL);
				oos.flush();
				oos.writeUTF(Hname);
				oos.flush();
				String i;
				i=ois.readUTF();
				if(i!="ok"){
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else{
					JOptionPane.showMessageDialog(null, "删除失败");
				}	
			}
			public void Addhall(Object[] Hname,String Fname,Date starttime,int playtime) throws IOException{//增加影厅
				oos.writeInt(ADDHALL);
				oos.flush();
				oos.writeObject(Hname);
				oos.flush();
				oos.writeUTF(Fname);
				oos.flush();
				oos.writeObject(starttime);
				oos.flush();
				oos.writeInt(playtime);
				oos.flush();
				String i ;
				i = ois.readUTF();
				if(i!="ok"){
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else{
					JOptionPane.showMessageDialog(null, "添加失败");
				}
			}
			
			public List findHall() {
				
				try {
					oos.writeInt(FINDHALL);
					oos.flush();
					return (List) ois.readObject();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
			public String AmendHall(String Hname,String Fname,Date starttime,int playtime ) throws IOException {
				oos.writeInt(AMENDHALL);
				oos.flush();
				oos.writeUTF(Hname);
				oos.flush();
				oos.writeUTF(Fname);
				oos.flush();
				oos.writeObject(starttime);
				oos.flush();
				oos.writeInt(playtime);
				oos.flush();
				String i;
				i = ois.readUTF();
				return i;
			}
			
			public void AddFilm(String Fid,String Fname,String director,String star,String path,float price) throws IOException{//增加电影
				oos.writeInt(ADDFILM);
				oos.flush();
				oos.writeUTF(Fid);
				oos.flush();
				oos.writeUTF(Fname);
				oos.flush();
				oos.writeUTF(director);
				oos.flush();
				oos.writeUTF(star);
				oos.flush();
				byte[] b = writeimg(path);
				oos.writeObject(b);
				oos.flush();
				oos.writeFloat(price);
				oos.flush();
				String i ;
				i = ois.readUTF();
				if(i!="ok"){
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else{
					JOptionPane.showMessageDialog(null, "添加失败");
				}
			}
			
			public void updateFilm(String Fname,String director,String star,String path,float price) throws IOException{//增加电影
				oos.writeInt(UPDFILM);
				oos.flush();
				oos.writeUTF(Fname);
				oos.flush();
				oos.writeUTF(director);
				oos.flush();
				oos.writeUTF(star);
				oos.flush();
				byte[] b = writeimg(path);
				oos.writeObject(b);
				oos.flush();
				oos.writeFloat(price);
				oos.flush();
				String i ;
				i = ois.readUTF();
				if(i!="ok"){
					JOptionPane.showMessageDialog(null, "修改成功");
				}
				else{
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
			
			public void updateFilm2(String Fname,String director,String star,float price) throws IOException{//增加电影
				oos.writeInt(UPDFILM);
				oos.flush();
				oos.writeUTF(Fname);
				oos.flush();
				oos.writeUTF(director);
				oos.flush();
				oos.writeUTF(star);
				oos.flush();
				oos.writeObject(null);
				oos.flush();
				oos.writeFloat(price);
				oos.flush();
				String i ;
				i = ois.readUTF();
				if(i!="ok"){
					JOptionPane.showMessageDialog(null, "修改成功");
				}
				else{
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
			static void buff2Image(byte[] b,String tagSrc) throws Exception
		     {
				if(b != null) {
		         FileOutputStream fout = new FileOutputStream(tagSrc);
		         //将字节写入文件
		         fout.write(b);
		         fout.close();
				}else {
					JOptionPane.showMessageDialog(null, "没有封面");
				}
		     }
			 
			 private byte[] writeimg(String path) {
					//可能溢出,简单起见就不考虑太多,如果太大就要另外想办法，比如一次传入固定长度byte[]
					byte[] bytes = null;
					try {
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
			 public void Deleteflim(String Fid) throws IOException {//删除电影
				 oos.writeInt(DELETEFLIM);
				 oos.flush();
				 oos.writeUTF(Fid);
				 oos.flush();
				 String i ;
				 i = ois.readUTF();
				 if(i!="ok") {
					 JOptionPane.showMessageDialog(null, "删除成功");
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "删除失败");
				 }
			 }
			 public float consume(float free,String vip,float money) throws IOException {
				 oos.writeInt(COMSUME);
				 oos.flush();
				 oos.writeFloat(free);
				 oos.flush();
				 oos.writeUTF(vip);
				 oos.flush();
				 oos.writeFloat(money);
				 oos.flush();
				 return ois.readFloat();
			 }
			 public Object[][] showoperation() {//显示所有操作记录
					Object[][] operation = null;
					try {
						oos.writeInt(SHOWOPERATION);
						oos.flush();
						List operationlist = (List) ois.readObject();
						operation = new Object[operationlist.size()][4];
						for(int i = 0;i<operationlist.size();i++){
							Object[] strs = (Object[]) operationlist.get(i);
							operation[i][0] = strs[0];
							operation[i][1] = strs[1];
							operation[i][2] = strs[2];
							operation[i][3] = strs[3];
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return operation;
			 }
			 
			 public String getTrailer(String fname) {
				String path = "trailer.mp4";
				 try {
					oos.writeInt(GETTRAILER);
					oos.flush();
					oos.writeUTF(fname);
					oos.flush();
					byte[] video = (byte[]) ois.readObject();
					if(video != null) {
						buff2Image(video, path);
						new Thread(new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								new PlayerMain().init(path,fname);
								new Employee().saveWorknote("播放"+fname+"的预告片");
							}
						}).start();
						
					}else {
						JOptionPane.showMessageDialog(null, "找不到预告片");
					}
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
				 return path;
			 }
			 public void reason(String reason,String happened) throws IOException {
				 oos.writeInt(REASON);
				 oos.flush();
				 oos.writeUTF(reason);
				 oos.flush();
				 oos.writeUTF(happened);;
				 oos.flush();
				 String i ;
				 i = ois.readUTF();
				 if(i!="ok") {
					 JOptionPane.showMessageDialog(null, "添加原因成功");
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "添加原因失败");
				 }
			 }
			 
			 public Object[][] showreason(){
				 Object[][] reason = null;
					try {
						oos.writeInt(SHOWREASON);
						oos.flush();
						List reasonlist = (List) ois.readObject();
						reason = new Object[reasonlist.size()][3];
						for(int i = 0;i<reasonlist.size();i++){
							Object[] strs = (Object[]) reasonlist.get(i);
							reason[i][0] = strs[0];
							reason[i][1] = strs[1];
							reason[i][2] = strs[2];
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return reason;
			 }
			
		public static void main(String[] args) {
			try {
				new Client();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
		
		
		
	}
