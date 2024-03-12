package com.example.SpotifyRandom;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import com.vaadin.flow.component.textfield.TextArea;
//@CssImport("./styles/style.css")
@Route("")
public class randomTweet extends VerticalLayout {

    String[] tweets;
    String[][] tweetsUp;

    public randomTweet() throws FileNotFoundException {

        String[] tweets = new String[1000000];
        String[][] tweetsUp = new String[3][1000000];

        var button = new Button("click me");

        TextArea textArea = new TextArea();
        textArea.setLabel("Time Posted");

        TextArea textArea2 = new TextArea();
        textArea2.setLabel("User");

        TextArea textArea3 = new TextArea();
        textArea3.setLabel("Tweet");

        H1 title = new H1("Twitter in 2009");
        title.getStyle().set("font-size", "60px")
                .set("margin-top", "40px");



        createList(tweets, tweetsUp);

        VerticalLayout buttonLayout = new VerticalLayout(title, button);
        add(buttonLayout);
        buttonLayout.setAlignItems(Alignment.CENTER);

        HorizontalLayout horizontal = new HorizontalLayout ();
        add(horizontal);
        horizontal.setHeight("200px");
        textArea.setWidth("400px");
        textArea.setReadOnly(true);
        textArea2.setWidth("400px");
        textArea2.setReadOnly(true);
        textArea3.setWidth("400px");
        textArea3.setReadOnly(true);
        horizontal.add(textArea);
        horizontal.add(textArea2);
        horizontal.add(textArea3);

        VerticalLayout textLayout = new VerticalLayout(horizontal);
        add(textLayout);
        textLayout.setAlignItems(Alignment.CENTER);




        button.addClickListener(e -> {
            Random random = new Random();
            int randomNumber = random.nextInt(1000001);


            textArea.setValue(tweetsUp[0][randomNumber]);
            textArea2.setValue(tweetsUp[1][randomNumber]);
            textArea3.setValue(tweetsUp[2][randomNumber]);

        });
    }

    public void createList(String[] tweets, String[][] tweetsUp) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("tweetsFinal.csv"));
        int collumnTweets = 0;
        while(sc.hasNext()) {
            tweets[collumnTweets] = sc.nextLine().replace("PDT 2009", "");
            collumnTweets++;
        }

        for(int collumn = 0; collumn < tweets.length; collumn++) {
            int firstCommaIndex = tweets[collumn].indexOf(",");

            if (firstCommaIndex != -1) {
                int secondCommaIndex = tweets[collumn].indexOf(",", firstCommaIndex + 1);

                if (secondCommaIndex != -1) {
                    tweetsUp[0][collumn] = tweets[collumn].substring(0, firstCommaIndex);
                    tweetsUp[1][collumn] = tweets[collumn].substring(firstCommaIndex + 1, secondCommaIndex);
                    tweetsUp[2][collumn] = tweets[collumn].substring(secondCommaIndex + 1);
                }
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        randomTweet m = new randomTweet();
    }
}
