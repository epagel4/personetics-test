package com.personetics.test.validator;

import com.personetics.test.Node;

import java.util.*;

public class ChainValidator {
    public boolean validate(List<Node> nodes) {
        if(nodes.contains(List.of(nodes))){
            return true;
        } else return false;
    }
}
