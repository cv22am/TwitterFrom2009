# TwitterFrom2009
 
This fun project shows what twitter.com was like in 2009.

<img width="1435" alt="Screen Shot 2024-03-12 at 4 16 54 PM" src="https://github.com/cv22am/TwitterFrom2009/assets/144548718/0e3d6ea9-5e26-4444-b56d-80405fc7eabc">

This is project was made as a java web app using springboot and vaadin framworks. 
It takes and parses a cvs file (the twitter database holding one million tweets) into a single array, that array is then passed through functions which convert it into a two-dimensional array.

![2DArray](https://github.com/cv22am/TwitterFrom2009/assets/144548718/f9f7b6b8-2ed0-4ef1-9e76-a5add351bff7)


The two demensional array works like the images above. Each collumn holds a different tweet id, and each row underneath that id holds that unique tweets data such as the date, time, user, and text. 

When the button on the website is clicked, it randomize the output of the 2d array and displays it on the screen. 

<img width="1440" alt="Screen Shot 2024-03-12 at 4 22 33 PM" src="https://github.com/cv22am/TwitterFrom2009/assets/144548718/96268ac8-0b56-4fee-9b18-348de2811870">


While the website is not publicly available, it can be run by cloning it from github, and downloading the twitter database from here 
https://brocku-my.sharepoint.com/:x:/g/personal/cv22am_brocku_ca/EU8Av22e4KdOgCcE2jcrgNoBj2YIdDJjY5pgIv0vqDBDag?e=5FEsR2

It can be run by launch the code in /src/main/java/com/randomTweet.java

