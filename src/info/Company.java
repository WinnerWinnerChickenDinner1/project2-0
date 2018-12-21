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
import view.Adminview;

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
	 * Ӱ��ֹͣԭ��û��ɣ�
	 */
	public Company(){}
	public String CLogin(String ID,String pw){
		//��˾��½
		try {
			if(ID.equals("") ){
				JOptionPane.showMessageDialog(null, "��δ�����˺�");
				return "no";
				}else
			if(pw.equals("")){
				JOptionPane.showMessageDialog(null, "��δ��������");
				return "no";
			}
			else{
			Client c = new Client();
		Company cm = c.Clogin(ID, pw);
		if(cm==null){
			JOptionPane.showMessageDialog(null, "��¼ʧ��");
			return "no";
		}
		else{
		JOptionPane.showMessageDialog(null, "��¼�ɹ�");
		return "ok";
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
		return "no";
	}
	public void setNewFilm(String Fname,String dir,String star,float price,String path){
		//��Ӱ����
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
		//��Ӱ�޸�
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
		//����Ӱ��
		
		try {
			Client c = new Client();
			c.Addhall(hall, Fname, starttime, playtime);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String downFilm(String Fid,String Fname,String content,float price){
		//��Ӱ�¼�
		//������
		System.out.println("�¼ܵ�Ӱ��"+Fid+","+Fname+","+content+""+price);
		JOptionPane.showMessageDialog(null, "�¼ܵ�Ӱ:"+Fid+"�ɹ�");
		return Fid;
	}
	public Object[][] showVip(){
		//�鿴��Ա�û�
		
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
		//���Υ�漰�����û�
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
		//�鿴���е�Ӱ
		//�����ȶ����������һ�����������
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
						System.out.println("��"+i+"ð����");
						for(int j = 0;j< indexfilm.length -1-i;j++){
							System.out.println("ð��λ��"+j);
							 
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
		//�鿴������Ʒ
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
		//ͣ��ĳ��Ʒ
	   
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
		//�ϼ�����Ʒ
		Client c = new Client();
		c.Addcommodity("C"+date.format(new Date()), Cname, price,content,path);
		JOptionPane.showMessageDialog(null, "������Ʒ�ɹ�");
	}
	
	public static byte[] writeimg(String path) {
		//�������,������Ͳ�����̫��,���̫���Ҫ������취������һ�δ���̶�����byte[]
		byte[] bytes = null;
		try {
			FileInputStream fin = new FileInputStream(new File(path));
			bytes = new byte[fin.available()];
			//���ļ�����д���ֽ����飬�ṩ���Ե�case
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
		//�޸���Ʒ��Ϣ
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
		//��ʾӰ��
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
	   //�޸�Ӱ��
	  try {
		String i = new Client().AmendHall(Hname, Fname, starttime, playtime);
		if(i.equals("ok")) {
			JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
		}else {
			JOptionPane.showMessageDialog(null, "������˵�С������");
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
 
   public void deletemoviehall(String pid) {
	//ɾ��Ӱ��
	   
	   try {
		   Client c = new Client();
		c.deletehall(pid);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
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
		//��ʾ������¼
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
