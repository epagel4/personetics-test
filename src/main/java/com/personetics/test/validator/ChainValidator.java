package com.personetics.test.validator;

import com.personetics.test.Node;

import java.util.List;
import java.util.Set;

public class ChainValidator {
    public boolean validate(List<Node> nodes) {
        boolean result;
        result = nodes.stream().anyMatch(e -> Set.of(1, 9, 3, 5, "a", "b", "c", "d", "e", "f", "p", "r", "o", "n")
                .contains(e));
        System.out.println(result);
        return result;
    }

}
