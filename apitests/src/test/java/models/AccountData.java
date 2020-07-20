package models;

public class AccountData {

private String account_id;
private String design_url;
private int transactions_total_amount;
private int tariff_avg_month_balance;
private String type;
private String closing_date;
private int partial_withdraw_available;
private int refill_available;
private int blocked_amount;
private String scheme_id;
private String pan;
private String title_small;
private String title;
private int balance;
private String currency;
private boolean isSalary;
private final int MultiplierForCalculatingMoney = 100;

  public String getAccount_id() {
    return account_id;
  }

  public AccountData setAccount_id(String account_id) {
    this.account_id = account_id;
    return this;
  }

  public String getDesign_url() {
    return design_url;
  }

  public AccountData setDesign_url(String design_url) {
    this.design_url = design_url;
    return this;
  }

  public int getTransactions_total_amount() {
    return transactions_total_amount;
  }

  public AccountData setTransactions_total_amount(int transactions_total_amount) {
    this.transactions_total_amount = transactions_total_amount;
    return this;
  }

  public int getTariff_avg_month_balance() {
    return tariff_avg_month_balance;
  }

  public AccountData setTariff_avg_month_balance(int tariff_avg_month_balance) {
    this.tariff_avg_month_balance = tariff_avg_month_balance;
    return this;
  }

  public String getType() {
    return type;
  }

  public AccountData setType(String type) {
    this.type = type;
    return this;
  }

  public String getClosing_date() {
    return closing_date;
  }

  public AccountData setClosing_date(String closing_date) {
    this.closing_date = closing_date;
    return this;
  }

  public int getPartial_withdraw_available() {
    return partial_withdraw_available;
  }

  public AccountData setPartial_withdraw_available(int partial_withdraw_available) {
    this.partial_withdraw_available = partial_withdraw_available;
    return this;
  }

  public int getRefill_available() {
    return refill_available;
  }

  public AccountData setRefill_available(int refill_available) {
    this.refill_available = refill_available;
    return this;
  }

  public float getBlocked_amountForView() {
    return blocked_amount/MultiplierForCalculatingMoney;
  }

  public int getBlocked_amountForCalculating() {
    return balance;
  }

  public AccountData setBlocked_amount(int blocked_amount) {
    this.blocked_amount = blocked_amount;
    return this;
  }

  public String getScheme_id() {
    return scheme_id;
  }

  public AccountData setScheme_id(String scheme_id) {
    this.scheme_id = scheme_id;
    return this;
  }

  public String getPan() {
    return pan;
  }

  public AccountData setPan(String pan) {
    this.pan = pan;
    return this;
  }

  public String getTitle_small() {
    return title_small;
  }

  public AccountData setTitle_small(String title_small) {
    this.title_small = title_small;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public AccountData setTitle(String title) {
    this.title = title;
    return this;
  }

  public float getBalanceForView() {
    return balance / MultiplierForCalculatingMoney;
  }

  public int getBalanceForCalculating() {
    return balance;
  }

  public AccountData setBalance(int balance) {
    this.balance = balance;
    return this;
  }

  public String getCurrency() {
    return currency;
  }

  public AccountData setCurrency(String currency) {
    this.currency = currency;
    return this;
  }

  public boolean isSalary() {
    return isSalary;
  }

  public AccountData setSalary(boolean salary) {
    isSalary = salary;
    return this;
  }

  @Override
  public String toString() {
    return "AccountData{" +
           "account_id='" + account_id + '\'' +
           ", design_url='" + design_url + '\'' +
           ", transactions_total_amount=" + transactions_total_amount +
           ", tariff_avg_month_balance=" + tariff_avg_month_balance +
           ", type='" + type + '\'' +
           ", closing_date='" + closing_date + '\'' +
           ", partial_withdraw_available=" + partial_withdraw_available +
           ", refill_available=" + refill_available +
           ", blocked_amount=" + blocked_amount +
           ", scheme_id='" + scheme_id + '\'' +
           ", pan='" + pan + '\'' +
           ", title_small='" + title_small + '\'' +
           ", title='" + title + '\'' +
           ", balance=" + balance +
           ", currency='" + currency + '\'' +
           ", isSalary=" + isSalary +
           '}';
  }
}
