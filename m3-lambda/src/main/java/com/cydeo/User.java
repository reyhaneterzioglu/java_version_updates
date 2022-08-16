package com.cydeo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data // => getter, setter, toString included
public class User {

    private String firstName;
    private String lastName;
    private int age;


}
