package org.flink;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple;

/**
 * Created by yf on 2016/11/3.
 */
public class WordCount {

    public static void main(String[] args) {
        final ExecutionEnvironment environment=ExecutionEnvironment.getExecutionEnvironment();

        DataSet<String> text=environment.fromElements("To be, or not to be,--that is the question:--",
                "Whether 'tis nobler in the mind to suffer",
                "The slings and arrows of outrageous fortune",
                "Or to take arms against a sea of troubles,"
        );

    }
}
