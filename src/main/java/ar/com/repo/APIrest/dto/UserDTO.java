package ar.com.repo.APIrest.dto;



import ar.com.repo.APIrest.model.CellPhone;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

  private int id;
  @NotNull (message = "userEmail can´t no be null")
  @NotEmpty (message = "userEmail can´t no be empty")
  private String userEmail;
  @NotNull (message = "userFirstName can´t no be null")
  @NotEmpty (message = "userFirstName can´t no be empty")
  private String userFirstName;
  @NotNull (message = "userLastName can´t no be null")
  @NotEmpty (message = "userLastName can´t no be empty")
  private String userLastName;
  private List<CellPhone> cellPhoneList;

}



