/**
 * 
 */
package bank.checks.controller;
  
import java.util.Date;

/**
 * @author ouiminga
 *
 */   
public class Check {
	public static int nbrInstanceOfChecks = 0;

	int checkNum_id = 0;
	int checkbookId = 0;

	long amount = 0;
	long accountHolderAccountNumber = 0;
	
	String amountInLetters = "";
	String nameOfRecipient = "";
	String nameOfOrder = "";
	Date date = new Date();;
	String placeOfCheckSigning = "";
	String accountHolderSignature = "";
	String holderBankContact = "";

	/**
	 * @param checkNum_id
	 * @param checkbookId
	 * @param amount
	 * @param accountHolderAccountNumber
	 * @param amountInLetters
	 * @param nameOfRecipient
	 * @param nameOfOrder
	 * @param date
	 * @param placeOfCheckSigning
	 * @param accountHolderSignature
	 * @param holderBankContact
	 */
	public Check(int checkNum_id, int checkbookId, long amount, long accountHolderAccountNumber, String amountInLetters,
			String nameOfRecipient, String nameOfOrder, Date date, String placeOfCheckSigning,
			String accountHolderSignature, String holderBankContact) {
		super();
		nbrInstanceOfChecks++;
		this.checkNum_id = checkNum_id;
		this.checkbookId = checkbookId;
		this.amount = amount;
		this.accountHolderAccountNumber = accountHolderAccountNumber;
		this.amountInLetters = amountInLetters;
		this.nameOfRecipient = nameOfRecipient;
		this.nameOfOrder = nameOfOrder;
		this.date = date;
		this.placeOfCheckSigning = placeOfCheckSigning;
		this.accountHolderSignature = accountHolderSignature;
		this.holderBankContact = holderBankContact;
	}

	public Check() {
		nbrInstanceOfChecks++;
	}

	public static int getNbrInstanceOfChecks() {
		return nbrInstanceOfChecks;
	}

	/**
	 * @return the checkNum_id
	 */
	public int getCheckNum_id() {
		return checkNum_id;
	}

	/**
	 * @param checkNum_id
	 *            the checkNum_id to set
	 */
	public void setCheckNum_id(int checkNum_id) {
		this.checkNum_id = checkNum_id;
	}

	/**
	 * @return the checkbookId
	 */
	public int getCheckbookId() {
		return checkbookId;
	}

	/**
	 * @param checkbookId
	 *            the checkbookId to set
	 */
	public void setCheckbookId(int checkbookId) {
		this.checkbookId = checkbookId;
	}

	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}

	/**
	 * @return the accountHolderAccountNumber
	 */
	public long getAccountHolderAccountNumber() {
		return accountHolderAccountNumber;
	}

	/**
	 * @param accountHolderAccountNumber
	 *            the accountHolderAccountNumber to set
	 */
	public void setAccountHolderAccountNumber(long accountHolderAccountNumber) {
		this.accountHolderAccountNumber = accountHolderAccountNumber;
	}

	/**
	 * @return the amountInLetters
	 */
	public String getAmountInLetters() {
		return amountInLetters;
	}

	/**
	 * @param amountInLetters
	 *            the amountInLetters to set
	 */
	public void setAmountInLetters(String amountInLetters) {
		this.amountInLetters = amountInLetters;
	}

	/**
	 * @return the nameOfRecipient
	 */
	public String getNameOfRecipient() {
		return nameOfRecipient;
	}

	/**
	 * @param nameOfRecipient
	 *            the nameOfRecipient to set
	 */
	public void setNameOfRecipient(String nameOfRecipient) {
		this.nameOfRecipient = nameOfRecipient;
	}

	/**
	 * @return the nameOfOrder
	 */
	public String getNameOfOrder() {
		return nameOfOrder;
	}

	/**
	 * @param nameOfOrder
	 *            the nameOfOrder to set
	 */
	public void setNameOfOrder(String nameOfOrder) {
		this.nameOfOrder = nameOfOrder;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the placeOfCheckSigning
	 */
	public String getPlaceOfCheckSigning() {
		return placeOfCheckSigning;
	}

	/**
	 * @param placeOfCheckSigning
	 *            the placeOfCheckSigning to set
	 */
	public void setPlaceOfCheckSigning(String placeOfCheckSigning) {
		this.placeOfCheckSigning = placeOfCheckSigning;
	}

	/**
	 * @return the accountHolderSignature
	 */
	public String getAccountHolderSignature() {
		return accountHolderSignature;
	}

	/**
	 * @param accountHolderSignature
	 *            the accountHolderSignature to set
	 */
	public void setAccountHolderSignature(String accountHolderSignature) {
		this.accountHolderSignature = accountHolderSignature;
	}

	/**
	 * @return the holderBankContact
	 */
	public String getHolderBankContact() {
		return holderBankContact;
	}

	/**
	 * @param holderBankContact
	 *            the holderBankContact to set
	 */
	public void setHolderBankContact(String holderBankContact) {
		this.holderBankContact = holderBankContact;
	}

}