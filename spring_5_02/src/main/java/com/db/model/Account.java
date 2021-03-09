package com.db.model;

import lombok.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private String username;
    private Double balance;
}
