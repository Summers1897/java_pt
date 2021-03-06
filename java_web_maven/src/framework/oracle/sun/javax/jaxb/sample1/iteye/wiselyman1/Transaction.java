package framework.oracle.sun.javax.jaxb.sample1.iteye.wiselyman1;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Transaction {
	@XmlAttribute
	private String type = "Purchase.PMReq";
	private String submitTime;
	private Order order;
	private Merchant merchant;
	private String accountNumber1;
	private String transSerialNumber;
	private String transResponseCode;
	private String billAmount;
	private String settleDate;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public String getAccountNumber1() {
		return accountNumber1;
	}
	public void setAccountNumber1(String accountNumber1) {
		this.accountNumber1 = accountNumber1;
	}
	public String getTransSerialNumber() {
		return transSerialNumber;
	}
	public void setTransSerialNumber(String transSerialNumber) {
		this.transSerialNumber = transSerialNumber;
	}
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getTransResponseCode() {
		return transResponseCode;
	}
	public void setTransResponseCode(String transResponseCode) {
		this.transResponseCode = transResponseCode;
	}
}
