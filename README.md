# springBootCloudClient
Demo project spring  cloud client

#Soring cloude server 
The Spring Clod server should be running before starting client for accessing all the configuration availabe provided 
at git location in application.yml file of the server.

Once the server and client are running try to hit http://localhost:8080/rate
depending on the appllication name in application properties of client, data will be shown on from the server files.
For eg for now,
#application.properties
spring.application.name= s1rates

s1rates of the server files will be in scope and same rates will be returned.

#bootstrap.properties 
defines the configurstion server details.
Also defines the encryption key defined for server. As data will be coming in encrypted format and same will be decrypted at cleint with 
encrypt.key for security purpose.






