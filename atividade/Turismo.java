import java.util.*;

public class Turismo {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        Map<Coordenada,String> turismos = new HashMap<Coordenada,String>();

        turismos.put( new Coordenada("48 51 30 N","02 17 40 L"), new String( "Torre Eiffel" ));

        turismos.put( new Coordenada("43 42 30 N","10 24 12 L"), new String( "Torre Pisa" ));
        
        turismos.put( new Coordenada("13 09 47 S","72 32 44 O"), new String( "Machu Picchu" ));

        turismos.put( new Coordenada("22 57 06 S","43 12 37 O"), new String( "Torre Pisa" ));
        
        turismos.put( new Coordenada("41 54 08 N","12 27 11 L"), new String( "Vaticano" ));

        System.out.println("Digite a Latitude do Local Turístico, Ex: 28 42 33 N:");

        String Latitude = ler.nextLine();

        System.out.println("Digite a Longitude do Local Turístico, Ex: 28 42 33 L:");

        String Longitude = ler.nextLine();

        String local = turismos.get(new Coordenada(Latitude, Longitude));

        if(local == null){
            System.out.println("Local Turístico não Encontrado");
        }else{
            System.out.println("Local Turístico: "+local);
        }
    }
}