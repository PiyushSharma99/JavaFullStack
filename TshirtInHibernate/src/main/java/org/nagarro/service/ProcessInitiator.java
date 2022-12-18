package org.nagarro.service;

import java.io.IOException;
import java.util.List;
import org.nagarro.input.InputAcceptor;
import org.nagarro.constant.Constants;
import org.nagarro.model.Tshirt;
import org.nagarro.model.TshirtDTO;
import org.nagarro.output.Output;
import org.nagarro.service.CsvFiles;


public class ProcessInitiator {

    public static void startProcess() throws IOException
    {


        String[] itemString = InputAcceptor.enterInput();

        String color = itemString[0];
        String size = itemString[1];
        String genderRecommendation = itemString[2];
        String outputPreference = itemString[3];

        TshirtDTO tshirtDTO = new TshirtDTO(color,genderRecommendation,size,outputPreference);

        TshirtSearchInDb tshirtSearchInDb = new TshirtSearchInDb();

        List<Tshirt> shirts = tshirtSearchInDb.searchTshirt(tshirtDTO);

        Output.displayOutput(shirts,tshirtDTO);
    }

}
