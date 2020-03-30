package com.mycompany.arep_lambda;


import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static spark.Spark.*;
/**
 * 
 * @author checho
 *
 */
public class SparkWebApp {
	public static void main(String[] args) {

        port(getPort());
        get("square", (req, res) -> {

            String page = FileUtils.readFileToString(
                    new File("src/main/resources/index.html"), StandardCharsets.UTF_8);
            return page;
        });

        get("result", (req, res) -> {

            try {
                URL url = new URL("https://kkq6wb56ug.execute-api.us-east-1.amazonaws.com/Beta?value="+
                        req.queryParams("data"));
                try {
                    FileWriter fileWriter = new FileWriter("src/main/resources/result.html");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                    String inputLine = null;
                    while ((inputLine= bufferedReader.readLine()) != null) {
                        fileWriter.write(inputLine);
                    }
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("There was an exception processing your request: "+ e.getMessage());
                }
            } catch (MalformedURLException e) {
                System.err.println("The given URL is not valid or has a problem");
            }

            String page = FileUtils.readFileToString(
                    new File("src/main/resources/result.html"), StandardCharsets.UTF_8);

            return page;
        });

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
