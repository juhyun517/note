package com.avi6.entity.note;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoteImage {

    private String fileName; 

    private int ord;

    public void setOrd(int ord){
        this.ord = ord;
    }

}