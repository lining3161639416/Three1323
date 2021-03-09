package com.db.model;

import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private  Integer id;
    private String username;
    private String password;
}
