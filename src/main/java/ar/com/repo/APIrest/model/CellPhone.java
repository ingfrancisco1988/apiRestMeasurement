package ar.com.repo.APIrest.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "cell_phone")
public class CellPhone {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;


  //@NotEmpty(message = "total no puede quedar con estado null")
  @NotNull(message = "el codigo de area no puede quedar vacio")
  @JsonProperty("cod_area")
  @Column(name = "cod_area")
  private int codArea;

  @NotNull(message = "el numero de celular no puede quedar vacio")
  @JsonProperty("number_cell")
  @Column(name = "number_cell")
  private int numberCell;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public User getUser() {
    return user;
  }

  @JsonIgnore
  public void setUser(User user) {
    this.user = user;
  }


/*
  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public int getCodArea() {
    return codArea;
  }

  public void setCodArea(int codArea) {
    this.codArea = codArea;
  }

  public void setNumberCell(int numberCell) {
    this.numberCell = numberCell;
  }

  public int getNumberCell() {
    return numberCell;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }*/

}
