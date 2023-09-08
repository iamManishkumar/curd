package com.aulaCube.crud.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Document("Model")
public class Model {

    @Id
    private String id;
    private String title;
    private String description;
    private String status;

    public Model setId(String id) {
        this.id = id;
        return this;
    }

    public Model setTitle(String title) {
        this.title = title;
        return this;
    }

    public Model setDescription(String description) {
        this.description = description;
        return this;
    }

    public Model setStatus(String status) {
        this.status = status;
        return this;
    }
}
