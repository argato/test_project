package yandex.pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class YaSearchResultPage {

  public String getStringCountSearchResult() {
    return $(By.className("serp-adv__found")).getText();
  }

  public boolean isOverMillionResults() {
    return getStringCountSearchResult().contains("млн");
  }

  public boolean isOverThousandResults() {
    return getStringCountSearchResult().contains("тыс.") || isOverMillionResults();
  }
}
