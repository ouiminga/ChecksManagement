package bank.checks.controller;

import java.util.TreeSet;

public class CheckBook {
	// Variables publiques qui comptent les instances
	public static int nbrInstanceOfCheckbooks = 0;

	int checkbookNum_id = 0;
	long firstCheckNum = 0;
	long lastCheckNum = 0;
	long accountNum = 0;

	TreeSet<Check> Listchecks = new TreeSet<Check>();
	String checkbookHeel = "";
	String checkbookRib = "";
	String checkbookOrderFormRenewal = "";
	String checkbookChecksType = "";

	/**
	 * @param checkbookNum_id
	 * @param firstCheckNum
	 * @param lastCheckNum
	 * @param accountNum
	 * @param listchecks
	 * @param checkbookHeel
	 * @param checkbookRib
	 * @param checkbookOrderFormRenewal
	 * @param checkbookChecksType
	 */
	public CheckBook(int checkbookNum_id, long firstCheckNum, long lastCheckNum, long accountNum,
			TreeSet<Check> listchecks, String checkbookHeel, String checkbookRib, String checkbookOrderFormRenewal,
			String checkbookChecksType) {
		super();
		nbrInstanceOfCheckbooks++;
		this.checkbookNum_id = checkbookNum_id;
		this.firstCheckNum = firstCheckNum;
		this.lastCheckNum = lastCheckNum;
		this.accountNum = accountNum;
		Listchecks = listchecks;
		this.checkbookHeel = checkbookHeel;
		this.checkbookRib = checkbookRib;
		this.checkbookOrderFormRenewal = checkbookOrderFormRenewal;
		this.checkbookChecksType = checkbookChecksType;
	}

	public CheckBook() {
		nbrInstanceOfCheckbooks++;
	}
	
	public static int getNbrInstanceOfCheckbooks()
	{
	return nbrInstanceOfCheckbooks;
	}

	/**
	 * @return the checkbookNum_id
	 */
	public int getCheckbookNum_id() {
		return checkbookNum_id;
	}

	/**
	 * @param checkbookNum_id
	 *            the checkbookNum_id to set
	 */
	public void setCheckbookNum_id(int checkbookNum_id) {
		this.checkbookNum_id = checkbookNum_id;
	}

	/**
	 * @return the firstCheckNum
	 */
	public long getFirstCheckNum() {
		return firstCheckNum;
	}

	/**
	 * @param firstCheckNum
	 *            the firstCheckNum to set
	 */
	public void setFirstCheckNum(long firstCheckNum) {
		this.firstCheckNum = firstCheckNum;
	}

	/**
	 * @return the lastCheckNum
	 */
	public long getLastCheckNum() {
		return lastCheckNum;
	}

	/**
	 * @param lastCheckNum
	 *            the lastCheckNum to set
	 */
	public void setLastCheckNum(long lastCheckNum) {
		this.lastCheckNum = lastCheckNum;
	}

	/**
	 * @return the accountNum
	 */
	public long getAccountNum() {
		return accountNum;
	}

	/**
	 * @param accountNum
	 *            the accountNum to set
	 */
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	/**
	 * @return the listchecks
	 */
	public TreeSet<Check> getListchecks() {
		return Listchecks;
	}

	/**
	 * @param listchecks
	 *            the listchecks to set
	 */
	public void setListchecks(TreeSet<Check> listchecks) {
		Listchecks = listchecks;
	}

	/**
	 * @return the checkbookHeel
	 */
	public String getCheckbookHeel() {
		return checkbookHeel;
	}

	/**
	 * @param checkbookHeel
	 *            the checkbookHeel to set
	 */
	public void setCheckbookHeel(String checkbookHeel) {
		this.checkbookHeel = checkbookHeel;
	}

	/**
	 * @return the checkbookRib
	 */
	public String getCheckbookRib() {
		return checkbookRib;
	}

	/**
	 * @param checkbookRib
	 *            the checkbookRib to set
	 */
	public void setCheckbookRib(String checkbookRib) {
		this.checkbookRib = checkbookRib;
	}

	/**
	 * @return the checkbookOrderFormRenewal
	 */
	public String getCheckbookOrderFormRenewal() {
		return checkbookOrderFormRenewal;
	}

	/**
	 * @param checkbookOrderFormRenewal
	 *            the checkbookOrderFormRenewal to set
	 */
	public void setCheckbookOrderFormRenewal(String checkbookOrderFormRenewal) {
		this.checkbookOrderFormRenewal = checkbookOrderFormRenewal;
	}

	/**
	 * @return the checkbookChecksType
	 */
	public String getCheckbookChecksType() {
		return checkbookChecksType;
	}

	/**
	 * @param checkbookChecksType
	 *            the checkbookChecksType to set
	 */
	public void setCheckbookChecksType(String checkbookChecksType) {
		this.checkbookChecksType = checkbookChecksType;
	}

}
