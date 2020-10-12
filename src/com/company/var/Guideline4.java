package com.company.var;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Guideline4 {
    List<String> strings = List.of("hello", "hello", "how", "are", "you", "?");

    public Optional<String> getMaxEntry() {
        var collect = strings.stream()
                .collect(groupingBy(s -> s, counting()));
        var max = collect
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return max
                .map(Map.Entry::getKey);


    }
}
