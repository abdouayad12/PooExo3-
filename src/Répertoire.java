
public class Répertoire {
	String nom;
	int nbrf,taille;
	Date date;
public Répertoire(String nom,int nbrf,int taille,Date date)
	{
	this.nom=nom;
	this.nbrf=nbrf;
	this.taille=taille;
	this.date=date;
    }
public void setNom(String nom)
	{
	this.nom=nom;
	}
public void setNbrf(int nbrf)
	{
     this.nbrf=nbrf;
	}
public void setTaille(int taille)
	{
     this.taille=taille;
	}
public void setDate(Date date)
	{
	 this.date=date;
	}
public String getNom()
    {
	return nom;
    }
public int getNbrf()
	{
	return nbrf;
	}
public int getTaille()
{
return taille;
}
public Date getDate()
{
return date;
}
public void affiherRep()
	{
	System.out.println("Le nom :"+nom+" Le nombre de fichiers: "+nbrf
			+" La taille en octets: "+taille+" La date: "+date);
	}






}
