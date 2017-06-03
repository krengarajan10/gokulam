package com.organic.shop.view;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Rengarajan on 3/31/2017.
 */
@Data
@NoArgsConstructor
@lombok.EqualsAndHashCode(of = {"id", "content"})
public class Greetings {

    private long id;
    private String content;

    public Greetings(long l, String format) {
        this.id = l;
        this.content = format;
    }
}
