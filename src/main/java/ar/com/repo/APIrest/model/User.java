  package ar.com.repo.APIrest.model;

  import com.fasterxml.jackson.annotation.JsonProperty;
  import lombok.EqualsAndHashCode;
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;


  import javax.persistence.*;
  import javax.validation.constraints.NotEmpty;
  import javax.validation.constraints.NotNull;
  import java.util.List;

  @Getter
  @Setter
  @EqualsAndHashCode
  @ToString
  @Entity
  @Table(name="users")
  public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;


    @NotNull(message = "User_mail no puede quedar con estado null")
    @NotEmpty(message = "User_mail no puede quedar vacio")
    @JsonProperty("user_email")
    @Column(name = "user_email")
    private String email;

    @NotNull(message = "User_firstName no puede quedar con estado null")
    @NotEmpty(message = "User_firsttName no puede quedar vacio")
    @JsonProperty("user_firstName")
    @Column(name = "user_frist_name")
    private String userFirstName;

    @NotNull(message = "User_lastName no puede quedar con estado null")
    @NotEmpty(message = "User_lastName no puede quedar vacio")
    @JsonProperty("user_lastName")
    @Column(name = "user_last_name")
    private String userLastName;

    @JsonProperty("cell_phone")
    @OneToMany(mappedBy="id" )
    private List<CellPhone> cellphoneList;

/*
    public List<CellPhone> getCellphoneList() {
      return cellphoneList;
    }

    public void setCellphoneList(List<CellPhone> cellphoneList) {
      this.cellphoneList = cellphoneList;
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {

      this.id = id;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {

      this.email = email;
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

*/
  }