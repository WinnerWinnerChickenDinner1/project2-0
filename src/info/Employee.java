package info;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tool.Client;
import view.Shopview;

public class Employee implements Serializable{
	public static String ID;
	private String pw;
	public static String name;
	public Employee(String ID,String pw,String name) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.pw = pw;
		this.name = name;
	}
	
	public Employee(){}
	
	public float getTicket(String pid,String hid,String fname,int hot,String starttime,int[][] waitsize,float free,String vipid,boolean isvip,float money) {
		// TODO Auto-generated method stub
		//员工为顾客购票（购票后hot属性+1 在服务端更改）
		int index = 0;
		for(int i = 0;i<5;i++){
			if(waitsize[i][0]==1){
				index = index + 1;
				//调用客户端-Fname,Hname,statttime(客户端每接受一次请求，就发送给服务端一次hot+1的请求)
				try {
					System.out.println(i);
					hot = new Client().getTicket(pid,hid,fname, hot,waitsize[i][1] , waitsize[i][2]);
					if(hot == -1) {
						System.out.println("添加失败");
						JOptionPane.showMessageDialog(null, "第"+index+"个提交失败   座位号为：列-"+(waitsize[i][1]+1)+"排-"+(waitsize[i][2]+1));
						new Employee().saveWorknote("第"+index+"个提交失败   座位号为：列-"+(waitsize[i][1]+1)+"排-"+(waitsize[i][2]+1));
					}else {
						JOptionPane.showMessageDialog(null, "第"+index+"个提交成功   座位号为：列-"+(waitsize[i][1]+1)+"排-"+(waitsize[i][2]+1));
						new Employee().saveWorknote("第"+index+"个提交成功   座位号为：列-"+(waitsize[i][1]+1)+"排-"+(waitsize[i][2]+1));
						money = new Client().consume(free,vipid,money);
						new Employee().saveWorknote("扣费成功-vip："+vipid+"-扣费："+free);
						if(money < free && waitsize[i+1][0]==1) {
							JOptionPane.showMessageDialog(null, "余额不足");
							break;
						}
					}
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		if(index == 0){
			JOptionPane.showMessageDialog(null, "您还没有选择座位");
		}else {
			if(isvip) {
			JOptionPane.showMessageDialog(null, "购票成功，您的余额为:"+money+"，祝您生活愉快");
			}else {
				JOptionPane.showMessageDialog(null, "购票成功，祝您生活愉快");
			}
		}
		System.out.println(index);
		return money;
	}
	
	public float checkVIP(JButton jbok,JButton buy,JTextField text) throws ClassNotFoundException, UnknownHostException, IOException{
		//查找ID
		
		float money = new Client().getVip(text.getText());
		if(money== -1){
			new Employee().saveWorknote("找不到会员"+text.getText());
			JOptionPane.showMessageDialog(null, "找不到会员"+text.getText());
		}else{
			new Employee().saveWorknote("找到会员"+text.getText());
			JOptionPane.showMessageDialog(null, "找到会员"+text.getText());
			buy.setEnabled(true);
			text.setText("当前用户余额为:"+money);
			text.setEnabled(false);
			jbok.setText("重新输入会员卡号");
		}
			return money;//返回卡号余额
	}
	
	public void getCommodity(String Cid,float price,int num){
		//员工为顾客购买零食等商品
		try {
			new Client().getCommodity(Cid,price,num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public int ELogin(String id,String pw){
		//员工登录
		try {
			
			if(id.equals("") || pw.equals("")){
				JOptionPane.showMessageDialog(null, "您未输入账号或密码");	
				}
			else{
				
			Client c = new Client();
		String name = c.Elogin(id, pw);
		if(name.equals("")){
			JOptionPane.showMessageDialog(null, "登录失败");
		}
		else{
			this.name = name;
			this.ID = id;
		JOptionPane.showMessageDialog(null, "登录成功");
		new Employee().saveWorknote("员工登录");
		return 1;
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
		return 0;
	}
	public float addMoney(String id,float addmoney) throws UnknownHostException, IOException{
		//顾客充值
		float money = new Client().addMoney(id, addmoney);
		if(money == -1){
			JOptionPane.showMessageDialog(null, "账号不存在");
		}else{
			JOptionPane.showMessageDialog(null, "充值成功");
			new Employee().saveWorknote("为用户："+id+"充值"+addmoney+"元");
		}
		return money;
	}
	public void addCard(String ID,String name,String remarks){
		//办理会员卡
		try {
			String ok = new Client().Transaction(ID, name, remarks);
			if(ok.equals("ok")){
				JOptionPane.showMessageDialog(null, "办理成功");
				new Employee().saveWorknote("为用户："+name+" 办理VIP");
			}else{
				JOptionPane.showMessageDialog(null, "办理失败");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int[][] chooseSeat(int x,int y,String pid){
		//顾客购票前可选择座位
		//获取影厅座位大小
		//获取当前已被购买的座位，1为已被购买，0为空座
		int[][] seat = new int[x][y];
		
		if(!pid.equals("")) {	
			try {
				int[][] selectedlist = new Client().getSelectedSeat(pid);
				for(int i = 0;i<selectedlist.length;i++) {
					seat[selectedlist[i][0]][selectedlist[i][1]] = 1;
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return seat;
	}
	public void saveWorknote(String operation) {
		//记录员工的所有操作（登录记录、购票及购物），生成一条记录存储到数据库
		
		try {
			System.out.println("id:"+Employee.ID);
			String b = new Client().MakeOperationNote(Employee.ID, Employee.name,operation);
			System.out.println("添加进操作记录");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
	public Object[][] showVipUser(){
		Object[][] obj = null;
		try {
			obj = new Client().showVip();
			new Employee().saveWorknote("查看所有VIP用户");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;	
	}
	
	public List showFilm(){
		try {
			List list = new Client().showFilm();
			new Employee().saveWorknote("查看所有电影");
			return list;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return null;
	}
	
	public List managerHall(){
		try {
			List list = new Client().managerHall();
			new Employee().saveWorknote("查看影厅安排");
			return list;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return null;
	}
	
	public String getCommcover(String cid) throws UnknownHostException, IOException {
		return new Client().getCommcover(cid);
	}
	
	public String getFilmcover(String fname) throws UnknownHostException, IOException {
		return new Client().getFilmcover(fname);
	}
	
	public static void main(String[] args) {
		
	}
	
}
