package ar.com.repo.APIrest.dto;



import ar.com.repo.APIrest.model.CellPhone;
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
  @NotNull
  @NotEmpty
  private String userEmail;
  private String userFirstName;
  private String userLastName;
  private List<CellPhone> cellPhoneList;



/*


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public List<CellPhone> getCellPhoneList() {
    return cellPhoneList;
  }

  public void setCellPhoneList(List<CellPhone> cellPhoneList) {
    this.cellPhoneList = cellPhoneList;
  }*/

}



