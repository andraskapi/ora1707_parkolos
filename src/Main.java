public class Main {
    public static void main(String[] args) throws TelevanException {


        Jarmu kekauto = new Szgk("kék",5);
        Jarmu pirosauto = new Szgk("piros",2);
        Jarmu feketeauto = new Szgk("fekete",7);
        Jarmu feherauto = new Szgk("fehér",4);
        Jarmu zoldauto = new Szgk("zöld",5);
        Jarmu sargauto = new Szgk("sárga",5);
        Jarmu kamion = new Teher("kék",3);
        Jarmu ezIsKamion = new Teher("szürke",3);
        Jarmu platos = new Teher("fehér",3);
        Jarmu dobozos = new Teher("kék",3);
        Jarmu nagyPlatos = new Teher("fekete",5);


        Parkolo parkolo1 = new Parkolo();
        parkolo1.addAuto(kekauto);
        parkolo1.addAuto(pirosauto);
        parkolo1.addAuto(feketeauto);
        parkolo1.addAuto(feherauto);
        parkolo1.addAuto(zoldauto);
        parkolo1.addAuto(sargauto);
        parkolo1.addAuto(kamion);
        parkolo1.addAuto(ezIsKamion);
        parkolo1.addAuto(platos);
        parkolo1.addAuto(dobozos);
        System.out.println(parkolo1);
        parkolo1.addAuto(nagyPlatos);
        parkolo1.addAuto(nagyPlatos);
        System.out.println(parkolo1);




    }
}