package resttests;

import io.restassured.RestAssured;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import models.AccountData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountIdTest {

  @Test
  public void checkOneAccountIDNotEmpty() {
    AccountData data = RestAssured.get("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678")
                                  .as(AccountData.class);
    Assert.assertFalse(data.getAccount_id().isEmpty());
    System.out.println(data.getAccount_id() + " " + data.getTitle());
  }

  @Test
  public void checkMultipleAccountIDsNotEmpty() {
    List<AccountData> data = Arrays.asList(
        RestAssured.get("http://kn-ktapp.herokuapp.com/apitest/accounts/")
                   .as(AccountData[].class));
    List<AccountData> dataWithEmptyID = data.stream()
                                            .filter(item -> item.getAccount_id().isEmpty())
                                            .collect(
                                                Collectors.toList());
    Assert.assertEquals(dataWithEmptyID.size(),
                        0,
                        "Есть аккаунты без ID: ".concat(data.toString()));
  }
}
