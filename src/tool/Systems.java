package tool;

import java.awt.Image;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.prism.paint.Color;

import info.Film;

public class Systems {
	public Object[][] getRank(){
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
	
	public void gettop4(String[] names,JLabel[] jLabels,JTextField[] texts) {
		for(int i = 0;i<names.length;i++) {
			try {
				jLabels[i].setText("");
				if(i==0) {
					texts[i].setText("No.1:"+names[i]);
					texts[i].setForeground(new java.awt.Color(167,83,90));
				}else {
				texts[i].setText("No."+(i+1)+":"+names[i]);
				}
				String path = getTop4cover(names[i], i+1);
				Image img = new ImageIcon(path).getImage()
						.getScaledInstance(180, 240,
								Image.SCALE_SMOOTH);
				jLabels[i].setIcon(new ImageIcon(img));
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String getTop4cover(String fname,int index) throws UnknownHostException, IOException {
		return new Client().getTop4cover(fname,index);
	}
	public String  getTrailer(String fname){
		//获取预告片
		try {
			return new Client().getTrailer(fname);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		new Systems().getRank();
	}
}
