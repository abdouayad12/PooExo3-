
public class Programme {
public static void main(String[] args) {int i=0;
Répertoire[] r= {new Répertoire("math",10,256,new Date(12,2,2011))
		,new Répertoire("physique",0,240,new Date(15,3,2019))};
while(i<2)
	{
	if(r[i].nbrf==0)
		{
		r[i].affiherRep();
		}
	}
}
}
