package list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AccountTest {

  @Test
  void shouldBeCreateAAccountList() {

    var accountList = List.of(Account.builder().number(1012).bankBranch(1).build(),
        Account.builder().number(2056).bankBranch(1).build());

    assertNotNull(accountList);
    assertEquals(accountList.get(0).getNumber(), 1012);
    assertEquals(accountList.get(0).getBankBranch(), 1);
    assertEquals(accountList.get(1).getNumber(), 2056);
    assertEquals(accountList.get(1).getBankBranch(), 1);
  }

  @Test
  void shouldBeCreateAAccountListAndOrderByAccountNumber() {

    List<Account> accountList = new ArrayList<>(
        Arrays.asList(
            Account.builder().number(95045).bankBranch(1).build(),
            Account.builder().number(540).bankBranch(1).build(),
            Account.builder().number(7505).bankBranch(2).build(),
            Account.builder().number(3500).bankBranch(2).build()));

    accountList.sort(Comparator.comparingInt(Account::getNumber));

    assertNotNull(accountList);
    assertEquals(accountList.get(0).getNumber(), 540);
    assertEquals(accountList.get(1).getNumber(), 3500);
    assertEquals(accountList.get(2).getNumber(), 7505);
    assertEquals(accountList.get(3).getNumber(), 95045);
  }

  @Test
  void shouldBeCreateAAccountListAndOrderByClientName() {

    Client clientOne = Client.builder().id(1).name("Tiago").build();
    Client clientTwo = Client.builder().id(2).name("Samira").build();
    Client clientThree = Client.builder().id(2).name("Nicolas").build();
    Client clientFour = Client.builder().id(2).name("Valentina").build();

    List<Account> accountList = new ArrayList<>(
        Arrays.asList(
            Account.builder().number(95045).bankBranch(1).client(clientOne).build(),
            Account.builder().number(540).bankBranch(1).client(clientTwo).build(),
            Account.builder().number(7505).bankBranch(2).client(clientThree).build(),
            Account.builder().number(3500).bankBranch(2).client(clientFour).build()));

    accountList.sort(Comparator.comparing(a -> a.getClient().getName()));

    assertNotNull(accountList);
    assertEquals(accountList.get(0).getClient().getName(), "Nicolas");
    assertEquals(accountList.get(1).getClient().getName(), "Samira");
    assertEquals(accountList.get(2).getClient().getName(), "Tiago");
    assertEquals(accountList.get(3).getClient().getName(), "Valentina");
  }

}