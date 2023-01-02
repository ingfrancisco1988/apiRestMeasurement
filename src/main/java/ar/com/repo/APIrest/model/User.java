  package ar.com.repo.APIrest.model;

  import com.fasterxml.jackson.annotation.JsonProperty;
  import lombok.EqualsAndHashCode;
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;


  import javax.persistence.*;
  import javax.validation.constraints.NotEmpty;
  import javax.validation.constraints.NotNull;
  import java.util.HashSet;
  import java.util.List;
  import java.util.Set;

  @Getter
  @Setter
  @EqualsAndHashCode
  @ToString
  @Entity
  @Table(name="users")
  public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @NotNull(message = "User_mail no puede quedar con estado null")
    @NotEmpty(message = "User_mail no puede quedar vacio")
    @Column(name = "user_email")
    private String email;

    @NotNull(message = "User_firstName no puede quedar con estado null")
    @NotEmpty(message = "User_firsttName no puede quedar vacio")
    @Column(name = "user_frist_name")
    private String userFirstName;

    @NotNull(message = "User_lastName no puede quedar con estado null")
    @NotEmpty(message = "User_lastName no puede quedar vacio")
    @Column(name = "user_last_name")
    private String userLastName;

    @ElementCollection
    @CollectionTable(name = "user_phone_numbers", joinColumns = @JoinColumn(name = "user_id"))
    private Set<CellPhone> cellphoneList = new HashSet<>();

  }