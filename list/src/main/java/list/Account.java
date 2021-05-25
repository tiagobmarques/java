package list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Account {

  private Integer number;
  private Integer bankBranch;
  private Client client;
}
