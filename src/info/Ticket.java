package info;

public class Ticket {
	private String Tid;
	private String Time;
	private String Hall;
	private String Fid;
	private float price;

	public Ticket(String Tid,String Time,String Hall,String Fid,float price){
		this.Tid =Tid;
		this.Time = Time;
		this.Hall = Hall;
		this.Fid = Fid;
		this.price = price;
	}
}
