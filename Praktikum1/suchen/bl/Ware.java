package suchen.bl;

public class Ware {

    private long warennummer;
    private String name;

    public Ware(long warennummer, String name){
        this.warennummer = warennummer;
        this.name = name;
    }

   public long getWarennummer(){
        return this.warennummer;
   }

   public String getName(){
    return this.name;
   }


   public String toString(){
    return warennummer + " " + name ;
   }

}
