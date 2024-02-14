package Interface;

public class bBank implements IBank{
    private String BankName;
    private String terminalId;
    private String password;

    public bBank(String BankName, String terminalId, String password){

        this.BankName=BankName;
        this.password=password;
        this.terminalId=terminalId;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
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

    @Override
    public boolean connet(String IpAddress) {
        System.out.println("Kullanıcı Ip :" + IpAddress);
        System.out.println("Makina Ip: " + this.hostIpAddress);
        System.out.println(this.BankName + " Bankasına bağlanıldı");
        return false;
    }

    @Override
    public boolean paymnet(double price, String cardNumber, String expiryDate, String cvc) {
        return false;
    }
}
