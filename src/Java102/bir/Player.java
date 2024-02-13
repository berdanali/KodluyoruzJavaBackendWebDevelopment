package bir;
/*
Eğer bir sınıfa ait değişkenlerin başına "static" yazılırsa,
o değişkenler artık sınıf değişkeni olurlar. Sınıf değişkeni olarak tanımlanan değişkenler,
her nesne oluşturduğumuzda ayrı ayrı oluşmazlar. Sınıfa ait ne kadar nesne olursa olsun,
sınıf değişkenleri 1 tanedir. Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir.
Sınıf değişkenlerinin bir diğer özelliği ise, ilgili sınıfa ait hiç nesne oluşturulmasa bile bellekte yer kaplarlar.
*/

public class Player {
    public String name;
    public int id;
    public static int count=0;
    Player(String name,int id){
        this.id=id;
        this.name=name;
    }
    public void login(){
        count++;
    }
}
