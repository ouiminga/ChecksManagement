package bank.checks.controller;

public class checkDemand {

	String accountNumber = "";
	String title = "";
	String numberOfCheckbooks = "";
	String numberOfChecks = "";

	/**
	 * @param accountNumber
	 * @param title
	 * @param numberOfCheckbooks
	 * @param numberOfChecks
	 * @param firstCheckNum
	 * @param lastCheckNum
	 * @param checkbookChecksType
	 */
	public checkDemand(String accountNumber, String title, String numberOfCheckbooks, String numberOfChecks,
			long firstCheckNum, long lastCheckNum, String checkbookChecksType) {
		super();
		this.accountNumber = accountNumber;
		this.title = title;
		this.numberOfCheckbooks = numberOfCheckbooks;
		this.numberOfChecks = numberOfChecks;
		this.firstCheckNum = firstCheckNum;
		this.lastCheckNum = lastCheckNum;
		this.checkbookChecksType = checkbookChecksType;
	}

	long firstCheckNum = 0;
	long lastCheckNum = 0;

	String checkbookChecksType = "";

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the numberOfCheckbooks
	 */
	public String getNumberOfCheckbooks() {
		return numberOfCheckbooks;
	}

	/**
	 * @param numberOfCheckbooks the numberOfCheckbooks to set
	 */
	public void setNumberOfCheckbooks(String numberOfCheckbooks) {
		this.numberOfCheckbooks = numberOfCheckbooks;
	}

	/**
	 * @return the numberOfChecks
	 */
	public String getNumberOfChecks() {
		return numberOfChecks;
	}

	/**
	 * @param numberOfChecks the numberOfChecks to set
	 */
	public void setNumberOfChecks(String numberOfChecks) {
		this.numberOfChecks = numberOfChecks;
	}

	/**
	 * @return the firstCheckNum
	 */
	public long getFirstCheckNum() {
		return firstCheckNum;
	}

	/**
	 * @param firstCheckNum the firstCheckNum to set
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
	 * @param lastCheckNum the lastCheckNum to set
	 */
	public void setLastCheckNum(long lastCheckNum) {
		this.lastCheckNum = lastCheckNum;
	}

	/**
	 * @return the checkbookChecksType
	 */
	public String getCheckbookChecksType() {
		return checkbookChecksType;
	}

	/**
	 * @param checkbookChecksType the checkbookChecksType to set
	 */
	public void setCheckbookChecksType(String checkbookChecksType) {
		this.checkbookChecksType = checkbookChecksType;
	}

}
