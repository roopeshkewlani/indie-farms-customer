package com.indie.farms.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private String name;
    @JsonProperty("email_id")
    private String emailId;
    private String password;
    @JsonProperty("contact_no")
    private Long contactNo;
}
