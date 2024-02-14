package Interface;
// interface 'de değişken tanımlanmaz ancak varsayılan bir değer verirsek tanımlayabiliriz
public interface IBank {
    final String hostIpAddress="127.0.0.1";
     boolean connet(String IpAddress);
     boolean paymnet(double price, String cardNumber, String expiryDate, String cvc);

}
