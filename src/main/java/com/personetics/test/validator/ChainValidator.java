package com.personetics.test.validator;

import com.personetics.test.Node;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ChainValidator {
    public boolean validate(List<Node> nodes) {
        boolean result = false;
//        Arrays.stream(nodes.stream().toArray()).anyMatch(e -> validate())
        for (int i = 0; i < nodes.size(); i++) {
             if(Arrays.stream(nodes.stream().toArray()).anyMatch(o -> anyn))
            }
        System.out.println(result);
        return result;
    }

}
