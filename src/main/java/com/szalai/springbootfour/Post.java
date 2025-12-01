package com.szalai.springbootfour;

public record Post(
        Integer userId,
        Integer id,
        String title,
        String body
) {
}
