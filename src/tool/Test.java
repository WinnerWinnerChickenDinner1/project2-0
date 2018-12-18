package tool;
 

import info.Commodity;
import info.Employee;
import info.Hall;
import info.Ticket;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.ListView;

import sun.applet.Main;
	public class Test {
		
		/*public static void CLogin() throws SQLException, ClassNotFoundException{
			 String ID="111";
			 String pw="111";
			 String sql = "select * from company where ID ='"+ID+"' and pw ='"+pw+"'";
				ResultSet rs = Datahandle.getStatement().executeQuery(sql);
				Company cm=null;
				if(rs.next()){
					cm =new Company(rs.getString(1),rs.getString(2));
					
			}
				if(cm!=null){
					System.out.println("��¼�ɹ�");
				}
		 }*/
		/*public static void ELogin() throws SQLException, ClassNotFoundException{
			 String ID="111";
			 String pw="111";
			 String name="��һ";
			 String sql = "select * from employee where ID ='"+ID+"' and pw ='"+pw+"' and name ='"+name+"'";
				ResultSet rs = Datahandle.getStatement().executeQuery(sql); 
				Employee e=null;
				if(rs.next()){
					e =new Employee(rs.getString(1),rs.getString(2),rs.getString(3));
					if(e!=null){
						System.out.println("��¼�ɹ�");
					}
		}
		}*/
		/*public static void Addmoney() throws SQLException, ClassNotFoundException{
			String ID="20181129224651";
			float addmon=100;
			String sql1="select money from vip where ID ='"+ID+"'";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql1);
			if(rs.next()){
				addmon = addmon + rs.getFloat("money");
				String sql2="update vip set money='"+addmon+"'where ID ='"+ID+"'";
				Datahandle.getStatement().executeUpdate(sql2);
			}else{
				addmon = -1;
			}
		}*/
		/*public static void Addvip() throws SQLException, ClassNotFoundException{
			String ID="20181205000001";
			String name="����";
			String remarks="AAA";
			float money =0;
			String sql = "insert into vip values('"+ID+"','"+name+"','"+remarks+"','"+money+"')";	
			Datahandle.getStatement().executeUpdate(sql);
		}*/
		/*public static void Showvip() throws SQLException, ClassNotFoundException{
			String ID="20181204000002";
			String name="С��";
			String remarks="AAA";
		float money =500;
		String sql = "select * from vip where ID ='"+ID+"' and name ='"+name+"' and remarks ='"+remarks+"' and money ='"+money+"'";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql); 
		Employee v=null;
		if(rs.next()){
				v =new Employee(rs.getString(1),rs.getString(2),rs.getString(3));
				
		} 
		System.out.println("�ɹ�");
	}*/
	/*public static void Downvip() throws SQLException, ClassNotFoundException{
		String ID="20181204000001";
		String sql ="delete from vip where ID='"+ID+"'";
		Datahandle.getStatement().executeUpdate(sql);
		System.out.println("�ɹ�");
	}*/
	/*public static void Showshop() throws SQLException, ClassNotFoundException{
		String Cid="01";
		String Cname="���׻�";
		String cover="0";
		String content="���ɿڣ�Ũ������";
		int Hot=100;
		float Price=5;
		String inventory="99";
		String sql = "select * from commodity where Cid ='"+Cid+"' and Cname ='"+Cname+"' and cover ='"+cover+"' and content ='"+content+"' and Hot ="+Hot+" and Price ="+Price+" and inventory ='"+inventory+"'";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		Employee v=null;
		if(rs.next()){
				v =new Employee(rs.getString(1),rs.getString(2),rs.getString(3));	
		} 
	}*/
	/*public static void Putshop() throws SQLException, ClassNotFoundException{
		String Cid="02";
		String Cname="�̲�";
		String cover="0";
		String content="�ú�";
		int Hot=100;
		float Price=5;
		String inventory="99";
		String sql = "insert into commodity values('"+Cid+"','"+Cname+"','"+cover+"','"+content+"','"+Hot+"','"+Price+"','"+inventory+"')";
		Datahandle.getStatement().executeUpdate(sql);
	}*/
	/*public static void Downshop() throws SQLException, ClassNotFoundException{
		String Cid="03";
		String sql ="delete from commodity where Cid='"+Cid+"'";
		Datahandle.getStatement().executeUpdate(sql);
	}*/
	/*public static void Upfilm() throws SQLException, ClassNotFoundException{
		String Fid="03";
		String Fname="�������ع�3��";
		String content="ϲ��";
		String cover="0";
		int Hot=100;
		float Price=60;
		String time="14:00";
		String sql = "insert into commodity values('"+Fid+"','"+Fname+"','"+content+"','"+cover+"',"+Hot+","+Price+",'"+time+"')";
		Datahandle.getStatement().executeUpdate(sql);
	}*/
	/*public static void Showfilm() throws SQLException, ClassNotFoundException{
		String Fid="02";
		String Fname="��������";
		String content="�ƻá�����";
		String cover="0";
		int Hot=100;
		float Price=60;
		String time="15:00";
		String sql = "select * from commodity where Fid ='"+Fid+"' and Fname ='"+Fname+"' and content ='"+content+"' and cover ='"+cover+"' and Hot ="+Hot+" and Price ="+Price+" and time ='"+time+"'";
		ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		Employee v=null;
		if(rs.next()){
				v =new Employee(rs.getString(1),rs.getString(2),rs.getString(3));	
		} 
	}*/
		public static void Seat() throws SQLException, ClassNotFoundException{
			String HID="01";
			String SeatID="010101";
			String sql = "select * from seat where HID ='"+HID+"' and SeatID ='"+SeatID+"'" ;
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
		}
		/*public static void Inseat() throws SQLException, ClassNotFoundException{
			String HID="01";
			String SeatID="010101";
			String isSelect="0";
			String sql="update seat set isSelect=1 where SeatID = '"+SeatID+"'";
			ResultSet rs = Datahandle.getStatement().executeQuery(sql);
			Employee v=null;
			if(rs.next()){
					v =new Employee(rs.getString(1),rs.getString(2),rs.getString(3));
		}*/
		
	}

		


