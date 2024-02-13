package bir;
/*
* Methotları static kullanmanın avantajı şu şekldir biz bir methotda bir fonksion yazıyorsak ve ona main
* sınıfında erişmek istiyorsak onu bir nesne üzerinden çağırmamız lazım ama bizim yazdığımız fonksiyon nesneden
* bağımsız ise gereksiz bir kullanım oluyor bunun yerine static kullanırsak sınıftan bağımsız olur ve nesne
* ile çağırmaya gerek kalmaz
* */
public class Calculate {
    public static void calcAvarege(int[] notes){
        double total=0;
        for (int i: notes
        ) {
            total +=i;

        }
        double avarege = total/notes.length;
        System.out.println("Ortalamanız :"  + avarege);
    }
}

