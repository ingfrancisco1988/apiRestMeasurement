package ar.com.repo.APIrest.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Embeddable
@Getter
@Setter
public class CellPhone {

  @NotNull(message = "el codigo de area no puede quedar vacio")
  @Column(name = "cod_area")
  private int codArea;

  @NotNull(message = "el numero de celular no puede quedar vacio")
  @Column(name = "number_cell")
  private int numberCell;


}
