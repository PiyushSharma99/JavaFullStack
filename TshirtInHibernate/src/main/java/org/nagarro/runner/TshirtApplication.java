package org.nagarro.runner;

import org.nagarro.constant.Constants;
import org.nagarro.input.InputAcceptor;
import org.nagarro.model.Tshirt;
import org.nagarro.model.TshirtDTO;
import org.nagarro.output.Output;
import org.nagarro.service.CsvFiles;
import org.nagarro.service.ProcessInitiator;
import org.nagarro.service.TshirtSearchInDb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

public class TshirtApplication {

    public static void main(String[] args) throws IOException {
        CsvFiles csvFiles= new CsvFiles();
        csvFiles.initiateThreadClass();

        String choice = "y";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Constants.WELCOME_MESSAGE);
        do {

            ProcessInitiator processInitiator = new ProcessInitiator();
            processInitiator.startProcess();
            System.out.println(Constants.AGAIN_INPUT_MESSAGE);
            choice = br.readLine();

        } while(Objects.equals(choice,"y"));
        System.exit(0);
    }
}