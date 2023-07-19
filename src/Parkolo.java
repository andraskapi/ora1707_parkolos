import java.util.ArrayList;
import java.util.List;

public class Parkolo {
    private final int kapacitas = 10;
   private List<Jarmu> autok = new ArrayList<>();




    public void addAuto (Jarmu jarmu) throws TelevanException {

       if (autok.size() > kapacitas){
          throw new TelevanException("A parkoló megtelt! ");
       }
       this.autok.add(jarmu);
   }
   public void removeAuto(Jarmu jarmu){
       this.autok.remove(jarmu);
   }

    @Override
    public String toString() {
        return "Parkolo{" +
                "autok=" + autok +
                '}';
    }
}
