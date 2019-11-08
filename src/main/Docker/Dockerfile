# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM java:8

COPY Pru_UD_public_bin.key Pru_UD_public_bin.key 

MAINTAINER Nebrass Lamouchi, nebrass.fr
 
ADD RestRegistraduria.jar /app.jar
 
EXPOSE 9090:9090
 
CMD java -jar app.jar --spring.profiles.active=dev
