package yandex.appmanager;

import static com.codeborne.selenide.Selenide.open;

public class NavigationHelper {

  public static void openSearchPage(){
    open("http://ya.ru");
  }
}
