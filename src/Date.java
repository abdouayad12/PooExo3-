
public class Date {
	int jj,mm,aaaa;
	public Date(int jj,int mm,int aaaa)
	{
		this.jj=jj;
		this.mm=mm;
		this.aaaa=aaaa;
	}
	public void afficher()
	{
		System.out.println("la date est: "+jj+"-"+mm+"-"+aaaa);
	}
}
