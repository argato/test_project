package yandex.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import yandex.appmanager.NavigationHelper;
import yandex.pages.YaSearchPage;
import yandex.pages.YaSearchResultPage;

public class SearchTest {

  @Test
  public void searchResultCount() {
    String searchText = "ягуарунди";
    NavigationHelper.openSearchPage();
    new YaSearchPage().search(searchText);

    Assert.assertTrue(new YaSearchResultPage().isOverThousandResults(),
                      "Нашлось менее 1000 записей ".concat(searchText));
  }
}
