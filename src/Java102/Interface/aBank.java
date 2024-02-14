package Interface;

public class aBank implements IBank {
    private String BankName;
    private String terminalId;
    private String password;

    public aBank(String BankName, String terminalId, String password){

        this.BankName=BankName;
        this.password=password;
        this.terminalId=terminalId;
    }

    public String getBankName() {
        return BankName;
    }
    public void setBankName(String BankName){
        this.BankName=BankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean connect(String ipAddress){
        System.out.println("Kullanıcı Ip :" + ipAddress);
        System.out.println("Makina Ip: " + this.hostIpAddress);
        System.out.println(this.BankName + " Bankasına bağlanıldı");
        return true;
    }
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc){

        System.out.println("İşlem başarılı oldu ...");
        return true;
    }

    @Override
    public boolean connet(String IpAddress) {
        return false;
    }

    @Override
    public boolean paymnet(double price, String cardNumber, String expiryDate, String cvc) {
        return false;
    }
}
