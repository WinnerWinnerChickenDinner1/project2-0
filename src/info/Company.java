package info;

import java.awt.JobAttributes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import tool.Client;

public class Company implements Serializable{
	private String ID;
	private String pw;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Company(String id,String pw) {
		// TODO Auto-generated constructor stub
		this.ID = id;
		this.pw = pw;
	}
	/*
	 * 影厅停止原因（没完成）
	 */
	public Company(){}
	public void CLogin(String ID,String pw){
		//公司登陆
		try {
			if(ID.equals("") || pw.equals("")){
				JOptionPane.showMessageDialog(null, "您未输入账号或密码");	
				}
			else{
			Client c = new Client();
		Company cm = c.Clogin(ID, pw);
		if(cm==null){
			JOptionPane.showMessageDialog(null, "登录失败");
		}
		else{
		JOptionPane.showMessageDialog(null, "登录成功");
		}
			}
		}
			

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setNewFilm(String Fname,String dir,String star,float price,String path){
		//电影上新
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmm");
		try {
			new Client().AddFilm("F"+date.format(new Date()), Fname, dir, star, path, price);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setLastFilm(String Fname,String dir,String star,float price,String path){
		//电影修改
		try {
			if(path != null) {
			new Client().updateFilm(Fname, dir, star, path, price);
			}else {
				new Client().updateFilm2(Fname, dir, star, price);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void manageHall(String Fname,Object[] hall,Date starttime,int playtime){
		//新增影厅
		
		try {
			Client c = new Client();
			c.Addhall(hall, Fname, starttime, playtime);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String downFilm(String Fid,String Fname,String content,float price){
		//电影下架
		//无网络
		System.out.println("下架电影："+Fid+","+Fname+","+content+""+price);
		JOptionPane.showMessageDialog(null, "下架电影:"+Fid+"成功");
		return Fid;
	}
	public Object[][] showVip(){
		//查看会员用户
		
			Object[][] viplist = null;
			try {
				viplist = new Client().showVip();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return viplist;
		
	}
	public void deleteVip(String id){
		//清除违规及废弃用户
		try {
			new Client().downVip(id);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object[][] showFilm(){
		//查看所有电影
		//根据热度排序后生成一个有序的数组
				try {
					List<Film> flist = new Client().showFilm();
					Object[][] indexfilm = new Object[flist.size()][5];
					for(int i = 0;i<flist.size();i++) {
						indexfilm[i][0] = i+1;
						indexfilm[i][1] = flist.get(i).getFname();
						indexfilm[i][2] = flist.get(i).getDirector();
						indexfilm[i][3] = flist.get(i).getStar();
						indexfilm[i][4] = flist.get(i).getHot();
					}
					for(int i = 0;i<indexfilm.length;i++){
						System.out.println("第"+i+"冒泡中");
						for(int j = 0;j< indexfilm.length -1-i;j++){
							System.out.println("冒泡位置"+j);
							 
							if(Integer.parseInt(indexfilm[j][4].toString()) < Integer.parseInt(indexfilm[j+1][4].toString())){
								Object[] o = {indexfilm[j][1],indexfilm[j][2],indexfilm[j][3],indexfilm[j][4]};
								indexfilm[j][1] = indexfilm[j+1][1];
								indexfilm[j][2] = indexfilm[j+1][2];
								indexfilm[j][3] = indexfilm[j+1][3];
								indexfilm[j][4] = indexfilm[j+1][4];
								indexfilm[j+1][1] = o[0];
								indexfilm[j+1][2] = o[1];
								indexfilm[j+1][3] = o[2];
								indexfilm[j+1][4] = o[3];
							}
					}
					}
					for(int i = 0;i<indexfilm.length;i++){
						System.out.print(indexfilm[i][0]+"\t");
						System.out.print(indexfilm[i][1]+"\t");
						System.out.print(indexfilm[i][2]+"\t");
						System.out.print(indexfilm[i][4]+"\t\n");
					}
					return indexfilm;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}
	public Object[][] showCommodity(){
		//查看所有商品
		Object[][] Comlist = null;
		try {
			Comlist = new Client().showCommodity();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Comlist;
	}
	public void deleteCommodity(String Cid){
		//停售某商品
	   
	try {
		Client c;
		c = new Client();
		c.Deletecommodity(Cid);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
		
	}
	public void Addcommodity(String Cname,float price,String content,String path) throws UnknownHostException, IOException{
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmm");
		//上架新商品
		Client c = new Client();
		c.Addcommodity("C"+date.format(new Date()), Cname, price,content,path);
		JOptionPane.showMessageDialog(null, "增添商品成功");
	}
	
	public static byte[] writeimg(String path) {
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
	public void AmendCommodity(String Cname,float price,String content,String path) throws IOException{
		//修改商品信息
		try {if(path != null) {
			new Client().Amendcommodity(Cname, price, content, path);
			}else {
				new Client().Amendcommodity2(Cname, price, content);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Object[][] showmoviehall(){
		//显示影厅
		Object[][] halllist = null;
		
		try {
			halllist = new Client().showhall();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return halllist;
	}
   public String Amendmoviehall(String Hname,String Fname,Date starttime,int playtime){
	   //修改影厅
	  try {
		String i = new Client().AmendHall(Hname, Fname, starttime, playtime);
		if(i.equals("ok")) {
			JOptionPane.showMessageDialog(null, "修改成功");
		}else {
			JOptionPane.showMessageDialog(null, "好像出了点小问题呢");
		}
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  return Hname;  
   }
 
   public String deletemoviehall(String Hname) {
	//删除影厅
	   
	   try {
		   Client c = new Client();
		c.deletehall(Hname);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		  return Hname;
	
}
   public List<Object[]> findhall(){
	   try {
		return new Client().findHall();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   public void Deleteflim(String Fid) {
	   try {
		new Client().Deleteflim(Fid);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public Object[][] showoperation(){
		//显示操作记录
		Object[][] operationlist = null;
		
		try {
			operationlist = new Client().showoperation();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return operationlist;
	}

   public void saveReason(String reason,String happened) {
	   try {
		new Client().reason(reason, happened);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public Object[][] showReason(){
	   try {
		return new Client().showreason();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
   }
}
