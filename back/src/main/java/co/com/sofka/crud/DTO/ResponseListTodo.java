package co.com.sofka.crud.DTO;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ResponseListTodo implements Serializable {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
