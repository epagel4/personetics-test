package com.personetics.test.validator;

import com.personetics.test.Node;
import org.testng.annotations.Test;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

public class ChainValidatorTest {

    @Test
    public void ChainValidator() {
        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodes = new ArrayList<>();
        try{
            chainValidator.validate(nodes);
        } catch (IOError ioe){
            System.out.println(ioe.getMessage());
        }
    }
}

