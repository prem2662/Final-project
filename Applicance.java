

public class Applicance
{
    int ApplianceNo;
    String ApplianceName;
    String ApplianceTypeName;
    public Applicance(int Ano, String aname, String atname)
    {
        // initialise instance variables
        this.ApplianceNo = Ano;
        this.ApplianceName = aname;
        this.ApplianceTypeName = atname;
        
    }

    public void ApplianceNo(int Ano)
    {
        this.ApplianceNo = Ano;
        
    }
    public void setApplianceName(String aname)
    {
        this.ApplianceName = aname;
        
        
    }
    public void setApplianceTypeName(String atname)
    {
        this.ApplianceTypeName = atname;
        
        
    }
}
