package yandex.pages;

import static com.codeborne.selenide.Selenide.$;

public class YaSearchPage {
  public void search(String searchString){
    $("#text").setValue(searchString);
    $("button[type='submit']").click();
  }
}
